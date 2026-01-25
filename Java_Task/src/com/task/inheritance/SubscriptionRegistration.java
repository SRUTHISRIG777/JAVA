package com.task.inheritance;

import java.util.Scanner;

class SubscriptionPlan{
	String subscriberName;
	String planType;
	double planCost;
	double paidAmount;
	String status;
	public SubscriptionPlan(String subscriberName,String planType) {
		this.subscriberName=subscriberName;
		this.planType=planType;
	}
	public SubscriptionPlan(String subscriberName, String planType, double planCost, double paidAmount, String status) {
		
		this.subscriberName = subscriberName;
		this.planType = planType;
		this.planCost = planCost;
		this.paidAmount = paidAmount;
		this.status = status;
		System.out.println("profile is created successfully");
	}
	public void updatePayment(double amount) {
		if(amount>0&& amount>=planCost) {
			paidAmount=amount;
		}
		else {
			System.out.println("please enter valid amount");
		}
	}
	public void updateStatus(String stat) {
		if(stat==null||stat.equals(" ")) {
			System.out.println("please enter valid status");
		}
		else {
			status=stat;
		}
	}
	public void ViewSummary()
	{
		System.out.println("Subscription Summary");
		System.out.println("Subscribe:"+subscriberName);
		System.out.println("Plan Type:"+planType);
		System.out.println("Plan Cos:"+planCost);
		System.out.println("Paid Amount:"+paidAmount);
		System.out.println("Subscription Status:"+status);
	}
	
	
}


public class SubscriptionRegistration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter subscriber name:");
		String name=sc.nextLine();
		System.out.println("enter plantype:");
		String type=sc.nextLine();
		SubscriptionPlan s1=new SubscriptionPlan(name,type);
		boolean a=true;
		while(a) {
			System.out.println("============menu==============");
			System.out.println("1.update payment");
			System.out.println("2.change status");
			System.out.println("3.view summary");
			System.out.println("4.exit");
			System.out.println("enter any option:");
			int option=sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:
				System.out.println("enter amount :");
				double amount=sc.nextDouble();
				s1.updatePayment(amount);
				break;
			case 2:
				System.out.println("enter status:");
				String stat=sc.nextLine();
				s1.updateStatus(stat);
				break;
			case 3:
				s1.ViewSummary();
				break;
			case 4:
				a=false;
				System.out.println("thank you");
				break;
			default:
				System.out.println("please enter valid option");
				
			}
			
		}
		

	}

}
