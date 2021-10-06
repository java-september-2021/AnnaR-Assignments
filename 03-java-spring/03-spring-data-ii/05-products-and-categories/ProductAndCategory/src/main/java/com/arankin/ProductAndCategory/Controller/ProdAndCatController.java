package com.arankin.ProductAndCategory.Controller;


import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.arankin.ProductAndCategory.Models.*;
import com.arankin.ProductAndCategory.Services.ProductAndCategoryServices;

@Controller
public class ProdAndCatController {
	
	@Autowired
	private ProductAndCategoryServices services;

	/*=====================================*/
	//Constructor
	/*=====================================*/ 	
	public ProdAndCatController(ProductAndCategoryServices services) {
		this.services = services;
	}	
	
	//-------------------------
	//Product Controllers
	//-------------------------
	
	/*===========================================*/
	//Method: Index() For New Product Page
	/*==========================-================*/	
	@RequestMapping("/products")
	public String Index(@ModelAttribute("product") Product prd) {
		return "/products/NP_index.jsp";
	}

	
	/*====================================================*/
	//Method: prodRenderPage() render Page For New Product
	/*====================================================*/
	@RequestMapping("/products/new")
    public String prodRenderPage(@ModelAttribute("product") Product prd) {
        return "/products/NP_index.jsp";
    }
	
	/*============================================*/
	//Method: NewProduct() Input for New Products
	/*============================================*/ 
    @RequestMapping(value="/products", method=RequestMethod.POST)
	public String NewProduct(@Valid @ModelAttribute("product") Product prd, BindingResult result) {
		if(result.hasErrors() ) {
			return "NP_index.jsp";
		}		

		prd = services.createProduct(prd);
		return "redirect:/products";
	}			
	

	/*==================================================*/
	//Method: Renders Product side of the ProductPage()
	/*==================================================*/ 
	@RequestMapping("/products/{id}")
	public String renderProductPage(@PathVariable("id") Long id, @ModelAttribute("CategoryProduct") Product prd, Model model) {
		Product prod = services.getProduct(id);
		List<Category> newCats = services.findNewCategories(prod);
		model.addAttribute("products", prod);
		model.addAttribute("newCats", newCats);
		return "/products/categoryMapping.jsp";
	}
	
	/*==================================================*/
	//Method: selectCategoryList on Product Page
	/*==================================================*/ 
	@RequestMapping(value="/products/{id}/show", method=RequestMethod.POST)
	public String ProductPage_selectCategory( Product prd,  @PathVariable("id") Long id,  @RequestParam("category") Long cat_id, Model model) {

		Product prod = services.getProduct(id);
		Category cat = services.getCategory(cat_id);	
	    services.addCategory(cat, prod);
		return "redirect:/products/{id}";
	}
	
	
	/*=======================================================*/
	//Method:Renders Category List side of the ProductPage()
	/*=======================================================*/	
	@GetMapping("/products/{id}")
	public String prodMapping( @ModelAttribute("CategoryProduct") CategoryProduct cp, @PathVariable("id") Long id,  Model model) {
		Product currentProd = services.getProduct(id);		
		List<Category> newCats = services.findNewCategories(currentProd);
		System.out.println(newCats);
		model.addAttribute("products", currentProd);
		model.addAttribute("newCats", newCats);
		return "/products/categoryMapping.jsp";
	}

	
	
	//-------------------------------------------
	//         Category Controllers
	//-------------------------------------------
		
	/*========================================*/
	//Method: catIndex() For New Category Page
	/*========================================*/	
	@RequestMapping("/categories")
	public String catIndex(@ModelAttribute("category") Category ct) {
		return "/categories/NC_index.jsp";
	}
	
	

	/*=====================================*/
	//Method: catRenderPage()
	/*=====================================*/ 	
    @RequestMapping("/categories/new")
    public String catRenderPage(@ModelAttribute("category") Category ct) {
        return "/categories/NC_index.jsp";
    }
    
	/*=====================================*/
	//Method:  newCategory()
	/*=====================================*/     
    @RequestMapping(value="/categories", method=RequestMethod.POST)
    public String newCategory(@Valid @ModelAttribute("category") Category ct,  BindingResult result) {
		
        if (result.hasErrors()) {
            return "NC_index.jsp";
        } else {
        	
        	ct = services.createCategory(ct);       	
          return "redirect:/categories";
        }
    }//NewCategory
	
	
	/*====================================================*/
	//Method: Renders Category side of the Category Page
	/*====================================================*/ 
	@RequestMapping("/categories/{id}")
	public String renderCategorPage(@PathVariable("id") Long id,  Model model) {
		Category cat = services.getCategory(id);
		List<Product> newProds = services.findNewProducts(cat);
		model.addAttribute("categories", cat);
		model.addAttribute("newProds", newProds);
		return "/categories/productMapping.jsp";
	}

    
	/*===========================================================*/
	//Method: CategoryPage - handles selection from ProductList
	/*===========================================================*/ 
	@RequestMapping(value="/categories/{id}/show", method=RequestMethod.POST)
	public String CategoryPage_selectProduct( Category ct,  @PathVariable("id") Long id,  @RequestParam("product") Long prd_id, Model model) {
		Category cat = services.getCategory(id);
		Product  prd = services.getProduct(prd_id);	
	    services.addProduct(cat, prd);
		return "redirect:/categories/{id}";
	}

    
	/*==================================================================*/
	//Method: catMapping() Renders Products list side of Category Page
	/*==================================================================*/

	public String catMapping( @ModelAttribute("CategoryProduct") CategoryProduct cp, 
                                                @PathVariable("id") Long id,  Model model) {
		Category currentCat = services.getCategory(id);		
		List<Product> newprods = services.findNewProducts(currentCat);
		System.out.println(newprods);
		model.addAttribute("categories", currentCat);
		model.addAttribute("newprods", newprods);
		return "/categories/productMapping.jsp";
	}
  
     
//	/*=====================================*/
//	//Method: prodWithCategories()
//	/*=====================================*/
//	@RequestMapping("/products/catDisplay")
//	public String prodWithCategories(@ModelAttribute("products") Category ct, Model model) {
//		List<Product> prodList = services.productList();
//		List<Category> catList = services.categoryList();
//		model.addAttribute("ListOfCategories", prodList);
//		
//		return "/products/listOfProductCats.jsp";
//	}
//	
//	/*=====================================*/
//	//Method: catWithProducts()
//	/*=====================================*/
//	@RequestMapping("/categories/prodDisplay")
//	public String catWithProducts(@ModelAttribute("categories") Product p, Model model) {
//		List<Category> catList = services.categoryList();
//		List<Product> prodList = services.productList();
//		model.addAttribute("ListOfProducts", catList);
//		
//		return "/categories/listOfCategoryProd.jsp";
//	}
//	
//
//	
//	
//	/*=====================================*/
//	//Method: CatMapping()- displays on Category Page
//	/*=====================================*/	
//	@RequestMapping(value="/categories/{id}", method=RequestMethod.POST)
//	public String CatMapping( @ModelAttribute("CategoryProduct") CategoryProduct cp, @PathVariable("id") Long id,  Model model, BindingResult result) {
//		Category currentCat = services.getCategory(id);
//		List<Product> newProds = services.findNewProducts(currentCat);
//		System.out.println(newProds);
//		model.addAttribute("categories", currentCat);
//		model.addAttribute("newProds", newProds);
//
//		
//        if (result.hasErrors()) {
//            return "/categories/{id}";
//        } else {
//
//          return "/categories/productMapping.jsp";
//        }
//
//	}
//
//	
//	@RequestMapping(value="/categoryProd/{kind}", method=RequestMethod.POST)
//	public String Create(@Valid @ModelAttribute("CategoryProduct") CategoryProduct cp, BindingResult result, @PathVariable("kind") String kind) {
//		if(result.hasErrors())
//			return String.format("/%s/show.jsp", kind);
//        else{
//        	services.createCategoryProduct(cp);
//		return "redirect:/";
//        }
//	}
//    
//
//	/*=====================================*/
//	//Method:  Show2()
//	/*=====================================*/ 	
//	@RequestMapping("/products/{id}/list")
//	public String Show2(@ModelAttribute("CategoryProduct") CategoryProduct cp, @PathVariable("id") Long id, Model model) {
//		Product prod = services.getProduct(id);
//		List<Category> catList = prod.getCategories();
//		System.out.println("id: "+id + " catlist: " + catList);
//		model.addAttribute("List", catList);
//		return "/products/ProductsCatList.jsp";
//	}
//  
}//ProdAndCatController
