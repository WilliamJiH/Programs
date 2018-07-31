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
 * @author Nanthi
 */
public class VitosFamily {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int ntest = input.nextInt();
        for(int i = 0; i < ntest; i++){
            int minsum = 0;
            int nhouses = input.nextInt();
            int [] dis = new int[nhouses];
            for(int a = 0; a < nhouses; a++){
                dis[a] = input.nextInt();
            }
            //Let sort the array
            Arrays.sort(dis);
            //Let go through the array and find out the adjucant distance
            for(int k = 0; k < dis.length-1; k++){
                minsum = minsum + Math.abs(dis[k]-dis[k+1]);
            }
            System.out.println(minsum);
        }
    
    }
    
}
