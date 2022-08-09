package com.summerschool.icecreamshop.product.controller;

import com.summerschool.icecreamshop.controller.ProductController;
import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.service.ProductService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductController.class)
@AutoConfigureMockMvc
class ProductControllerTest {

    @MockBean
    ProductService productService;

    @Autowired
    MockMvc mockMvc;

    @Test
    void givenIdWhenFindByIdThenStatusIsOk() throws Exception {

        Long idProduct = 1L;
        Product product = new Product();
        product.setId(Long.valueOf(idProduct));

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.of(product));

        mockMvc.perform(get("/products/"+idProduct))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id", Matchers.is(idProduct)));
    }

    @Test
    void givenIdWhenFindByIdThenStatusIsNotFound() throws Exception {

        Long idProduct = -100L;

        Mockito.when(productService.findById(idProduct)).thenReturn(Optional.empty());

        mockMvc.perform(get("/products/"+idProduct))
                .andExpect(status().isNotFound());
    }
}
