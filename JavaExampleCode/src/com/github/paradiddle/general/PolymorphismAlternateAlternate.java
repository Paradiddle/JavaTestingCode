package com.github.paradiddle.general;

public class PolymorphismAlternateAlternate
{
	public static void main(String[] args)
	{
		Image i = new Image();
		TextBlock tb = new TextBlock();
		
		print(i);
		print(tb);
	}
	
	public static void print(Printable p)
	{
		p.print();
	}
}

interface Printable
{
	public abstract void print();
}

class Image implements Printable
{

	@Override
	public void print()
	{
		System.out.println("Printing an image.");
	}
	
}

class TextBlock implements Printable
{

	@Override
	public void print()
	{
		System.out.println("Printing a text block.");
	}
	
}
