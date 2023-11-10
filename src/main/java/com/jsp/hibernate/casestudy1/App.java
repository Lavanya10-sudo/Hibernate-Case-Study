package com.jsp.hibernate.casestudy1;

import java.util.Scanner;

import com.jsp.hibernate.casestudy.services.ProductServices;
import com.jsp.hibernate.casestudydao.CartDao;
import com.jsp.hibernate.casestudydao.ProductDao;
import com.jsp.hibernate.casestudyentity.Cart;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	System.out.println("Enter:\n"
//                 +"1 to addProduct\n"
//    			 +"2 to get ProductById\n"
//                 +"3 to get All Products\n"
//    			 +"4 to get update product\n"
//                 +"5 to delete product\n"
//    			 +"0 to terminate\n");
//    	Scanner scan =new Scanner(System.in);
//    	int choice=scan.nextInt();
//    	ProductServices productservice=new ProductServices();
//    	switch(choice) {
//    	
//    	case 1: 
//    		productservice.addProduct();
//    		break;
//
//    	case 2:
//    		productservice.getProductById();
//    		break;
//    	case 3:
//    		productservice.getAllProduct();
//    		break;
//    	case 4:
//    		productservice.updateProduct();
//    		break;
//    	case 5:
//    		productservice.deleteProduct();
//    		break;
//    	case 0:
//    		System.out.println("Program Terminated!");
//    	default:
//    		System.out.println("Invalid Input");
//    		break;
//    	}
//    	
    	CartDao cartdao=new CartDao();
    	cartdao.addCart();
    	cartdao.getCartById();
    	cartdao.getAllCart();
    	cartdao.updateCart();
    	cartdao.deleteCart();
    	cartdao.getAllProductsIntoCart();
    	

//    	
//    	Cart c=new Cart();
//    	c.getPlist().add(null)
//    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//     ProductDao pdao=new ProductDao();
//       pdao.addProduct();
//       pdao.getProductById();
//      pdao.getAllProduct();
//       pdao.updateProduct();
//       pdao.deleteProduct();
       
       
        
        
		
		
		
		
		
    }
    
    
}
