package com.cg.thisKeyword;
//this keyword can be used to return the current class instance.

class SumOf
{
	int a;
	int b;
	
	SumOf()
	{
		a=2;
		b=5;
	}
	SumOf get()
	{
		return this;
	}
	void display()
	{
		System.out.println("a = " + a + " b = " + b);
		System.out.println("The Sum of the a & b : "+(a+b));
	}
}
public class CurrentClassInstance {

	public static void main(String[] args) {
		SumOf a = new SumOf();
		a.get().display();
	}

}