package com.summerschool.icecreamshop.product.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.summerschool.icecreamshop.controller.ProductController;
import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.service.ProductService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    ProductService productService;

    @Autowired
    MockMvc mockMvc;

    @Test
    void givenId_WhenFindById_ThenStatusIsOk() throws Exception {

        Integer idProduct = 1;
        Product product = new Product();
        product.setId(idProduct);

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.of(product));

        mockMvc.perform(get("/products/" + idProduct))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id", Matchers.is(idProduct)));
    }

    @Test
    void givenId_WhenFindById_ThenStatusIsNotFound() throws Exception {

        Integer idProduct = -100;

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.empty());

        mockMvc.perform(get("/products/" + idProduct))
                .andExpect(status().isNotFound());
    }

    @Test
    void givenValidProduct_WhenUpdate_ThenStatusIsOk() throws Exception {

        Product product = buildValidProduct();
        Integer idProduct = product.getId();

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.of(product));
        Mockito.when(productService.update(product)).thenReturn(product);

        MockHttpServletRequestBuilder builder = buildMockPatch(idProduct, product);

        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .isOk());
    }

    @Test
    void givenInvalidProduct_WhenUpdate_ThenStatusIsBadRequest() throws Exception {

        Product product = buildValidProduct();
        product.setTitle(null);
        Integer idProduct = product.getId();

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.of(product));
        Mockito.when(productService.update(product)).thenReturn(product);

        MockHttpServletRequestBuilder builder = buildMockPatch(idProduct, product);

        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .isBadRequest());
    }


    @Test
    void givenNotExistingProduct_WhenUpdate_ThenStatusIsNotFound() throws Exception {

        Product product = buildValidProduct();
        Integer idProduct = product.getId();

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.empty());
        Mockito.when(productService.update(product)).thenReturn(product);

        MockHttpServletRequestBuilder builder = buildMockPatch(idProduct, product);

        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .isNotFound());
    }

    @Test
    void givenIdFromPathIsNotEqualWithIdFromProduct_WhenUpdate_ThenStatusIsBadRequest() throws Exception {
        // given id from path != id from product when update

        Product product = buildValidProduct();
        Integer idProduct = product.getId() - 1;

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.empty());
        Mockito.when(productService.update(product)).thenReturn(product);

        MockHttpServletRequestBuilder builder = buildMockPatch(idProduct, product);

        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .isBadRequest());
    }

    private Product buildValidProduct() {
        Product product = new Product();
        product.setId(1);
        product.setTitle("Vanilla ice cream");
        product.setShortDescription("Tasty");
        product.setIngredients("Milk, vanilla extract");
        product.setQuantity(100);
        product.setAlergens("Milk");
        product.setPrice(5.99f);
        product.setCurrency("lei");
        product.setType(Product.Type.ICE_CREAM);
        product.setCategoryId(100);
        return product;
    }

    /**
     * I inspired myself from:
     * https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/http-patch-test.html
     */
    private MockHttpServletRequestBuilder buildMockPatch(Integer idProduct, Product product) throws JsonProcessingException {
        return MockMvcRequestBuilders.patch("/products/" + idProduct)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8")
                .content(objectMapper.writeValueAsString(product));
    }
}
