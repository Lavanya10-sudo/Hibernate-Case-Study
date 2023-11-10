package com.jsp.hibernate.casestudyentity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	private int CartId;
	@OneToMany
	private List<Product> plist=new ArrayList();

	public List<Product> getPlist() {
		return plist;
	}

	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}

	public int getCartId() {
		return CartId;
	}

	public void setCartId(int cartId) {
		CartId = cartId;
	}

	@Override
	public String toString() {
		return "Cart [CartId=" + CartId + ", plist=" + plist + "]";
	}
	
	

}
