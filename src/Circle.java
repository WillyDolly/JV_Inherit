/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Circle extends TwoDShape{
    final double PI = 3.14;
    Circle(double r){
        super(r,"hinh tron");
    }
    double area(){
        return getWidth()*getHeight()*PI;
    }
}
