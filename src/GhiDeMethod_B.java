/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class GhiDeMethod_B extends GhiDeMethod_A{
    int c;
    GhiDeMethod_B(int k,int i,int j){
        super(i,j);
        c = k;
    }
    void show(String msg){
        //super.show();
        System.out.println("k = "+c);
        System.out.println("msg: "+msg);
    }
}
