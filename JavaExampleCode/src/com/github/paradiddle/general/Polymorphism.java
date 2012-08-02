package com.github.paradiddle.general;

public class Polymorphism
{
	public static void main(String[] args)
	{
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Cow();
		
		makeAnimalTalk(a1);
		makeAnimalTalk(a2);
		makeAnimalTalk(a3);
	}
	
	public static void makeAnimalTalk(Animal a)
	{
		System.out.println("The " + a.getAnimalName() + " says " + a.talk() + "!");
	}
	
	

	
}

interface Animal
{
	public String getAnimalName();
	public String talk();
}

class Cat implements Animal
{
	public String getAnimalName()
	{
		return "cat";
	}
	
	public String talk()
	{
		return "meow";
	}
}

class Dog implements Animal
{
	public String getAnimalName()
	{
		return "dog";
	}
	
	public String talk()
	{
		return "woof";
	}
}

class Cow implements Animal
{
	public String getAnimalName()
	{
		return "cow";
	}
	
	public String talk()
	{
		return "moo";
	}
}


