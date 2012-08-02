package com.github.paradiddle.general;

public class PolymorphismAlternate
{
	public static void main(String[] args)
	{
		Mammal m1 = new Frog();
		Mammal m2 = new Pig();
		Mammal m3 = new Priest();
		
		makeMammalTalk(m1);
		makeMammalTalk(m2);
		makeMammalTalk(m3);
	}
	
	public static void makeMammalTalk(Mammal m)
	{
		m.talk();
	}
}

class Mammal
{
	protected String name;
	protected String noise;
	
	protected void talk()
	{
		System.out.println("The " + name + " says " + noise + "!");
	}
}

class Frog extends Mammal
{
	public Frog()
	{
		name = "frog";
		noise = "ribbit";
	}
}

class Pig extends Mammal
{
	public Pig()
	{
		name = "pig";
		noise = "oink";
	}
}

class Priest extends Mammal
{
	public Priest()
	{
		name = "priest";
		noise = "amen";
	}
}