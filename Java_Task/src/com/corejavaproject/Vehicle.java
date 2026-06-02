package com.corejavaproject;

public class Vehicle {
	private int vehicleId;
	private String vehicleName;
	private String vehicleType;
	private String vehicleNumber;
	private long contactNumber;
	public Vehicle(int vehicleId, String vehicleName, String vehicleType, String vehicleNumber, long contactNumber) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.contactNumber = contactNumber;
		//System.out.println("vehilce added successfully...");
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String displayVehicleDetails() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicle name=" + vehicleName + ", vehicleType=" + vehicleType
				+ ", vehicleNumber=" + vehicleNumber + ", contactNumber=" + contactNumber + "]";
	}
	

}
