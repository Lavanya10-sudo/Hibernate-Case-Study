package com.jsp.hibernate.casestudydao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.casestudyentity.Cart;
import com.jsp.hibernate.casestudyentity.Product;

public class CartDao {
	Configuration cfg=new Configuration().configure().addAnnotatedClass(Cart.class);
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	Scanner sc=new Scanner(System.in);

	//method to add an element
	public void addCart()
	{
		Session session=sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		System.out.println("Enter the Cart Id");
		int cid=sc.nextInt();
	    Cart cart=new Cart();
		cart.setCartId(cid);
		session.save(cart);
		transaction.commit();
		session.close();
	}

	//method to get a record
	public void getCartById()
	{
		Session session=sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		System.out.println("Enter the Cart Id");
		int cid=sc.nextInt();
		Cart cart=session.load(Cart.class,cid);
		System.out.println(cart);
		transaction.commit();
		session.close();
	}

	//get all records
	public void getAllCart()
	{
		Session session=sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		Query query = session.createQuery("from Cart");
		List<Cart> list = query.list();
		for(Cart c:list)
		{
			System.out.println(c);
		}
		transaction.commit();
		session.close();
	}

	//update a record
	public void updateCart()
	{
		Session session=sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		System.out.println("Enter the Cart Id for Updation");
		int cid=sc.nextInt();
		Cart cart=session.get(Cart.class,cid);
		if(cart!=null)
		{
			System.out.println("Enter the New Cart Id");
			int newCid=sc.nextInt();
			cart.setCartId(newCid);

		}
		else
		{
			System.out.println("Invalid Cart id");
		}
		session.update(cart);
		transaction.commit();
		session.close();
	}

	//delete a record
	public void deleteCart()
	{
		Session session=sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		System.out.println("Enter the Cart Id");
		int cid=sc.nextInt();
		Cart cart=session.get(Cart.class,cid);
		if(cart!=null)
		{
			session.delete(cart);
		}
		else {
			System.out.println("Invalid Cart id");
		}
		transaction.commit();
		session.close();
	}
	
	public List<Product> getAllProductsIntoCart()
	{
		Session session=sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		Query query=session.createQuery("from Product");
		List<Product> products=query.getResultList();
		Cart c=new Cart();
		
		trans.commit();
		session.close();
		
		return products;
	} 
	
	
}


