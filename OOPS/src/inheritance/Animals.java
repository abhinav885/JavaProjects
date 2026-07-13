package inheritance;

import java.util.Scanner;

class Animal{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setData(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	String getSound()
	{
		return(" ");
	}
}

class Dog extends Animal{
	private String breed;
	
	public Dog(String name,int age,String breed) {
		super.setData(name,age);
		this.breed = breed;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	String getSound() {
		return("Bark");
	}
}

class Cat extends Animal{
	private String color;
	
	public Cat(String name,int age,String color) {
		super.setData(name,age);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getSound() {
		return("Meow");
	}
	
}
public class Animals 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter animal type:");
        String type = sc.next();

        if(type.equalsIgnoreCase("dog")) {

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter breed: ");
            String breed = sc.next();

            Dog d = new Dog(name, age, breed);

            System.out.println("Sound: " + d.getSound());
        }
        else if(type.equalsIgnoreCase("cat")) {

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter color: ");
            String color = sc.next();

            Cat c = new Cat(name, age, color);

            System.out.println("Sound: " + c.getSound());
        }
        else {
            System.out.println("Invalid Animal");
        }
        sc.close();
	}
}
