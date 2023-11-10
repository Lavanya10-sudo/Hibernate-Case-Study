package com.jsp.hibernate.casestudydao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jsp.hibernate.casestudyentity.Cart;
import com.jsp.hibernate.casestudyentity.Product;

public class ProductDao {
	Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Cart.class);
	SessionFactory sf=cfg.buildSessionFactory();
//	public void addProduct()
//	{
//		Product p=new Product();
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the productid:");
//		p.setProductId(scan.nextInt());
//		System.out.println("Enter the productname:");
//		p.setProductName(scan.next());
//		System.out.println("Enter the productprice:");
//		p.setProductPrice(scan.nextDouble());
//		System.out.println("Enter the productquantity:");
//		p.setProductQuantity(scan.nextInt());
//
//		Session session=sf.openSession();
//		Transaction trans=session.beginTransaction();
//		session.save(p);
//		trans.commit();
//		session.close();
//		
//	}
//	public void getProductById()
//	{
//		Session session=sf.openSession();
//		Transaction trans=session.beginTransaction();
//		Product product = session.get(Product.class, 104);
//		System.out.println(product);
//		trans.commit();
//		session.close();	
//	}
//	
//	public void getAllProduct() {
//		Session session=sf.openSession();
//		Transaction trans=session.beginTransaction();
//		Query<Product> query = session.createQuery("from Product");
//		List<Product> product=query.list();
//		for(Product p:product) {
//			System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+" "+p.getProductQuantity());
//		}
//		session.save(product);
//		session.close();
//		trans.commit();
//	}
//	
//	public void updateProduct() {
//		Scanner sc=new Scanner(System.in);
//		Session session=sf.openSession();
//		Transaction trans = session.beginTransaction();
//		System.out.println("Enter the productid:");
//		int id=sc.nextInt();
//		System.out.println("Enter the productname:");
//		String Name = sc.next();
//		System.out.println("Enter the productprice:");
//		Double Price=sc.nextDouble();
//		System.out.println("Enter the productquantity:");
//		int quantity=sc.nextInt();
//		Product product = session.get(Product.class, id);
//		if(product!=null)
//		{
//			product.setProductName(Name);
//			product.setProductPrice(Price);
//			product.setProductQuantity(quantity);
//		}
//
//		else {
//			System.out.println("Product of id"+id+"not found");
//		}
//		session.update(product);
//		trans.commit();
//		session.close();
//
//	}
//	public void deleteProduct() {
//		Scanner sc=new Scanner(System.in);
//		Session session=sf.openSession();
//		Transaction trans = session.beginTransaction();
//		System.out.println("Enter the productid:");
//		int id=sc.nextInt();
//		Product product = session.get(Product.class, id);
//		session.delete(product);
//		trans.commit();
//		session.close();
//
//
//
//	}
//}


		public String addProduct(Product product)
		{
			Session session=sf.openSession();
			Transaction trans = session.beginTransaction();
			session.save(product);
			trans.commit();
			session.close();
			
			return "Product saved successfully";
		}
		public Product getProductById(int id)
		{
			return null;
		}
		public List<Product> getAllProducts()
		{
			Session session=sf.openSession();
			Transaction trans = session.beginTransaction();
			Query query=session.createQuery("from Product");
			List<Product> products=query.getResultList();
			trans.commit();
			session.close();
			
			return products;
		} 
		public String updateProduct(Product product)
		{
			Session session=sf.openSession();
			Transaction trans = session.beginTransaction();
			session.update(product);
			trans.commit();
			session.close();
			return "Product updated successfully";
		}
		public String deleteProduct(Product product)
		{
			Session session=sf.openSession();
			Transaction trans = session.beginTransaction();
			session.delete(product);
			trans.commit();
			session.close();
			return "Product deleted successfully";			
		}
}


