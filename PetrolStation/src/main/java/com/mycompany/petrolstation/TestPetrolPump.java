/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.petrolstation;
import java.util.Scanner;

/**
 *
 * @author 20221937
 */

public class TestPetrolPump {
    private PetrolPump pump;
    
    public TestPetrolPump(PetrolPump pump) {
        this.pump = pump;
    }
    
    public void userInputTest() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many litres of petrol would you like to purchase?");
        double userQuantity = scan.nextDouble();
        
        this.pump.log();
        
        if (userQuantity < this.pump.getMinimumQuantity()) {
            System.out.printf("You cannot get less than %b litres of petrol", this.pump.getMinimumQuantity());
        } else if (this.pump.getPetrolVolume() - userQuantity < 0) {
            System.out.println("The sale could not be completed. There is not enough petrol.");
        } else {
            double cost = this.pump.fillCarFromPump(userQuantity);
            System.out.printf("The petrol has been pumped to your car. The cost is %b", cost);
        }
    }
    
    public void addPetrolTest() {
        this.pump.addFuel(1000);
        System.out.printf("\n1000 litres of petrol has been added to the pump.\nThe current volume is %b", this.pump.getPetrolVolume());
    }
}
