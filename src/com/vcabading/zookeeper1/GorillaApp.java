package com.vcabading.zookeeper1;

//////////////////////////////////////////////////////////////////
//	GORILLA APPLICATION
//By: Virgilio D. Cabading Jr.
//////////////////////////////////////////////////////////////////

public class GorillaApp {

	public static void main(String[] args) {
		System.out.println("/////////////////////////////////////////////////");
		System.out.println("ZOOKEEPER 1: GORILLA APPLICATION\n");
		
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
	}

}
