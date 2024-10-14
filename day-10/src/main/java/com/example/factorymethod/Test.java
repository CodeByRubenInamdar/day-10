package com.example.factorymethod;

public class Test {
	public static void main(String[] args) {
		// Create a Dog using DogFactory
		AnimalFactory dogFactory = new DogFactory();
		dogFactory.makeAnimalSpeak(); // Outputs: Woof! Woof!

		// Create a Cat using CatFactory
		AnimalFactory catFactory = new CatFactory();
		catFactory.makeAnimalSpeak(); // Outputs: Meow! Meow!
	}
}
