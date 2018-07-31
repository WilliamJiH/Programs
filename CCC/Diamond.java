/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCC2017CLASS1;
import java.util.Scanner;
/**
 *
 * @author Nathan
 */
public class Diamond {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i+=2){
            for (int j = 0; j <n-i /2; j++){
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = n-2; i > 0; i-=2){
            for (int j = 0; j < n-i /2; j++){
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
