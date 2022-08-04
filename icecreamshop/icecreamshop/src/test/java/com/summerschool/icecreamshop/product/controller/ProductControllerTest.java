package com.summerschool.icecreamshop.product.controller;

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
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @MockBean
    ProductService productService;

    @Autowired
    MockMvc mockMvc;

    @Test
    void givenIdWhenFindByIdThenStatusIsOk() throws Exception {

        Integer idProduct = 1;
        Product product = new Product();
        product.setId(idProduct);

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.of(product));

        mockMvc.perform(get("/products/"+idProduct))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id", Matchers.is(idProduct)));
    }

    @Test
    void givenIdWhenFindByIdThenStatusIsNotFound() throws Exception {

        Integer idProduct = -100;

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.empty());

        mockMvc.perform(get("/products/"+idProduct))
                .andExpect(status().isNotFound());
    }
}
