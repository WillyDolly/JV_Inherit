/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ErrorMsg {
    final static int OUTERR = 0;
    final int INNERR = 1;
    final int DISKERR = 2;
    final int RAMERR = 3;
    
    String msg[] = { "loi xuat", "loi nhap", "day dia", "day ram"};
    String getERR(int i){
        if(i>=0 && i<msg.length)
            return msg[i];
        else
            return "loi khong hop le";
    }
}
