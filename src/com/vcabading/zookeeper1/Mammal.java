package com.vcabading.zookeeper1;

//	////////////////////////////////////////////////////////////////
//	MAMMAL CLASS
//	By: Virgilio D. Cabading Jr.
//	////////////////////////////////////////////////////////////////

public class Mammal {
	protected int energyLevel;
	protected String animalType = "Mammal"; 
	
	//	//// CONSTRUCTORS //////////////////////////////////////////
	public Mammal() {
		this.energyLevel = 100;
	}
	
	//	//// SHOW //////////////////////////////////////////////////
	
	public int displayEnergy() {
		System.out.printf("%s :: energy: %d\n", this.animalType, this.energyLevel);
		return this.energyLevel;
	}

	//	//// GETTERS & SETTERS /////////////////////////////////////
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
}
