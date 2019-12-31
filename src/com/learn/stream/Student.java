package com.learn.stream;

public class Student {
	
	private int id;
	private int fee;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}

	
	public String toString() {
	
		return "name is:" +name+ " id is:" +id+ " fee is:" +fee;
	}
}
