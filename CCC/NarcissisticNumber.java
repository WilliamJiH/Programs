/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;

public class NarcissisticNumber {
    public static void main (String [] args){
        for (int i = 100; i<=999; i++){
           int h = i % 1000 / 100;
           int t = i % 100 / 10;
           int o = i % 10;
           if ((h*h*h) + (t*t*t) + (o*o*o) == i){
               System.out.print(i + "\t");
           } 
        }
        System.out.println("");
    }
}
