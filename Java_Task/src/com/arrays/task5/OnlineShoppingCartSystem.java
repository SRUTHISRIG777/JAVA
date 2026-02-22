package com.arrays.task5;

import java.util.Arrays;

class CartItem{
	int itemId;
	String itemName;
	double [] pricesFromSellers;
	public CartItem(int itemId, String itemName, double[] pricesFromSellers) {
		
		this.itemId = itemId;
		this.itemName = itemName;
		this.pricesFromSellers = pricesFromSellers;
	}
	public double getLowestPrice() {
		double min=Integer.MAX_VALUE;
		for(double i:pricesFromSellers) {
			if(i<min) {
				min=i;
				
			}
		}
		return min;
	}
	
	
	
}
class ShoppingCart  {
	CartItem[] items;
	public ShoppingCart(CartItem[] items) {
		
		this.items = items;
	}
	public void displayCart() {
		for(CartItem c:items) {
			System.out.println("item id: "+c.itemId);
			System.out.println("item name: "+c.itemName);
			System.out.println("lowest price: "+c.getLowestPrice());
			
		}
		
	}
	 public double calculateTotalCost() {
	        double total = 0;

	        for (CartItem item : items) {
	            total += item.getLowestPrice();
	        }

	        return total;
	    }
	}
	
	
public class OnlineShoppingCartSystem {

	public static void main(String[] args) {
		CartItem c1=new CartItem(1,"dress",new double[] {500,450,320});
		CartItem c2=new CartItem(2,"laptop",new double[] {50000,45000,65000});
		CartItem c3=new CartItem(3,"mobile",new double[] {1500,20000,32000});
		CartItem[] c= {c1,c2,c3};
		ShoppingCart s=new ShoppingCart(c);
		s.displayCart();
		
		System.out.println("total cost: "+s.calculateTotalCost());
		
		
		
		
		

	}

}
