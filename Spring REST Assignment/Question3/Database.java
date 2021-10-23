package com.naveen;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<Long,State> states=new HashMap<>();
	public static Map<Long,State> getStates(){
		return states;
	}
	

}
