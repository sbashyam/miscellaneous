package com.Srinivasan.product.bo;

import com.Srinivasan.product.dto.Product;

public interface ProductBo {
void create(Product product);
Product findProduct(int id);
}
