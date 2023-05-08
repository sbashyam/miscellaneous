package com.Srinivasan.product.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Srinivasan.product.bo.ProductBo;
import com.Srinivasan.product.bo.ProductBoimpl;
import com.Srinivasan.product.dto.Product;

/**
 * Servlet implementation class DisplayDetails
 */
public class DisplayDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	ProductBo bo=new ProductBoimpl();
	Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
	PrintWriter writer = response.getWriter();
	writer.print("Product Details");
	writer.print("Product ID:"+product.getId());
	writer.print("Product Name:"+product.getName());
	writer.print("Product Desc:"+product.getDesc());
	writer.print("Product Price:"+product.getPrice());
	
	
	}

}
