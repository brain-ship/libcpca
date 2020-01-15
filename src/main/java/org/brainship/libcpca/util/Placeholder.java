package org.brainship.libcpca.util;

import java.util.Vector;

public class Placeholder
{
	private String pid;
	
	private Vector<String> data;
	
	public Placeholder(String pid, Vector<String> data) {
		this.pid = pid;
		this.data = data;
	}
	
	public String getPID() {
		return pid;
	}
	
	public Vector<String> getData() {
		return data;
	}
}