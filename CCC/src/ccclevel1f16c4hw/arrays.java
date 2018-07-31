/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccclevel1f16c4hw;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author William_Ji
 */
public class arrays {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        //Int
        int [] arrint = new int [5];
        //String
        String [] arrstr = new String [5];
        //Double
        Double [] arrbdl = new Double [5];
        //Boolean
        boolean [] arrbool = new boolean [5];
        
        arrint[0] = 5;
        arrint[1] = 10;
        arrstr [2] = "Nathan";
        
        int [] arrmarks = {100,90,60,70,80};
        for (int i=0; i < 5; i++){
            arrbdl [i] = input.nextDouble();
        }
        for (int i = 0; i < 5; i++){
            System.out.print(arrbdl[i]+"\t");
        }
        // average and median from user
        int [] intmarks = new int[10];
        int intsum = 0;
        for (int i = 0; i < 10; i++){
            intmarks[1] = input.nextInt();
            intsum += intmarks[1];
        }
        System.out.println("Average" +intsum/10);
        Arrays.sort(intmarks);
        System.out.println("Median"+
                (intmarks[intmarks.length/2-1]+
                        intmarks[intmarks.length/2])/2);
    }
}
