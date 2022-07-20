package com.cg.thisKeyword;

public class CurrentClassConstructor {
	int a;
	CurrentClassConstructor()
	{
		this(10);
		System.out.println("Inside default constructor \n");
	}
	CurrentClassConstructor(int a)
	{
		this.a = a;
		System.out.println("Inside Parameterized constructor");
}
public static void main(String[] args) {
	CurrentClassConstructor c = new CurrentClassConstructor();
}
}