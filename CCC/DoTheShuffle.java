/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;

public class DoTheShuffle {
    public static String b1 (String str){
        //First Char To Last Char
        str = str.substring(1, str.length()) + str.charAt(0);
        return str;
    }
    public static String b2 (String str){
        //Last Char To First Char
        str = str.charAt(str.length()-1) + str.substring(0, str.length() - 1);
        return str;
    }
    public static String b3 (String str){
        //Swap First Two Songs
        String temp = "" + str.charAt(1) + str.charAt(0) + str.substring(2, str.length());
        str = temp;
        return str;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String music = "ABCDE";
        int b = input.nextInt();
        int n = input.nextInt();
        while(b != 4){
            if(b == 1){
                for(int i = 0; i < n; i++){
                    music = b1(music);
                }
            }
            if(b == 2){
                for(int i = 0; i < n; i++){
                    music = b2(music);
                }
            }
            if(b == 3){
                for(int i = 0; i < n; i++){
                    music = b3(music);
                }
            }
            b = input.nextInt();
            n = input.nextInt();
        }
        String shuffle = "" + music.charAt(0) + " " + music.charAt(1) + " " +music.charAt(2) + " " + music.charAt(3) + " " + music.charAt(4);
        System.out.println(shuffle);
    }
}
