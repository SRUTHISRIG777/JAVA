package com.task.inheritance;
import java.util.Scanner;
class Insurancepolicy1{
	String customerName;
	String policyType;
	private double amount;
	private double approvedAmount;
	String policyStatus;
	Insurancepolicy1(String customerName,String policyType,double amount){
		this.customerName=customerName;
		this.policyType=policyType;
		this.amount=amount;
		System.out.println("policy record has been created.");
	}
	Insurancepolicy1(String customerName,String policyType,double amount,double approvedAmount,String policyStatus){
		this.customerName=customerName;
		this.policyType=policyType;
		this.amount=amount;
		this.policyStatus=policyStatus;
		this.approvedAmount=approvedAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public double getAmount() {
		return amount;
	}
	public double getApprovedAmount() {
		return approvedAmount;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public void setAmount(double amount) {
		if(amount==0) {
			System.out.println("invalid values");
		}
		else {
		this.amount = amount;
		}
	}
	public void setApprovedAmount(double approvedAmount) {
		if(approvedAmount==0) {
			System.out.println("invalid amount");
		}
		else {
		this.approvedAmount = approvedAmount;
		System.out.println("updated successfully");
		
		}
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	
	public String viewSummary() {
		return "customer name:"+this.customerName+"\n"+"policy type:"+this.policyType+"\n"+"policy amount"+this.amount+"\n"+"approved amount:"+this.approvedAmount+"\n"+"policy status:"+this.policyStatus;
	}
	
	
	
}

public class InsurancePolicy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name:");
		String name=sc.nextLine();
		System.out.println("enter policy type:");
		String type=sc.nextLine();
		System.out.println("enter policy amount:");
		double amount=sc.nextDouble();
		sc.nextLine();
		Insurancepolicy1 c1=new Insurancepolicy1(name,type,amount);
		boolean a=true;
		while(a) {
			System.out.println("==========menu=========");
			System.out.println("1. Update Approved Amount");
			System.out.println("2. Change Policy Status");
			System.out.println("3. View Summary");
			System.out.println("4.exit");
			System.out.println("select any option:");
			int option=sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:
				System.out.println("enter amount to update approved amount:");
				double appramount=sc.nextDouble();
				c1.setApprovedAmount(appramount);
				break;
			case 2:
				System.out.println("enter status to change the status:");
				String status=sc.nextLine();
				c1.setPolicyStatus(status);
				break;
			case 3:
				System.out.println(c1.viewSummary());
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
