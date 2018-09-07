/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class DynamicMethodDispatch {
    public static void main(String[] args) {
    DMD d = new DMD();
    DMDcon1 d1 = new DMDcon1();
    DMDcon2 d2 = new DMDcon2();
    DMD dmd;
    
    dmd = d;
    dmd.who();
    
    dmd = d1;
    dmd.who();
    
    dmd = d2;
    dmd.who();
    d2.a2 =5;
  //  dmd.a2 = 6;
    }
}
