/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class A {
    A(){
        System.out.println("constructor A");
    }
    A(int i){
        System.out.println("iii");
    }
    final void show(){
        System.out.println("this method can not be overriden");
    }
}
