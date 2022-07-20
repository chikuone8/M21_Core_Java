package com.cg.function;
import java.util.Scanner;
public class Factorial_Num {
	static int factorial(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		System.out.println("The factorial is :" +factorial(n));
		s.close();
	}

}