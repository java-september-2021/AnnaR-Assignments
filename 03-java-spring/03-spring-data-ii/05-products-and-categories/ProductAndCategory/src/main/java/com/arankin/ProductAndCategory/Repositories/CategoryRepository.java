package com.arankin.ProductAndCategory.Repositories;

import java.util.List;
import com.arankin.ProductAndCategory.Models.Category;
import com.arankin.ProductAndCategory.Models.Product;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository <Category, Long> {
	List<Category> findAll();
	List<Category> findAllByProducts(Product product);
	List<Category> findByproductsNotContaining(Product product);	
}//CategoryRepository


