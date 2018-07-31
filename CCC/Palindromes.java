/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;

public class Palindromes {
	public static boolean ispalindrome(String in11) {
		String in1="";
		for (int i=in11.length()-1;i>=0;i--){
			in1=in1.concat(in11.substring(i,i+1));
		}
		if (in1.equals(in11)){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int in=input.nextInt();
		String [] palindrome = new String[in];
		String [] in1 = new String[in];
		for (int i=0;i<in;i++){
			in1[i]=input.next();
		}
		for (int i=0;i<in1.length;i++){
			for (int j=0;j<in1[i].length();j++){
				for (int k=in1[i].length();k>=j+1;k--){
					if (ispalindrome(in1[i].substring(j, k))){
						if (palindrome[i]==null||in1[i].substring(j, k).length()>palindrome[i].length()){
							palindrome[i]=in1[i].substring(j, k);
						}
					}
				}
			}
		}
		for (int l=0;l<palindrome.length;l++){
			System.out.println(palindrome[l]);
			System.out.println(palindrome[l].length());
		}
	}
}
