package com.vcabading.zookeeper1;

//////////////////////////////////////////////////////////////////
//	GORILLA CLASS
//	By: Virgilio D. Cabading Jr.
//////////////////////////////////////////////////////////////////

public class Gorilla extends Mammal {
	
	//	//// CONSTRUCTOR ////////////////////////////////
	
	public Gorilla() {
		super();
		this.animalType = "Gorilla";
	}
	
	//	//// ACTIONS ////////////////////////////////////
	
	//	---- Throw Something ----------------------------
	//			when the gorilla throws something, it loses 5 energy
	public void throwSomething() {
		System.out.printf(".:: %s has thrown something ::.\n", this.animalType);
		this.energyLevel -= 5;
	}
	
	//	---- Eat Bananas --------------------------------
	//			when the Gorilla eats bananas, it gains 10 energy
	public void eatBananas() {
		System.out.printf(".:: %s is satisfied with eating a banana ::.\n", this.animalType);
		this.energyLevel += 10;
	}
	
	//	---- Climb --------------------------------------
	//			when a Gorilla climbs a tree, it loses 10 energy
	public void climb() {
		System.out.printf(".:: %s has climbed a tree ::.\n", this.animalType);
		this.energyLevel -= 10;
	}
	
	//	//// GET AND SET ////////////////////////////////
	
}
