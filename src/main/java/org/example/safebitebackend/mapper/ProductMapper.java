package org.example.safebitebackend.mapper;

import org.example.safebitebackend.DTO.FoodResponse;
import org.example.safebitebackend.domain.FoodEntity;

public class ProductMapper {

    public static FoodResponse mapToFoodResponse(FoodEntity food){

        FoodResponse response = new FoodResponse();

        response.setProductId(food.getProductId());
        response.setBarcode(food.getBarcode());
        response.setName(food.getName());
        response.setBrand(food.getBrand());
        response.setIngredients(food.getIngredients());
        response.setNutritionGrade(food.getNutritionGrade());

        return response;
    }
}