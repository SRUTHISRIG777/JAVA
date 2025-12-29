package com.oops.inheritance;

public class Laptop extends Computer {
	void showModel() {
		System.out.println("model: XPS 15");
	}

	public static void main(String[] args) {
		Laptop c=new Laptop();
		c.showBrand();
		c.showModel();

	}

}
