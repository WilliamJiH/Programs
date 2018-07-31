/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccclevel1f16c4hw;
import java.util.Scanner;

/**
 *ccc15j3
 * @author William_Ji
 */
public class CCCLEVEL1F16C4HW {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String word = input.next();
        String vowels = "aeiou";
        String str1 = "bcdfghjklmnpqrstvwxyz";
        String str2 = "aaeeeiiiiooooouuuuuuu";
        String str3 = "cdfghjklmnpqrstvwxyzz";
        String str4 = "";
        for (int i = 0; i < word.length();i++){
            //check
            if (vowels.indexOf(word.charAt(i))>=0){
                str4 = str4 + word.charAt(i);
                
            }
            else{
                str4 = str4 + word.charAt(i)+
                        str2.charAt(str1.indexOf(word.charAt(i)))+
                        str3.charAt(str1.indexOf(word.charAt(i)));
            }
        }
        System.out.println(str4);
    }
    
}
