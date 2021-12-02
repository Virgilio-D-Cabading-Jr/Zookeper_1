package com.vcabading.zookeeper1;

//////////////////////////////////////////////////////////////////
//	ZOOKEEPER APPLICATION
//By: Virgilio D. Cabading Jr.
//////////////////////////////////////////////////////////////////

public class ZookeeperApp {

	public static void main(String[] args) {
		System.out.println("/////////////////////////////////////////////////");
		System.out.println("ZOOKEEPER APPLICATION\n");
		
		System.out.println("*************************************************");
		System.out.println("Created a mammal");
		Mammal mammal = new Mammal();
		mammal.displayEnergy();

		System.out.println("\n*************************************************");
		System.out.println("Created a gorilla");
		Gorilla gorilla = new Gorilla();
		gorilla.displayEnergy();
		
		System.out.println("\n*************************************************");
		System.out.println("Gorilla Throws 3 somethings:\n");
		gorilla.throwSomething();
		gorilla.displayEnergy();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.displayEnergy();
		
		System.out.println("\n*************************************************");
		System.out.println("Gorilla Eats 2 bananas:\n");
		gorilla.eatBananas();
		gorilla.displayEnergy();
		gorilla.eatBananas();
		gorilla.displayEnergy();
		
		System.out.println("\n*************************************************");
		System.out.println("Gorilla climbs a tree:\n");
		gorilla.climb();
		gorilla.displayEnergy();
		
		System.out.println("\n*************************************************");
		System.out.println("Create a Bat:\n");
		Bat bat = new Bat();
		bat.displayEnergy();
		
		System.out.println("\n*************************************************");
		System.out.println("Bat Flies twice:\n");
		bat.fly();
		bat.displayEnergy();
		bat.fly();
		bat.displayEnergy();
		
		System.out.println("\n*************************************************");
		System.out.println("Bat Eat Humans twice:\n");
		bat.eatHumans();
		bat.displayEnergy();
		bat.eatHumans();
		bat.displayEnergy();
		
		System.out.println("\n*************************************************");
		System.out.println("Bat Attacks Towns thrice:\n");
		bat.attackTown();
		bat.displayEnergy();
		bat.attackTown();
		bat.displayEnergy();
		bat.attackTown();
		bat.displayEnergy();
	}

}
