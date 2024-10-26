package com.robert.products_service.services;


import com.robert.products_service.model.dtos.ProductRequest;
import com.robert.products_service.model.dtos.ProductResponse;
import com.robert.products_service.model.entities.Product;
import com.robert.products_service.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    // Inyectamos ProductRepository
    private final ProductRepository productRepository;

    // Metodo para agregar productos
    public void addProduct(ProductRequest productRequest){
        var product = Product.builder()
                .sku(productRequest.getSku())
                .name(productRequest.getName())
                .description((productRequest.getDescription()))
                .price(productRequest.getPrice())
                .status(productRequest.getStatus())
                .build();

        // Guardo el producto creado
        productRepository.save(product);
        log.info("Product added: {}", product);
    }

    // Obtener todos los productos
    public List<ProductResponse> getAllProducts(){
        var products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .sku(product.getSku())
                .name(product.getName())
                .description((product.getDescription()))
                .price(product.getPrice())
                .status(product.getStatus())
                .build();
    }
}
