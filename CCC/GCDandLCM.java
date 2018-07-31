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
public class GCDandLCM {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int lcm = 0;
        int gcf = 0;
        int n1, n2;
        n1 = input.nextInt();
        n2 = input.nextInt();
        for (int i = 1; i <= n1; i++){
            for (int j = 1; j <= n2; j++){
                if ((n1 % j)==0 && (n2 % j)==0){
                    gcf = j;
                }
            }
            for (int j = 1; j <= n2; j++){
                lcm = n1 * (n2 / gcf);
            }
        }
        System.out.println(gcf);
        System.out.println(lcm);
    }
}
