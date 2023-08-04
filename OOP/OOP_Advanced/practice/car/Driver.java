package com.souha.car;

public class Driver extends Car {
     public void decrease_gas() {
    	 setgas(getgas()-1);
    	 System.out.println("you are decreasing");
    	 System.out.println("Your gas is"+getgas());
     }
     public void boosters_gas() {
    	 setgas(getgas()-3);
    	 System.out.println("you are boosting");
    	 System.out.println("Your gas is"+getgas());
     }
     public void refueling_gas() {
    	 setgas(getgas()-2);
    	 System.out.println("you are refueling");
    	 System.out.println("Your gas is"+getgas());
     }
}
