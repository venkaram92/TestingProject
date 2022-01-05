package com.mindtree.entity;

public class College {
	private String collegeName;
	private int total_count;
	
	public College()
	{}
	
	public College(String collegeName, int total_count) {
		this.collegeName = collegeName;
		this.total_count = total_count;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public int getTotal_count() {
		return total_count;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	
}
