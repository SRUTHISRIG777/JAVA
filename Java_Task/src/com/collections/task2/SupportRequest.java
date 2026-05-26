package com.collections.task2;

public class SupportRequest {
	int requestId;
	String employeeName;
	String issue;
	public SupportRequest(int requestId, String employeeName, String issue) {
		
		this.requestId = requestId;
		this.employeeName = employeeName;
		this.issue = issue;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	

}
