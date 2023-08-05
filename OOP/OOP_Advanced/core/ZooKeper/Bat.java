package com.souha.ZooKeper;

public class Bat extends Mammal{
	public Bat() {
        setenergy(300);
    }
	   public void fly() {
	        System.out.println("Bat taking off!");
	        setenergy(getenergy()-50);
	    }
	   public void eatHumans() {
	        System.out.println("So-");
	        setenergy(getenergy()+25);
	    }

	    public void attackTown() {
	        System.out.println("Town on fire!");
	        setenergy(getenergy()-100);
	    }

	
}
