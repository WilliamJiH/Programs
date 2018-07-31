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
public class PerfectNumber {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String factor = "";
        String f = "";
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            for (int j = 1; j<i; j++){
                if (i % j == 0){
                    f = j + ", ";
                    factor = factor.concat(f);
                    sum += j;
                }
            }
            if (sum == i)
            System.out.println(i + " has factors " +factor);
            sum = 0;
            f = "";
            factor = "";
        }
    }
}