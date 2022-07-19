package com.cg.abs;
abstract class A
{
	void print()
	{
		System.out.println("Non-Abstract Method");
		
	}
}
class B extends A
{
}
public class NonAbstractMethod {

	public static void main(String[] args) {
		B a=new B();
		a.print();

	}

}
