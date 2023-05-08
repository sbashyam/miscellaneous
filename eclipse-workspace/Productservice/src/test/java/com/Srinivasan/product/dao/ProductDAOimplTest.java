package com.Srinivasan.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Srinivasan.product.dto.Product;

public class ProductDAOimplTest {

	@Test
	public void createShouldCreateProduct() {
    ProductDAO dao= new ProductDAOimpl();
    Product product = new Product();
	product.setId(1);
	product.setName("Book");
	product.setDesc("Nice");
	product.setPrice(5000);
    dao.create(product);
	Product result=dao.read(1);
	assertNotNull(result);
	assertEquals("Book",result.getName());
	
	
	}

}
