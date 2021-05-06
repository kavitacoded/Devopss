package com.example.youtube.model;

public class Employee {

	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	private String Address;
	private String State;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Address=" + Address + ", State=" + State + "]";
	}
	public Employee(int id, String address, String state) {
		super();
		this.id = id;
		Address = address;
		State = state;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
