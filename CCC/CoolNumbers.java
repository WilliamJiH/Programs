
package downloads;
import java.util.Scanner;
//WRONG!!!!!!!

public class CoolNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        Scanner input = new Scanner(System.in);
        int a,b; 
        int count = 0;
        a= input.nextInt();
        b= input.nextInt();
        for (int i = a; i <= b; i++){
            for (int j = 1; j <=Math.cbrt(b); j++){
                
                    if (i==Math.pow(j,6)){
                        count++;
                    }
                
            }
        }
        System.out.println(count);
    }
}