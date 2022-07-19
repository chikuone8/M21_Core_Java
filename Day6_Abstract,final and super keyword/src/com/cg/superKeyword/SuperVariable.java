package com.cg.superKeyword;
//Super Keyword :- It is used to access paremt class instance variable 
class Mobile
{
	protected String name="Samsung";
	
}
class Samsung extends Mobile
{
	String name="Galaxy M31s";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.display();
		

	}

}