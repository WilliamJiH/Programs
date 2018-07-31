/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccclevel1f16c4hw;
import java.util.Scanner;
/**
 *
 * @author Nathan
 */
public class FunctionCalculation {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = 0;
        if (x < 1){
            y = x;
        }
        else if (x>= 1 && x < 10){
            y = 2*x - 1;
        }
        else if (x >= 10){
            y = 3*x - 11;
        }
        System.out.println(y);
    }
}
