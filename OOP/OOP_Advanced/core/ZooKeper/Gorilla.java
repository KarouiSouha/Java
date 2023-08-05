package com.souha.ZooKeper;

public class Gorilla extends Mammal{
     public void throw_thing() {
    	 System.out.println("Gorila has thrown somthing");
    	 setenergy(getenergy()-5);
     }
     public void eatBananas() {
    	 System.out.println("Gorila is satisfied after eating bananas");
    	 setenergy(getenergy()+10);
     }
     public void climb() {
    	 System.out.println("Gorila has climbed a tree");
    	 setenergy(getenergy()-10);
     }
}