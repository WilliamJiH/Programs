/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;
/**
 *
 * @author William_Ji
 */
public class votecount {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i <= 15; i++){
            String word = input.next();
            if (word == "A"){
                count1++;
            }
            else
                count2++;
        } 
        if (count1 > count2){
            System.out.println("A");
        }
         else if (count2 > count1){
    }
}
    
}
