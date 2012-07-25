package com.github.paradiddle.general;

public class MethodOverloading
{
	// This is a constructor. Do any object instance setup here.
	public MethodOverloading()
	{
		System.out.println("Inside the constructor.");
	}
	
	private int addThings(int x, int y)
	{
		System.out.println("Inside the two parameter version of 'addThings'.");
		int sum = x + y;
		return sum;
	}
	
	private int addThings(int x, int y, int z)
	{
		System.out.println("Inside the three parameter version of 'addThings'.");
		int sum = x + y + z;
		return sum;
	}
	
	private int addThings(int... nums)
	{
		System.out.println("Inside the variable # parameter version of 'addThings'.");
		int sum = 0;
		for(int i: nums)
		{
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		// Create an instance of the MethodOverloading class
		MethodOverloading m = new MethodOverloading();
		
		int firstSum = m.addThings(5, 6);
		System.out.println("Sum of 5 and 6 = " + firstSum);

		int secondSum = m.addThings(5, 6, 7);
		System.out.println("Sum of 5, 6, and 7 = " + secondSum);
		
		int thirdSum = m.addThings(5, 6, 7, 8, 9, 10);
		System.out.println("Sum of 5, 6, 7, 8, 9, and 10 = " + thirdSum);
	}
}
