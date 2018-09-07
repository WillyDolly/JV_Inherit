/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class DoituongLopcon_ThamchieuLopCha {
    public static void main(String[] args) {
        X x = new X(6);
        X x1;
        Y y = new Y(7,8);
        x1 = x;
        System.out.println("x1.a: "+x1.a);
        x1 = y;
        System.out.println("x1.a:"+x1.a);
       // System.out.println(x1.b); dadclass can not access sonclass'members
    }
}
