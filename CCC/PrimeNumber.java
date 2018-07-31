/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;
/**
 *
 * @author Nathan
 */
public class PrimeNumber {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        for(int i = 100; i <= 200; i++){
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count += 1;
                }
            }
            if (count == 2){
                System.out.print(i + "\t");
            }
            count = 0;
        }
        System.out.println("");
    }
}
