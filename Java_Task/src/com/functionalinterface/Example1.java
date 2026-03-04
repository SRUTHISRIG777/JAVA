//package com.functionalinterface;
//import java.util.function.Consumer;
//import java.util.function.Predicate;
//
//class Product {
//	private int id;
//	private String name;
//	private double price;
//	public Product(int id, String name, double price) {
//	
//		this.id = id;
//		this.name = name;
//		this.price = price;
//	}
//	public int getId() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
//	}
//	
//	
//	
//}
//
//public class Example1 {
//
//	public static void main(String[] args) {
//		//Predicate<Product> p=new Predicate<P>
//		
//		//System.out.println(p);
////		Predicate<Product> check=new Predicate<Product>() {
////			public boolean test(Product pro) {
////				return pro.getPrice()>15000;
////			}
////		};
//		Predicate<Product>check=p->p.getPrice()>0;
////		Consumer<Product> c=new Consumer<Product>() {
////			public void accept(Product pro) {
////				System.out.println(pro);
////			}
////			
////		};
//		Consumer<Product>c=p->System.out.println(p);
//		Product p1=new Product(1,"laptop",50000);
//		Product p2=new Product(2,"mobile",10000);
//		Product p3=new Product(3,"headset",5000);
//		Product []p= {p1,p2,p3};
//		for(Product pro:p) {
//			if(check.test(pro)) {
//				pro.setPrice(pro.getPrice()-(pro.getPrice()*(0.20)));
//				c.accept(pro);
//			}
//		}
//		
//
//	}
//
//}
