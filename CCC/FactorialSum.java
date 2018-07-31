/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCC2017CLASS1;

/**
 *
 * @author Nathan
 */
public class FactorialSum {
    public static void main (String [] args){
        int sum = 0;
        for (int i = 1; i <=20; i++){
            int product = 1;
            for (int j = 1; j <= i; j++){
                product = product * j;
            }
            sum += product;
        }
        System.out.println(sum);
    }
}
