package com.example.FoodApplication.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.FoodApplication.dto.Menu;
import com.example.FoodApplication.repository.MenuRep;

@Repository
public class MenuDAO {
	@Autowired
	MenuRep menuRep;
	
	//all
	public List<Menu> findAllMenu(){
		return menuRep.findAll();
	}
	
}
