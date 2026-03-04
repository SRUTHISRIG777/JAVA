//package com.functionalinterface;
//
//import java.util.Random;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;
//
//class Item{
//	private int itemId;
//	private String itemName;
//	private double rate;
//	private int quantity;
//	private String category;
//	public Item(int itemId, String itemName, double rate, int quantity, String category) {
//		
//		this.itemId = itemId;
//		this.itemName = itemName;
//		this.rate = rate;
//		this.quantity = quantity;
//		this.category = category;
//	}
//	public int getItemId() {
//		return itemId;
//	}
//	public void setItemId(int itemId) {
//		this.itemId = itemId;
//	}
//	public String getItemName() {
//		return itemName;
//	}
//	public void setItemName(String itemName) {
//		this.itemName = itemName;
//	}
//	public double getRate() {
//		return rate;
//	}
//	public void setRate(double rate) {
//		this.rate = rate;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public String getCategory() {
//		return category;
//	}
//	public void setCategory(String category) {
//		this.category = category;
//	}
//	
//}
//
//public class SuperMarketApp {
//
//	public static void main(String[] args) {
//		Item i1=new Item(101,"rice",50,5,"grocery");
//		Item i2=new Item(102,"Oil",100,2,"grocey");
//		Item i3=new Item(103,"milk",25,3,"Dairy");
//		Item[] items= {i1,i2,i3};
//		
//		Predicate<Item> checkStock=new Predicate<Item>(){
//			
//			public boolean test(Item i) {
//				return i.getQuantity()>0;
//			}
//			
//		};
//		
//		
//		Function<Item,Double> calculateTotal=new Function<Item,Double>(){
//			
//			public Double apply(Item i) {
//				return i.getRate()*i.getQuantity();
//			}
//			
//		};
//		
//		Supplier<String> generateBill=new Supplier<String>() {
//			public String get() {
//				return "bill- "+new Random().nextInt(1000);
//			}
//			
//		};
//		
//		Consumer<Item> printItem=new Consumer<Item>() {
//			public void accept(Item i) {
//				System.out.println("--------------------------------");
//				System.out.println("item id: "+i.getItemId());
//				System.out.println("item name: "+i.getItemName());
//				System.out.println("rate: "+i.getRate());
//				System.out.println("quantity: "+i.getQuantity());
//				
//			}
//		};
//		
//		double total=0;
//		System.out.println("bill no: "+generateBill.get());
//		for(Item i:items) {
//			if(checkStock.test(i)) {
//				printItem.accept(i);
//				double itemTotal=calculateTotal.apply(i);
//				System.out.println("item total: "+itemTotal);
//				total+=itemTotal;
//			}
//			else {
//				System.out.println(i.getItemName()+" is out of stock");
//			}
//		}
//		System.out.println("============================");
//		System.out.println("grand total: "+total);
//
//	}
//
//}
