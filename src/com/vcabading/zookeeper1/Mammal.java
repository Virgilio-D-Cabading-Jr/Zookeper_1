package com.vcabading.zookeeper1;

public class Mammal {
	private int energyLevel;
	private String animalType;
	
	//	//// CONSTRUCTORS //////////////////////////////////////////
	public Mammal() {
		this.animalType = "Mammal";
	}
	
	//	//// SHOW //////////////////////////////////////////////////
	
	pblic void displayEnergy() {
		System.out.printf("%S - %d\n", this.animalType, this.energyLevel));
	}

	//	//// GETTERS & SETTERS /////////////////////////////////////
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
}
