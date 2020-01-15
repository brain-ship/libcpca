package org.brainship.libcpca.util;

import java.util.Vector;
import java.io.IOException;

public class Console {
	
	private static ConsolePrintStream cps;
	
	public static <T extends Object> void print(T element) {
		System.out.print(element.toString());
	}
	
	public static <T extends Object> void println(T element) {
		System.out.println(element.toString());
	}
	
	public static void println() {
		System.out.println();
	}
	
	public static void loadConsolePrintStream(ConsolePrintStream dcps) {
		cps = dcps;
	}
	
	public static void printStreamScreen(int index) {
		Vector<String> v = cps.getScreens().elementAt(index);
		for(int i = 0; i < v.size(); i++)
			println(v.elementAt(i));
	}
	
	@Deprecated
	public static void printStreamScreenAndFlush(int index) {
		printStreamScreen(index);
		flush();
	}
	
	public static void printAllScreens(String delimiter) {
		Vector<Vector<String>> screens = cps.getScreens();
		for(int i = 0; i < screens.size(); i++) {
			if(i != 0 && delimiter != null) print(delimiter);
			printStreamScreen(i);
		}
	}
	
	public static void printAllScreens() {
		printAllScreens(null);
	}
	
	public static void flush() {
		try {
			 if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
}