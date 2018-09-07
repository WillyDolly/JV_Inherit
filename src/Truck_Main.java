/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Truck_Main {
    public static void main(String[] args) {
        int dist = 11;
        Truck t1 = new Truck(12,50,5,100);
        Truck t2 = new Truck(5,70,13,35);
        
        System.out.println("Truck 1: ");
        System.out.println("Truck 1's range: "+t1.range());
        System.out.println("Truck 1's fuelneeded: "+t1.fuelneeded(dist));
        System.out.println("Truck 1's cargocap: "+t1.getCargo());
        
         System.out.println("Truck 2: ");
        System.out.println("Truck 2's range: "+t2.range());
        System.out.println("Truck 2's fuelneeded: "+t2.fuelneeded(dist));
        System.out.println("Truck 2's cargocap: "+t2.getCargo());
    }
}
