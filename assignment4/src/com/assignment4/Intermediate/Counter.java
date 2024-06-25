package com.assignment4.Intermediate;

public class Counter {
	
	private static int count;
	
	public  void incrementCount() {
//		System.out.println("Counter was invoked....");
		count ++;
	}
	
	public static int getCount() {
        return count;
    }

}
