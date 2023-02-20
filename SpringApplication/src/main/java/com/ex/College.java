package com.ex;

public class College {
	private int id;
	private String sname;
	private int smarks;
	private String section;
	private String branch;
	public College(int id, String sname, int smarks, String section, String branch) {
		super();
		this.id = id;
		this.sname = sname;
		this.smarks = smarks;
		this.section = section;
		this.branch = branch;
	}
	public void show() {
		System.out.println("Id="+id+" sname="+sname+" smarks="+smarks+" section="+section+" branch="+branch);
	}
}
	
