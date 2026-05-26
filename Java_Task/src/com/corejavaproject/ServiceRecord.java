package com.corejavaproject;

public class ServiceRecord {
	private int serviceId;
	private int vehicleId;
	private String problemDescription;
	private String serviceStatus;
	private String date;
	public ServiceRecord(int serviceId, int vehicleId, String problemDescription, String serviceStatus, String date) {
		super();
		this.serviceId = serviceId;
		this.vehicleId = vehicleId;
		this.problemDescription = problemDescription;
		this.serviceStatus = serviceStatus;
		this.date = date;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getProblemDescription() {
		return problemDescription;
	}
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String displayServiceDetails() {
		return "ServiceRecord [serviceId=" + serviceId + ", vehicleId=" + vehicleId + ", problemDescription="
				+ problemDescription + ", serviceStatus=" + serviceStatus + ", date=" + date + "]";
	}
	
	

}
