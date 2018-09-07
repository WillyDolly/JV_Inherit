/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Rectangle extends TwoDShape{
    Rectangle(){
        super();
    }
    Rectangle(double w,double h){
        super(w,h,"hinh chu nhat");
    }
    Rectangle(double x){
        super(x,"hinh chu nhat");
    }
    Rectangle(Rectangle r){
        super(r);
    }
    
    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        else return false;
    }
    double area(){
        return getWidth()* getHeight();
    }
    
}
