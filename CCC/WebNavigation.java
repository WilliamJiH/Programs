/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nanthi
 */
public class WebNavigation {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Stack<String> back = new Stack<String>();
        Stack<String> forward = new Stack<String>();
        String strInitial = "http://www.acm.org/ ";
        String command = input.nextLine();
        while(!command.equals("QUIT")){
            if(command.indexOf("VISIT")>=0){
                //push the current page on top of the backward stack
                //VISIT http://www.cnn.com
                back.push(strInitial);
                strInitial = command.substring(command.indexOf(" ")+1);
                System.out.println(strInitial);
                forward.empty();
            }
            if(command.equals("BACK") && (!back.isEmpty())){
                forward.push(strInitial);
                strInitial = back.pop();
                System.out.println(strInitial);
            }
            else if(command.equals("BACK") && (back.isEmpty())){
                System.out.println("ignored");
            }
            if(command.equals("FORWARD")&& !forward.isEmpty()){
                back.push(strInitial);
                strInitial = forward.pop();
                System.out.println(strInitial);
            }
            else if(command.equals("FORWARD")&& forward.isEmpty()){
                System.out.println("ignored");
            }
            command = input.nextLine();
        }
        
    }
}
