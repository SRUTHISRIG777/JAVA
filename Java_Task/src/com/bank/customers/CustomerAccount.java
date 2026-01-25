package com.bank.customers;

public class CustomerAccount {
	private int customerId;
	private String customerName;
	private String email;
	private long phoneNumber;
	private String address;
	private String accountType;
	private double balance;
	private boolean kycStatus;
	CustomerAccount(){
		this(null,0);
	}
	
	public CustomerAccount(String customerName,long phoneNumber){
		this(customerName,phoneNumber,null);
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
	}
	public CustomerAccount(String customerName,long phoneNumber,String accountType){
        this(0,customerName,null,phoneNumber,null,accountType,0,false);
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
		this.accountType=accountType;
		
	}
	public CustomerAccount(int customerId,String customerName,String email,long phoneNumber,String address,String accountType,double balance,boolean kycStatus){
		
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
		this.accountType=accountType;
		this.address=address;
		this.email=email;
		this.customerId=customerId;
		this.balance=balance;
		this.kycStatus=kycStatus;
		System.out.println("Customer Profile Initialized — Status: Pending KYC");
		
		
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		if(customerName==null||customerName.equals("")) {
			System.out.println("please enter valid name");
		}
		else {
		this.customerName = customerName;
		}
	}

	public void setEmail(String email) {
		if(email.contains("@")) {
		this.email = email;
		}
		else {
			System.out.println("enter valid email");
		}
	}

	public void setPhoneNumber(long phoneNumber) {
		int count=0;
		while(phoneNumber>0) {
			count++;
			phoneNumber/=10;
		}
		if(count==10) {
		this.phoneNumber = phoneNumber;
		}
		else {
			System.out.println("please enter valid number");
		}
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAccountType(String accountType) {
		if(accountType.equals("SAVINGS")||accountType.equals("CURRENT")||accountType.equals("SALARY")||accountType.equals("PREMIUM")) {
		this.accountType = accountType;
		}
		else {
			System.out.println("enter valid account type");
		}
	}

	public void setBalance(double balance) {
		if(balance>=0) {
		this.balance = balance;
		}
		else {
			System.out.println("balance can not be negative");
		}
	}

	public void setKycStatus(boolean kycStatus) {
		this.kycStatus = kycStatus;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isKycStatus() {
		return kycStatus;
	}
	public String viewAccountSummary() {
		return "customerId"+this.customerId+"\n"+"customerName"+this.customerName+"\n"+"email:"+this.email+"\n"+"phone number"+this.phoneNumber+"\n"+"address:"+this.address+"\n"+"account type:"+this.accountType+"\n"+"balance:"+this.balance+"\n"+"kycStatus:"+this.kycStatus;
	}
	public void activateKYC(String documentType) {
		if(documentType.equals("adhar")||documentType.equals("pan")) {
			this.kycStatus=true;
		}
	}
//	public String getMaskedPhone() {
//		int sum=0;
//		
//	}
	


}
