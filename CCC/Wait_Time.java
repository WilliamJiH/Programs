/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;
import java.util.ArrayList;


public class Wait_Time {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int in=input.nextInt();
		String [] w = new String[in];
		int [] p = new int[in];
		ArrayList p1= new ArrayList();
		ArrayList count= new ArrayList();
		boolean t=false;
		for (int i=0;i<in;i++){
			w[i]=input.next();
			p[i]=input.nextInt();
		}
		for (int i=0;i<in;i++){
			for (int j=0;j<p1.size();j++){
				if ((Integer)p1.get(j)==p[i]){
					t=true;
				}
			}
			if (t==false){
				p1.add(p[i]);
				count.add(0);
			}
			if (w[i].equals("W")){
				for (int j=0;j<p1.size();j++){
					count.set(j, (Integer)count.get(j)+p[i]);
				}
			}
			else if(w[i].equals("R")){
				for (int j=0;j<p1.size();j++){
					count.set(j, (Integer)count.get(j)+p[i]);
				}
			}
			else if(w[i].equals("S")){
				for (int j=0;j<p1.size();j++){
					count.set(j, (Integer)count.get(j)+p[i]);
				}
			}
		}
	}
}
