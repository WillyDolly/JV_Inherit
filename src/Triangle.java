/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
 public class Triangle extends TwoDShape{
    private String style;
    
    Triangle(){
        super();
        style = "khong xac dinh";
    }
    Triangle(double w,double h,String s){
        super(w,h,"hinh tam giac");
        style = s;
    }
    Triangle(double x){
        super(x,"hinh tam giac");
        style = "dac";
    }
    Triangle(Triangle t){
        super(t);
    }
    
    void showStyle(){
        System.out.println("style: "+style);
    }
    
    double area(){
        return (getWidth() * getHeight())/2;
    }
}
