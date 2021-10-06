package com.arankin.ProductAndCategory.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arankin.ProductAndCategory.Models.Product;
import com.arankin.ProductAndCategory.Models.Category;
import com.arankin.ProductAndCategory.Models.CategoryProduct;
import com.arankin.ProductAndCategory.Repositories.ProductRepository;
import com.arankin.ProductAndCategory.Repositories.CatProdRepository;
import com.arankin.ProductAndCategory.Repositories.CategoryRepository;


@Service
public class ProductAndCategoryServices {
	@Autowired
	private  final ProductRepository prodRepos;	
	@Autowired
	private  final CategoryRepository catRepos;	
	@Autowired
	private  final CatProdRepository pcRepos;

	public ProductAndCategoryServices(ProductRepository prodRepos, CategoryRepository catRepos, CatProdRepository pcRepos) {
		this.prodRepos = prodRepos;
		this.catRepos = catRepos;
		this.pcRepos = pcRepos;
	}
	
	//--------------------
	//Product Services
	
	public Product createProduct (Product p) {
	return this.prodRepos.save(p);
    }	
	
	public Product getProduct(Long id) {
		Product prod = this.prodRepos.findById(id).orElse(null);
		return prod;		
	}
	
	public List<Product> productList() {
		return this.prodRepos.findAll();
	}
	

	
	//--------------------
	//Category Services
	
	public Category createCategory(Category c) {
	return this.catRepos.save(c);
    }	
	
	public Category getCategory(Long id) {
		 Category cat = this.catRepos.findById(id).orElse(null);
		 return cat;
	}
	public List<Category> categoryList() {
		return this.catRepos.findAll();
	}
	

		
	
	//-------------------------
	//CategoryProduct Services
	
	public List<Category> findNewCategories(Product p) {		
		return this.catRepos.findByproductsNotContaining(p);
	}
	
	public List<Product> findNewProducts(Category c) {
		return this.prodRepos.findByCategoriesNotContaining(c);
	}
	
	public void addCategory(Category c, Product prod) {	
		//Get array list from Product class
		List<Category> category = prod.getCategories();
		//Add category to the list
		category.add(c);
		//Update database
		this.prodRepos.save(prod);
	}
	
	public void addProduct(Category cat, Product p) {	
		//Get array list from Category class
		List<Product> prod = cat.getProducts();
		//Add product to the list
		prod.add(p);
		//Update database
		this.catRepos.save(cat);
	}
	
	public void deleteCategory(Category c, Product prod) {	
		//Get array list from Product class
		List<Category> category = prod.getCategories();
		//Add category to the list
		category.remove(c);
		//Update database
		this.prodRepos.save(prod);
	}
	
	public void deleteProduct(Category cat, Product p) {	
		//Get array list from Category class
		List<Product> prod = cat.getProducts();
		//Add product to the list
		prod.remove(p);
		//Update database
		this.catRepos.save(cat);
	}

	public CategoryProduct createCategoryProduct(CategoryProduct pc) {
		return this.pcRepos.save(pc);
	}
}// ProductAndCategoryServices