package com.arankin.ProductAndCategory.Repositories;

import java.util.List;

//import org.springframework.stereotype.Service;
import com.arankin.ProductAndCategory.Models.*;
import org.springframework.data.repository.CrudRepository;
import com.arankin.ProductAndCategory.Models.CategoryProduct;


public interface CatProdRepository extends CrudRepository <CategoryProduct, Long> {
	List<CategoryProduct> findAll();
}//CatProdRepository
