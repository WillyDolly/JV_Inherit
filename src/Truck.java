/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Truck extends Vehicle{
    private int cargocap;
    
    Truck(int p,int f,int m,int c){
        super(p,f,m);
        cargocap = c;
    }
    
    int getCargo(){ return cargocap;}
    void putCargo(int c){ cargocap = c;}
}
