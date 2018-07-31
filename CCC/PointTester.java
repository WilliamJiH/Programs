/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCC2017CLASS4;
import java.util.Scanner;

/**
 *
 * @author Nanthi
 */
public class PointTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //Declaring an Daya Type ( Object) Called Point
        //Recall
        int [] arr = new int[10];
        //Point P1 = new Point(); When a constructor is declared 
        // you must use that to create the object
        //The Instance Variable of an Object can be accessed by the . operator
        
        //P1.x = 0;
        //P1.y = 0;
        Point A = new Point(0,0);
        Point B = new Point(3,4);
        System.out.println(A.distance(B));
        Point P1 = new Point(0,0);
        System.out.println("x: "+ P1.getX() + " y: "+P1.getY());
        Point P2 = new Point();
        System.out.println("x: "+ P2.getX() + " y: "+P2.getY());
        //The toString Method
        System.out.println(P2.toString());
        //toString is a defualt method for every objects
        //but we can modify that
        
        //Declaring an Object Array in Java
        Point [] parr = new Point[5];
        for(int i = 0; i < 5; i++){
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            Point P = new Point(x1,y1);
            P.translate(-3, -4);
            parr[i] = P;
        }
        
        //Let's print the Points
        for(int i = 0; i < 5; i++){
            System.out.println(parr[i].toString());
        }
    }
}
