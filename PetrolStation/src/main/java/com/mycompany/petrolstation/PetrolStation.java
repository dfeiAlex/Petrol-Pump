/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.petrolstation;

/**
 *
 * @author 20221937
 */

public class PetrolStation {
    public static void main(String[] args) {
        // PetrolPump object with test arguments
        PetrolPump pump = new PetrolPump(0.75, 20000, 2, "Unleaded");
        pump.log();
        
//        TestPetrolPump test = new TestPetrolPump(pump);
//        
//        test.userInputTest();
    }
}
