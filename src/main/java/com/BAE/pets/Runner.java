package com.BAE.pets;

public class Runner {

	public static void main(String[] args) {
		
		Pet pet1 = new Pet();
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		
		
		pet1.makeNoise();
		pet1.doThing();
		
		dog1.doThing();
		dog1.makeNoise();
		
		cat1.doThing();
		cat1.makeNoise();
		
	}
	
}
