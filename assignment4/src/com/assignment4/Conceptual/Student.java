package com.assignment4.Conceptual;

public class Student {

    public int add(int num1,int num2) {
    	return num1+num2;
    }
  
    public int add(int num1,int num2,int num3) {
    	return num1+num2+num3;
    }
    public void work() {
        System.out.println("Student is working....");
    }
}

class PrimaryStudent extends Student {
    
    @Override
    public void work() {
        System.out.println("Primary Student is studying and playing....");
    }
}

class ElementaryStudent extends Student {

	@Override
    public void work() {
        System.out.println("Elementary Student is learning basic subjects....");
    }
}
