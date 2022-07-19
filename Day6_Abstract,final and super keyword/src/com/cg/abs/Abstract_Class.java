package com.cg.abs;
abstract class Fruit
{
	abstract void display();

}
class Apple
{
	void display()
	{
		System.out.println("Apple is good for our brain.");
	}
}

public class Abstract_Class {

	public static void main(String[] args) {
	//Fruit f = new Apple();
	Apple f=new Apple();
	f.display();

	}

}
