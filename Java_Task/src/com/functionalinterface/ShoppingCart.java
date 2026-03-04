//package com.functionalinterface;
//
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//class Product{
//	int id;
//	String name;
//	double price;
//	Product(int id,String name,double price){
//		this.id=id;
//		this.name=name;
//		this.price=price;
//		}
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
//	}
//	
//}
//
//public class ShoppingCart {
//
//	public static void main(String[] args) {
//		Product p1=new Product(1,"laptop",50000);
//		Product p2=new Product(2,"mobile",25000);
//		Product p3=new Product(3,"headset",5000);
//		Product[] products= {p1,p2,p3};
//		Predicate<Product>highPrice=p->p.price>20000;
//		Predicate<Product>mediumPrice=p->p.price>10000&&p.price<=20000;
//		
//		Consumer<Product>discount1=p->p.price=p.price-(p.price*0.15);
//		Consumer<Product>discount2=p->p.price=p.price-(p.price*0.10);
//		
//		Function<Product,Double>finalPrice=p->p.price;
//		double total=0;
//		for(Product p:products) {
//			if(highPrice.test(p)) {
//				discount1.accept(p);
//			}
//			else if(mediumPrice.test(p)) {
//				discount2.accept(p);
//			}
//			System.out.println(p);
//			total+=finalPrice.apply(p);
//		}
//		System.out.println("total cart value: "+total);
//		
//		
//
//	}
//
//}
