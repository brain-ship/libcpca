package org.brainship.libcpca.common.templates;

public abstract class AbstractPathBuilder {
	
	public abstract String getPath();
	
	public abstract void changeDirectory(String dir);
	
	public abstract void changeDirectoryToParent();
	
	public abstract String getUserDirectory();
	
	public abstract String formatPath();
	
}