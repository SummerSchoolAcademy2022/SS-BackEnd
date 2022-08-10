package com.summerschool.icecreamshop.product.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.summerschool.icecreamshop.controller.ProductController;
import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.model.ProductType;
import com.summerschool.icecreamshop.repository.ProductRepository;
import com.summerschool.icecreamshop.service.ProductService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductController.class)
@AutoConfigureMockMvc
class ProductControllerTest {

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    ProductService productService;

    @MockBean
    ProductRepository productRepository;

    @Autowired
    MockMvc mockMvc;

    private Product validProduct;

    @BeforeEach
    private void setUp() {
        validProduct = new Product();
        validProduct.setId(1L);
        validProduct.setTitle("Vanilla ice cream");
        validProduct.setShortDescription("Tasty");
        validProduct.setIngredients("Milk, vanilla extract");
        validProduct.setQuantity(100);
        validProduct.setAlergens("Milk");
        validProduct.setPrice(5.99f);
        validProduct.setCurrency("lei");
        validProduct.setType(ProductType.ICE_CREAM);
    }

    @Test
    void givenId_WhenFindById_ThenStatusIsOk() throws Exception {

        Long idProduct = validProduct.getId();

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.of(validProduct));

        mockMvc.perform(get("/products/" + idProduct))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id", Matchers.is(idProduct), Long.class));
    }

    @Test
    void givenId_WhenFindById_ThenStatusIsOk2() throws Exception {

        Long idProduct = validProduct.getId();

        Mockito.when(productRepository.findById(idProduct)).thenReturn(Optional.of(validProduct));

        //ProductDTO productDTO = productService.findById(idProduct).get().convertToProductDto();

        mockMvc.perform(get("/products/" + idProduct))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id", Matchers.is(idProduct), Long.class));
    }

    @Test
    void givenId_WhenFindById_ThenStatusIsNotFound() throws Exception {

        Long idProduct = -100L;

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.empty());

        mockMvc.perform(get("/products/" + idProduct))
                .andExpect(status().isNotFound());
    }

    @Test
    void givenValidProduct_WhenUpdate_ThenStatusIsOk() throws Exception {

        Long idProduct = validProduct.getId();

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.of(validProduct));
        Mockito.when(productService.update(validProduct, idProduct)).thenReturn(validProduct);

        MockHttpServletRequestBuilder builder = buildMockPatch(idProduct, validProduct);

        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .isOk());
    }

    @Test
    void givenInvalidProduct_WhenUpdate_ThenStatusIsBadRequest() throws Exception {

        validProduct.setTitle(null);
        Long idProduct = validProduct.getId();

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.of(validProduct));
        Mockito.when(productService.update(validProduct, idProduct)).thenReturn(validProduct);

        MockHttpServletRequestBuilder builder = buildMockPatch(idProduct, validProduct);

        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .isBadRequest());
    }


    @Test
    void givenNotExistingProduct_WhenUpdate_ThenStatusIsNotFound() throws Exception {

        Long idProduct = validProduct.getId();

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.empty());
        Mockito.when(productService.update(validProduct, idProduct)).thenReturn(validProduct);

        MockHttpServletRequestBuilder builder = buildMockPatch(idProduct, validProduct);

        this.mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status()
                        .isNotFound());
    }

    /**
     * I inspired myself from:
     * https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/http-patch-test.html
     */
    private MockHttpServletRequestBuilder buildMockPatch(Long idProduct, Product product) throws JsonProcessingException {
        return MockMvcRequestBuilders.patch("/products/" + idProduct)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8")
                .content(objectMapper.writeValueAsString(product));
    }
}
