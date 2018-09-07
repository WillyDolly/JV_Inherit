/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;
    
    Vehicle(int p,int f,int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    
    int range(){
        return fuelcap*mpg;
    }
    
    double fuelneeded(int dist){
        return (double)dist/mpg;
    }
    
    int getP(){ return passengers;}
    void setP(int p){ passengers = p;}
    int getF(){return fuelcap;}
    void setF(int f){ fuelcap = f;}
    int getM(){ return mpg;}
    void setM(int m){ mpg = m;}
}
