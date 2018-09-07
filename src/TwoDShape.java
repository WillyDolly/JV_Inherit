/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
abstract public class TwoDShape {
    private double width;
    private double height;
    private String name;
    
    TwoDShape(){
        name = "";
    }
    
    TwoDShape(double w,double h,String s){
        width = w;
        height = h;
        name = s;
    }
    
    TwoDShape(double e,String s){
        width = height = e;
        name = s;
    }
    
    TwoDShape(TwoDShape ts){
        width = ts.width;
        height = ts.height;
        name = ts.name;
    }
    void setWidth(double w){
        width = w;
    }
    double getWidth(){
        return width;
    }
    void setHeight(double h){
        height = h;
    }
    double getHeight(){
        return height;
    }
    
    String getName(){
        return name;
    }
    void showDim(){
        System.out.println("width & height: "+width+" - "+height);
    }
    abstract double area();
    //   System.out.println(s);
    // return 0.0;
    }

