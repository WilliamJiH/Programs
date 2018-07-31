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
public class CanadianColorieCounting {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int b, d, s, de, bcal, dcal, scal, decal, total;
        bcal = 0;
        dcal = 0;
        scal = 0;
        decal = 0;
        total = 0;
        System.out.println("Please enter a burger choice");
        b = input.nextInt();
        System.out.println("Please enter a side order choice");
        s = input.nextInt();
        System.out.println("Please enter a drink choice");
        d = input.nextInt();
        System.out.println("Please enter a dessert choice");
        de = input.nextInt();
        if (b==1){
            bcal = 461;
        }
        else if (b==2){
            bcal = 431;
        }
        else if (b==3){
            bcal = 420;
        }
        else if (b==4){
            bcal = 0;
        }
        if (s==1){
            scal = 100;
        }
        else if (s==2){
            scal = 57;
        }
        else if (s==3){
            scal = 70;
        }
        else if (s==4){
            scal = 0;
        }
        if (d == 1){
            dcal = 130;
        }
        else if (d==2){
            dcal = 160;
        }
        else if (d==3){
            dcal = 118;
        }
        else if (d==4){
            dcal = 0;
        }
        if (de == 1){
            decal = 167;
        }
        else if (de==2){
            decal = 266;
        }
        else if(de==3){
            decal = 75;
        }
        else if (de==4){
            decal = 0;
        }
        total = bcal + scal + dcal + decal;
        System.out.println("Your total calorie count is " +total);
    }
}
