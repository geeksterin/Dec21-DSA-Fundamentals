package com.binarySearch;

import java.util.HashMap;
import java.util.LinkedHashMap;

class A{
	private int a;
	
}

public class test {
	
public static void main(String[] args) {
	HashMap<A, Integer> dataMap = new LinkedHashMap<A, Integer>();
	dataMap.put(new A(), 2);
	dataMap.put(new A(), 4);
	dataMap.put(new A(), 3);
	dataMap.put(new A(), 1);
	System.out.println(dataMap.size());
	
}
	
}
