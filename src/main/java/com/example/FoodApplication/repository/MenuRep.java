package com.example.FoodApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodApplication.dto.Menu;

public interface MenuRep extends JpaRepository<Menu, Integer> {

}
