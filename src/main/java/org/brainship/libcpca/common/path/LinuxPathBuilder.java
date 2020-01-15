package org.brainship.libcpca.common.path;

import org.brainship.libcpca.common.templates.AbstractPathBuilder;

public class LinuxPathBuilder extends AbstractPathBuilder {
	
	private String path;
	
	private String userName;
	
	private String arch;
	
	public LinuxPathBuilder(String name) {
		userName = name;
	}
	
	public String getPath() {
		return formatPath();
	}
	
	public void changeDirectory(String dir) {
		path += "/" + dir;
	}
	
	public void changeDirectoryToParent() {
		path = path.substring(0, path.lastIndexOf("/"));
	}
	
	public String getUserDirectory() {
		return "~";
	}
	
	public String formatPath() {
		if(System.getProperty("os.name").contains("linux")) return path;
		path.replace("/", "\\");
		if(path.contains("~")) {
			
		}
		return path;
	}
	
}