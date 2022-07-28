package com.cg.Interfaces;


interface Mother
{
	void display();
}
interface Father
{
	void print(); 
}

class Daughter implements Mother, Father
{

	@Override
	public void print() {
		System.out.println("My Father name is Maruti");
		
	}

	@Override
	public void display() {
		System.out.println("My Mother name is Vandana");
	}
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.display();
		d.print();
	}

}