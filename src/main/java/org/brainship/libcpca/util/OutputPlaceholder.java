package org.brainship.libcpca.util;

import java.util.Vector;

public class OutputPlaceholder {
	
	public Vector<Placeholder> data;
	
	public OutputPlaceholder() {
		this.data = new Vector<Placeholder>(1,1);
	}
	
	public void newEntry(Placeholder p) {
		data.addElement(p);
	}
	
	public void newEntry(String pid, Vector<String> d) {
		data.addElement(new Placeholder(pid, d));
	}
	
	public ConsolePrintStream getRawEntries(String del) {
		ConsolePrintStream cps = new ConsolePrintStream();
		for(int i = 0; i < data.size(); i++)
		{
			if(i != 0 && del != null) cps.print(del);
			Placeholder p = data.elementAt(i);
			String pid = p.getPID();
			Vector<String> dat = p.getData();
			cps.println("PID "+pid);
			for(int j = 0; j < dat.size(); j++)
				cps.println(dat.elementAt(j));
		}
		return cps;
	}
}