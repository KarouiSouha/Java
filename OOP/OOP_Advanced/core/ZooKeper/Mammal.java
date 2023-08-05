package com.souha.ZooKeper;

public class Mammal {
	private int energyLevel;
	
	public int getenergy() {
		return energyLevel;
	}
	
	public void setenergy(int energyLevel) {
		this.energyLevel=energyLevel;
	}
	public Mammal() {
		this.energyLevel=100;
	}
	public int displayEnergy() {
		System.out.println("Energy Level is"+this.energyLevel);
		return this.energyLevel;
		
	}
}
