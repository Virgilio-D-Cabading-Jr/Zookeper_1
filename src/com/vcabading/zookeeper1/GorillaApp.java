package com.vcabading.zookeeper1;

//////////////////////////////////////////////////////////////////
//	GORILLA APPLICATION
//By: Virgilio D. Cabading Jr.
//////////////////////////////////////////////////////////////////

public class GorillaApp {

	public static void main(String[] args) {
		System.out.println("/////////////////////////////////////////////////");
		System.out.println("ZOOKEEPER 1: GORILLA APPLICATION\n");
		
		Mammal mammal = new Mammal();
		
		System.out.println("*************************************************");
		System.out.println("Created a mammal");
		mammal.displayEnergy();

	}

}
