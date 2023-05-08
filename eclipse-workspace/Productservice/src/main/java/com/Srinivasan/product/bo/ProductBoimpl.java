package com.Srinivasan.product.bo;

import com.Srinivasan.product.dao.ProductDAO;
import com.Srinivasan.product.dto.Product;

public class ProductBoimpl implements ProductBo {
   private static ProductDAO dao=new ProductDAO() {
	
	@Override
	public void update(Product product) {
		dao.create(product);
	}
	
	@Override
	public Product read(int id) {
		return dao.read(id);
	}
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void Delete() {
		// TODO Auto-generated method stub
		
	}
};
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
