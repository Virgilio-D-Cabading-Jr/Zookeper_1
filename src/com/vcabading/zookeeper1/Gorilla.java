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
	
	public void throwSomething() {
		System.out.printf(".:: %s has thrown something ::.\n\n", this.animalType);
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.printf(".:: ", null)
		
	}
	
	public void clinb() {
		
	}

	//	//// GET AND SET ////////////////////////////////
	
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	public String getAnimalType() {
		return animalType;
	}
	
}
