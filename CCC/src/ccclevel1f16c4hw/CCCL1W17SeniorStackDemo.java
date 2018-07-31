/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccclevel1f16c4hw;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nanthi
 */
public class CCCL1W17SeniorStackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Stack<Integer> num = new Stack<Integer>();
        //pop, push,peek,size,isEmpty
        num.push(45);
        System.out.println(num);
        num.push(20);
        System.out.println(num);
        //peek
        System.out.println(num.peek());
        System.out.println(num.peek());
        System.out.println(num.peek());
        num.pop();//pop will remove the elemenst from the top and
        // will return it's value
        System.out.println(num.peek());
        //size will return the # of Items in the stack
        System.out.println(num.size());
        //isEmpty will return true if stack is empty
        System.out.println(num.isEmpty());
        //Usig a loop to intialize a stack
        for(int i = 0; i < 5; i++){
            int x = input.nextInt();
            num.push(x);
        }
        System.out.println(num);
        
        while(!num.isEmpty()){
            System.out.println(num.pop());
        }
    }
    
}
