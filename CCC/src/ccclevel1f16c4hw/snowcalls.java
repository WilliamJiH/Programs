/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccclevel1f16c4hw;
import java.util.Scanner;

public class snowcalls {
    public static String snowcall(String str){
        String str1 = "";
        str1 = str.replaceAll("-", "");
        str1 = str.replaceAll("A","2");
        str1 = str.replaceAll("B","2");
        str1 = str.replaceAll("C","2");
        str1 = str.replaceAll("D","3");
        str1 = str.replaceAll("E","3");
        str1 = str.replaceAll("F","3");
        str1 = str.replaceAll("G","4");
        str1 = str.replaceAll("H","4");
        str1 = str.replaceAll("I","4");
        str1 = str.replaceAll("J","5");
        str1 = str.replaceAll("K","5");
        str1 = str.replaceAll("L","5");
        str1 = str.replaceAll("M","6");
        str1 = str.replaceAll("N","6");
        str1 = str.replaceAll("O","6");
        str1 = str.replaceAll("P","6");
        str1 = str.replaceAll("Q","7");
        str1 = str.replaceAll("R","7");
        str1 = str.replaceAll("S","7");
        str1 = str.replaceAll("T","8");
        str1 = str.replaceAll("U","8");
        str1 = str.replaceAll("V","8");
        str1 = str.replaceAll("W","9");
        str1 = str.replaceAll("X","9");
        str1 = str.replaceAll("Y","9");
        str1 = str.replaceAll("Z","9");
        String pnumber = ""+str1.substring(0,3)+
                "-"+str1.substring(3,6)+"-"+
                str1.substring(6,10);
        return pnumber;
    }
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        for (int i = 0; i < n;i++){
            String str = input.next();
            System.out.println(snowcall(str));

        }
    }
    
}
