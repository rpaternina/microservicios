package com.robert.products_service.controllers;


import com.robert.products_service.model.dtos.ProductRequest;
import com.robert.products_service.model.dtos.ProductResponse;
import com.robert.products_service.model.entities.Product;
import com.robert.products_service.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
// Esta dependencia es lo mismo que un constructor con parametros
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    //retornara un http creado si es creado el producto
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody ProductRequest productRequest){
        this.productService.addProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return this.productService.getAllProducts();
    }
}
