package org.brainship.libcpca.util;

import java.util.Vector;

public class ConsolePrintStream
{
	private Vector<Vector<String>> screens;
	
	private Vector<String> stream;
	
	private String tappend;
	
	private boolean status;
	
	public ConsolePrintStream() {
		openStream();
		screens = new Vector<Vector<String>>(1,1);
	}
	
	public <T extends Object> void print(T t) {
		tappend += t.toString();
	}
	
	public <T extends Object> void println(T t) {
		tappend += t.toString();
		stream.addElement(tappend);
		tappend = "";
	}
	
	public void println() {
		stream.addElement(tappend);
		tappend = "";
	}
	
	public void flush() {
		closeStream();
		openStream();
	}
	
	public void openStream() {
		status = true;
		stream = new Vector<String>(1,1);
		tappend = "";
	}
	
	public void closeStream() {
		stream.addElement(tappend);
		screens.addElement(this.stream);
		tappend = "";
		status = false;
	}
	
	public boolean isStreamOpen() {
		return status;
	}
	
	public Vector<Vector<String>> getScreens() {
		return this.screens;
	}
	
	public ConsolePrintStream getInstance() {
		return this;
	}
}