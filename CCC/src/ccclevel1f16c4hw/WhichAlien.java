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
public class WhichAlien {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,e;
        a = input.nextInt();
        e = input.nextInt();
        if (a>=3 && e<=4){
            System.out.println("TroyMartian");
        }
        if(a<=6 && e>=2){
            System.out.println("VladSaturnian");
        }
        if(a<=2 && e<=3){
            System.out.println("GraemeMercurian");
        }
    }
}

