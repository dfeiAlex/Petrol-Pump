/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petrolstation;

/**
 *
 * @author 20221937
 */

public class PetrolPump {
    private double pricePerLitre, petrolVolume, minimumQuantity;
    private String petrolType;

     // Overloaded constructor
    public PetrolPump(double pricePerLitre, double petrolVolume, double minimumQuantity, String petrolType) {
        this.pricePerLitre = 0;
        this.petrolVolume = 0;
        this.minimumQuantity = 0;
        this.petrolType = "";
    }
    
    // Default constructor
    public PetrolPump() {
        this.pricePerLitre = 0;
        this.petrolVolume = 0;
        this.minimumQuantity = 0;
        this.petrolType = "";
    }

    // Add fuel to the pump
    public void addFuel(double petrolAdded) {
        this.petrolVolume += petrolAdded;
    }

    // Fill up car and return the cost
    public double fillCarFromPump(double petrolAmount) {
        double cost = petrolAmount * this.pricePerLitre;
        this.petrolVolume -= petrolAmount;

        return cost;
    }

    // Setters
    public void setPetrolPrice(double newPrice) {
        this.pricePerLitre = newPrice;
    }

    public void setMinimumQuantity(double newMinimumQuantity) {
        this.minimumQuantity = newMinimumQuantity;
    }

    // Getters
    public double getPricePerLitre() {
        return this.pricePerLitre;
    }

    public double getPetrolVolume() {
        return this.petrolVolume;
    }

    public double getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public String getPetrolType() {
        return this.petrolType;
    }
    
    public void log() {
        System.out.println("\n");
        System.out.println("The price per litre is " + this.pricePerLitre);
        System.out.println("The price per litre is " + this.petrolVolume);
        System.out.println("The price per litre is " + this.minimumQuantity);
        System.out.println("The price per litre is " + this.petrolType);
        System.out.println("\n");
    }
}
