package org.example.safebitebackend.service;

import org.example.safebitebackend.DTO.FoodResponse;
import org.example.safebitebackend.domain.FoodEntity;
import org.example.safebitebackend.mapper.ProductMapper;
import org.example.safebitebackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public FoodResponse getProductById(Long id) {

        FoodEntity food = productRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Food product not found"));

        return ProductMapper.mapToFoodResponse(food);
    }
}