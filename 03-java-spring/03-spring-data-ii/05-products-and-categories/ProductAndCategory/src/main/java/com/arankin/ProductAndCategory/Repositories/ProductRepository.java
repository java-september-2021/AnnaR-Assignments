package com.arankin.ProductAndCategory.Repositories;

import java.util.List;
import com.arankin.ProductAndCategory.Models.Product;
import com.arankin.ProductAndCategory.Models.Category;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Long> {
	List<Product> findAll();			
	List<Product> findByCategoriesNotContaining(Category c);	
	List<Product> findAllByCategories(Category c);
}//ProductRepository
