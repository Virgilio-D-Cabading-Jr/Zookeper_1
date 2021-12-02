package com.vcabading.zookeeper1;

//////////////////////////////////////////////////////////////////
//	BAT CLASS
//	By: Virgilio D. Cabading Jr.	Created at: 01.12.2021 2000
//////////////////////////////////////////////////////////////////

public class Bat extends Mammal {

	//	//// CONSTRUCTORS ////////////////////////////////////////
	public Bat() {
		super();
		this.energyLevel = 300;							// Bat has default 300 energy
		this.animalType = "Bat";
	}
	
	//	//// ACTIONS /////////////////////////////////////////////
	
	//	---- Fly -------------------------------------------------
	//			when a bat flies it flaps its wings and loses 50 energy
	public void fly() {
		System.out.println("flap flap flap flap");
		this.energyLevel -= 50;
	}
	
	//	---- Eat Humans ------------------------------------------
	//			when a bat eats humans, its energy increases by 25
	public void eatHumans() {
		System.out.println("nom nom nom nom");
		this.energyLevel += 25;
	}
		
	//	---- Attack Town -----------------------------------------
	//			when a bat attacks a town, its energy increases by 100
	public void attackTown() {
		System.out.println("hh crack hhHh crack hhh crack");
		this.energyLevel += 100;
	}

}
