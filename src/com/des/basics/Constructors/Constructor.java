package com.des.basics.Constructors;
class Dog extends Object{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	// Zero parameterized
	public Dog() {
		super();
		System.out.println("showing the values after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("------------------");
	}
	//single 
	public Dog(String name) {
		this("tommy","yellow");
		this.name=name;
		System.out.println("showing the values after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("------------------");
	}
	//2 parameterized
	public Dog(String name,String color) {
		this("Rocky","Brown",7000);
		this.name=name;
		this.color=color;
		System.out.println("showing the values after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("------------------");
	}
	//3 parameterized
	public Dog(String name,String color,int cost) {
		this("shocky","black",9000,5);
		this.name=name;
		this.color=color;
		this.cost=cost;
		System.out.println("showing the values after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("------------------");
	}
	//4 parameterized
	public Dog(String name,String color,int cost,int age) {
		this("bunty","white",9000,6,"GR");
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		System.out.println("showing the values after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("------------------");
	}
	//5 parameterized
	public Dog(String name,String color,int cost,int age,String breed) {
		this();
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		this.breed=breed;
		System.out.println("showing the values after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("------------------");
	
}
	
public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
}

public class Constructor {

	public static void main(String[] args) {
		Dog d=new Dog("vicky");
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
		System.out.println(d.getAge());
		System.out.println(d.getBreed());
		
		

	}

}
