/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;

public class MultipleChoice {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int lines = input.nextInt();
		String student = "";
		String teacher = "";
		int correct = 0;
		for(int i = 0; i < lines; i++){
			student += input.next();
		}
		for(int j = 0; j < lines; j++){
			teacher += input.next();
		}
		for(int k = 0; k < lines; k++){
			if(teacher.charAt(k) == student.charAt(k)){
				correct++;
			}
		}
		System.out.println(correct);
	}
}
