package com.example.FoodApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodApplication.dto.FoodProduct;

public interface FoodProductRep extends JpaRepository<FoodProduct, Integer> {

}
