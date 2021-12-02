package com.vcabading.zookeeper1;

//	////////////////////////////////////////////////////////////////
//	MAMMAL CLASS
//	By: Virgilio D. Cabading Jr.
//	////////////////////////////////////////////////////////////////

public class Mammal {
	private int energyLevel;
	private String animalType;
	
	//	//// CONSTRUCTORS //////////////////////////////////////////
	public Mammal() {
		this.animalType = "Mammal";
	}
	
	//	//// SHOW //////////////////////////////////////////////////
	
	pblic int displayEnergy() {
		System.out.printf("%S - %d\n", this.animalType, this.energyLevel));
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
