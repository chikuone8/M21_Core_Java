package com.cg.superKeyword;
//Super Keyword :- It is used to access paremt class method
class Animal
{
	public int a=10,b=20;
	void display()
	{
		System.out.println("The addition of a & b : "+(a+b));
	}
}
class Tiger extends Animal
{
	public void display()
	{
		System.out.println("Tiger");
	}
	void print()
	{
		display();
		//accessing the parent class method using super keyword
		super.display();
	}
}


public class SuperMethod {

	public static void main(String[] args) {
		//obj.creation
		Tiger t=new Tiger();
		t.print();

	}

}