/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCC2017CLASS4;
import java.util.Scanner;

/**
 *
 * @author nanth
 */
public class JavaS16V1C5SelectionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //boolean data type
        // boolean can take values either True or False
        //Example 1
        
        boolean isRainy = false;
        
        if(isRainy){
            System.out.println("Take un umbrella with you");
        }
        System.out.println("Have fun");
        
        
        boolean isHungry = false;
        if(isHungry)
        {
            System.out.println("Call Pizza Hut");
        }
        
         //if there is only one statement following the if
        // then there is no need for curly braces
        else{
            System.out.println("Do your homework");
        }
        System.out.println("Call 911");
        
        //Example 3
        // Using relational operation in Java to make
        //decision
        
        int a = 10;
        int b = 20;
        int c = 10;
        //1) equal equal
        
        if(a == c){
            System.out.println(a + " and "+ 
                    c + " have the same values");
        }
        
        //2) != not equal
        if(a != b){
            System.out.println(a + " and "+ 
                    b + " have different values");
        }
        
        //3) > Greater than
        
        if( a <= b){
       System.out.println(a  + " is less than or equal "+ b);
        }
        //Example 4
        // Get a positive intetger n from the user
        // and determine whether it is even or odd
        int x = input.nextInt();
        
        if( x % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
    }
    
}
