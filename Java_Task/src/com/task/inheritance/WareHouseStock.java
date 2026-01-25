package com.task.inheritance;

import java.util.Scanner;

class StockHandler{
	String handlerName;
	int handlerID;
	public StockHandler(String handlerName, int handlerID) {
		super();
		this.handlerName = handlerName;
		this.handlerID = handlerID;
	}
	
}
class StockPerformance extends StockHandler{
	 private int totalStock;
	    private int entryCount;
	    private double averageStock;
	    private String grade;

	    public StockPerformance(String handlerName, int handlerID) {
	        super(handlerName, handlerID);
	        System.out.println("Stock Performance Profile Created");
	    }
	    public void addStock(int quantity) {
	    	if(quantity<=0) {
	    		System.out.println("please enter valid value");
	    	}
	    	else {
	    		totalStock+=quantity;
	    		entryCount++;
	    		System.out.println("stock is added successfully");
	    	}
	    }
	    public void calculatePerformance() {
	    	if(entryCount==0) {
	    		System.out.println("no stock enteries to calculate");
	    		return;
	    	}
	    	averageStock=(double)totalStock/entryCount;
	    	if(averageStock>=50) {
	    		grade="efficeint";
	    	}
	    	else if(averageStock>=30) {
	    		grade="average";
	    	}
	    	else {
	    		grade="poor";
	    	}
	    }
	    public void viewSummary() {
	        System.out.println("Stock Performance Summary");
	        System.out.println("Handler Name: " + handlerName);
	        System.out.println("Handler ID: " + handlerID);
	        System.out.println("Total Stock Handled: " + totalStock);
	        System.out.println("Average Stock Per Entry: " + averageStock);
	        System.out.println("Handling Grade: " + grade);
	    }
	    
}

public class WareHouseStock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter handler name:");
		String name=sc.nextLine();
		System.out.println("enter handler id:");
		int id=sc.nextInt();
		StockPerformance s1=new StockPerformance(name,id);
		boolean a=true;
		while(a) {
			System.out.println("============menu=============");
			System.out.println("1.add stock");
			System.out.println("2.recalculate result");
			System.out.println("3.view summary");
			System.out.println("4.exit");
			System.out.println("enter any option:");
			int option=sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:
				System.out.println("enter stock quantity:");
				int q=sc.nextInt();
				s1.addStock(q);
				break;
			case 2:
				s1.calculatePerformance();
				break;
			case 3:
				s1.viewSummary();
				break;
			case 4:
				a=false;
				System.out.println("thank you");
				break;
			default:
				System.out.println("enter valid option");
			}
		}
		

	}

}
