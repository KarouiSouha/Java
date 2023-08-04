package com.souha.car;

public class Car {
     double gas=10;
     
     public void display_gas() {
     System.out.println("yor gas"+this.gas+"l");
     }
     public double getgas() {
    	 return gas;
     }
     public void setgas(double gas) {
    	 this.gas=gas;
     }
}
