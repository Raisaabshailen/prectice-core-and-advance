package com.rays.io;

import java.io.Serializable;

public class StudentSerial implements Serializable {

	
	String name;
	int id;
	
	public StudentSerial(String n,int id) {
		this.name=n;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		
		return "StudentSerial[name"+name+",id"+id+"]";
	}
}
