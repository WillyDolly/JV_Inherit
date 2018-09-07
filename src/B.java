/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class B extends A{
    int i =8;
//    B(){
//        System.out.println("BBB");
//    }
    B(String b){
        //super(i); can't reference i before super constructor's been called
       // super(b);
        System.out.println("constructor B");
    }
    B(double t){
        System.out.println("s");
    }
//    void show(){
//        
//    } can not override show() in A
}
