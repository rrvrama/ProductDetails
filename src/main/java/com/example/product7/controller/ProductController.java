package com.example.product7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.product7.entity.Product;
import com.example.product7.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {

		return service.saveProduct(product);
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {

		return service.saveProducts(products);
	}

	@GetMapping("/AllProducts")
	public List<Product> findAllProducts(){

		return service.getProducts();
	}
	@GetMapping("/findById/{id}")
	public Product findProductById(@PathVariable int id){

		return service.getProductById(id);
	}

	@DeleteMapping("/deleteById/{Id}")
	public String deleteProduct(@PathVariable int id) {

		return " ram remove product"+id;


	}
	@PutMapping("/updateProduct")
	public Product changeProduct(@RequestBody Product product) {
		
		return service.updateProduct(product);
	}

}
