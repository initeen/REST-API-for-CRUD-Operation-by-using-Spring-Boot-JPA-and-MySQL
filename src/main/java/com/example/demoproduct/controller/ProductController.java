package com.example.demoproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproduct.entities.Product;
import com.example.demoproduct.repos.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository respos;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getHello() {
		return "Hello Web service";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<Product> getAllProduct() {
		return respos.findAll();
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {
		return respos.findById(id).get();
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return respos.save(product);
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {

		respos.deleteById(id);
	}

	@RequestMapping(value = "/product", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return respos.save(product);
	}

}
