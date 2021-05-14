package com.eudes.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eudes.dscatalog.entities.Category;
import com.eudes.dscatalog.repositories.CategoryRepository;

@Service // Annotation que registra a classe como parte do sistema de injeção de dependências do sistema
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)	
	public List<Category> findAll() {

		return repository.findAll(); 
	}
 }
