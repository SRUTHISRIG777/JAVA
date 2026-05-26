package com.collections.task2;

public class Task {

	int taskId;
	String taskName;
	String assignedTo;
	public Task(int taskId, String taskName, String assignedTo) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.assignedTo = assignedTo;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	
}
