package com.Srinivasan.product.dao;

import com.Srinivasan.product.dto.Product;

public interface ProductDAO {
void create(Product product);
Product read(int id);
void update(Product product);
void Delete();
}
