package com.corejavaproject;

public class AdminService {
	ServiceRecordService sservice;
	VehicleService vservice;
	UserService uservice;
	public AdminService(ServiceRecordService sservice, VehicleService vservice, UserService uservice) {
		super();
		this.sservice = sservice;
		this.vservice = vservice;
		this.uservice = uservice;
	}
	public void viewAllUsers() {
		uservice.view();
	}
	public void viewAllVehicles() {
		vservice.view();
	}
	public void veiwAllServiceRecords() {
		sservice.view();
	}
	public void deleteUser() {
		uservice.delete();
	}
	public void updateUser() {
		uservice.update();
	}
	public void updateServiceRecord() {
		sservice.update();
	}
	public void generateReport() {
		System.out.println("generated report");
		System.out.println("total users:"+uservice.users.size());
		System.out.println("total vehicles:"+vservice.vehicles.size());
		System.out.println("total service records:"+sservice.service.size());
		
	}

}
