package com.example.FoodApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodApplication.dto.FoodOrder;

public interface FoodOrderRep extends JpaRepository<FoodOrder, Integer>{

}
