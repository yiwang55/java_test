package com.ghcTest;

public class SimpleLookup implements Lookup{

	private String[] names;
	private Object[] values;
	
	@Override
	public Object find(String name) {
		// TODO Auto-generated method stub
		for(int i = 0; i < names.length; i++) {
			if (names[i].equals(name))
				return values[i];
		}
		return null;
	}
	
	Lookup lp = new SimpleLookup();
	Object o = lp.find("Red");

	static void processValue(String name, Lookup table) {
		Object value = table.find(name);
		if (value != null) {
			//...process the value
		}
	}
	
	
}
