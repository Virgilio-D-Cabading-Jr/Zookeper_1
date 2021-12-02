package com.vcabading.zookeeper1;

//////////////////////////////////////////////////////////////////
//	GORILLA CLASS
//	By: Virgilio D. Cabading Jr.
//////////////////////////////////////////////////////////////////

public class Gorilla extends Mammal {

	private String animalType;
	
	//	//// CONSTRUCTOR ////////////////////////////////
	
	public String getAnimalType() {
		return animalType;
	}

	}
	
	//	//// ACTIONS ////////////////////////////////////
	
	public void throwSomething() {
		System.out.printf(".:: %s has thrown something ::.\n\n", this.animalType);
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		
	}
	
	public void clinb() {
		
	}

	//	//// GET AND SET ////////////////////////////////
	
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	public Gorilla() {
		this.animalType = "Gorilla";
}
