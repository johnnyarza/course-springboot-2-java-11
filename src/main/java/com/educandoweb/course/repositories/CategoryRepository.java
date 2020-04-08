package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{ 
	//neste caso nao precisa registar no spring pq a classe já herda de JpaRepository

}
