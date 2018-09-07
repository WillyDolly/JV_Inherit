/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class TwoDTriRec {
      public static void main(String[] args) {
        TwoDShape[] shapes = new TwoDShape[5];
        Triangle tr = new Triangle(2.3,5.6,"dac");
        shapes[0] = new Triangle(8.0,12.0,"rong");
        shapes[1] = new Triangle(10.0);
        shapes[2] = new Triangle(tr);
        shapes[3] = new Rectangle(5.9,6.4);
        shapes[4] = new Circle(2);
       // shapes[4] =  new TwoDShape(0.0,0.0,"hinh dang chung");
        
        for(int i=0;i<shapes.length;i++){
            System.out.println("name: "+shapes[i].getName());
            System.out.println("area: "+shapes[i].area());
            System.out.println("toString: "+shapes[i].toString());// to depict an Object
        }
    }
    
}
