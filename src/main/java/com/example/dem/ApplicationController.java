package com.example.dem;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//  
@ComponentScan("com.example.dao")
//@EntityScan("com.example.dao")
//@EnableJpaRepositories("com.example.dao")
public class ApplicationController {

	/*
	 * This Application Controller contains handling REST APIs focused on
	 * dealing with queries on the Application table in the database.
	 */
	
	@Autowired
	ApplicationDAO dao;
		
	@RequestMapping("/application")
	public List<Application> getApplication() 
	{
		//return null;
		List<Application> apps = dao.findByApplicationId(2);
		return apps;
		//return dao.findAll();
		
	}
}
