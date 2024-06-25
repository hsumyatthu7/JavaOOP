package com.assignment4.Intermediate;

public class CounterMain {
	
	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		c1.incrementCount();
		
		Counter c2 = new Counter();
		c2.incrementCount();
		
		System.out.println("Toutal Count : "+Counter.getCount());
		
		
		
	}

}
