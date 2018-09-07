/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ErrorMsgMain {
    public static void main(String[] args) {
        ErrorMsg e = new ErrorMsg();
       
        System.out.println(e.getERR(ErrorMsg.OUTERR));
        System.out.println(e.getERR(e.INNERR));
    }
}
