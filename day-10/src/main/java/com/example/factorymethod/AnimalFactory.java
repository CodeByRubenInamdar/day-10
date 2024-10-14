package com.example.factorymethod;

public abstract class AnimalFactory {
	// Factory Method
	public abstract Animal createAnimal();

	// Additional method to use the created Animal
	public void makeAnimalSpeak() {
		Animal animal = createAnimal();
		animal.speak();
	}
}