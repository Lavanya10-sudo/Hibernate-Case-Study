package com.jsp.hibernate.casestudy.services;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate.casestudydao.ProductDao;
import com.jsp.hibernate.casestudyentity.Product;

public class ProductServices {

	ProductDao productdao=new ProductDao();
	Scanner scanner=new Scanner(System.in);
	public void addProduct()
	{
		System.out.println("Enter the ProductName:");
		String name=scanner.next();
		System.out.println("Enter the ProductPrice:");
		double price=scanner.nextDouble();
		System.out.println("Enter the ProductQuantity:");
		int quantity=scanner.nextInt();
		Product product=new Product();
		product.setProductName(name);
		product.setProductPrice(price);
		product.setProductQuantity(quantity);

		String message=productdao.addProduct(product);
		System.out.println(message);
	}
	public void getProductById()
	{
		System.out.println("Enter the ProductId :");
		int id=scanner.nextInt();
		Product product = productdao.getProductById(id);
		if(product!=null)
		{
			System.out.println(product.getProductName()+" "+product.getProductPrice()+" "+product.getProductQuantity());
		}
		else {
			System.out.println("Invalid Product Id");
		}
	}
	public void getAllProduct()
	{
		List<Product> list = productdao.getAllProducts();
		if(list!=null)
		{
			for(Product p:list)
			{
				System.out.println(p.getProductName()+" "+p.getProductPrice()+" "+p.getProductQuantity());
			}
		}
		else {
			System.err.println("No producs is present");
		}
	}
	public void updateProduct()
	{
		System.out.println("Enter the ProductId to be updated:");
		int id=scanner.nextInt();
		Product product = productdao.getProductById(id);
		if(product!=null)
		{
			System.out.println(product.getProductName()+" "+product.getProductPrice()+" "+product.getProductQuantity());
			System.out.println("Enter the ProductName:");
			String name=scanner.next();
			System.out.println("Enter the ProductPrice:");
			double price=scanner.nextDouble();
			System.out.println("Enter the ProductQuantity:");
			int quantity=scanner.nextInt();

			product.setProductName(name);
			product.setProductPrice(price);
			product.setProductQuantity(quantity);

			productdao.updateProduct(product);
		}
		else {
			System.out.println("Producy not found with the given Id");
		}
	}
	public void deleteProduct()
	{
		System.out.println("Enter the ProductId to be updated:");
		int id=scanner.nextInt();
		Product product = productdao.getProductById(id);
		if(product!=null)
		{
			productdao.deleteProduct(product);
			System.out.println("Product deleted successfully");
		}
		else {
			System.err.println("Invalid Product Id");
		}

	}


}
