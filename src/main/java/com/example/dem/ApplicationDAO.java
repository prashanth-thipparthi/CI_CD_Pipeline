package com.example.dem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ApplicationDAO extends JpaRepository<Application, Integer> {
	
	public List<Application> findByApplicationId(Integer id);
}
