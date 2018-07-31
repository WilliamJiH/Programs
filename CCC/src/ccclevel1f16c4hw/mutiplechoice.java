/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccclevel1f16c4hw;
import java.util.Scanner;

/**
 *
 * @author William Ji
 */
public class mutiplechoice {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        String [] cans = new String [n];
        String [] sans = new String [n];
        for (int i = 0; i < n; i++){
            cans [i] = input.next();
            
        }
        int count = 0 ;
        for (int i = 0; i < n; i ++){
            if (cans[i].equals(sans[i]))count++;
        }
        System.out.println(count);
    }
}
