/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloads;
import java.util.Scanner;
/**
 *
 * @author Allen
 */
public class Primary_Arithmetic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i=0;i<1;i--){
			int o=input.nextInt();
			int count=0;
			int t=input.nextInt();
			if(t==0&&o==0){
				i=10;
			}
			else{
				int o1=Integer.toString(o).length();
				int t1=Integer.toString(t).length();
				int[] o2 = new int[o1];
				int[] t2 = new int[t1];
				for (int j=0;j<o1;j++){
					o2[j]=Integer.parseInt(Integer.toString(o).substring(j,j+1));
				}
				for (int j=0;j<t1;j++){
					t2[j]=Integer.parseInt(Integer.toString(t).substring(j,j+1));
				}
				int o3=o1-1;
				int t3=t1-1;
				while (t3>-1&&o3>-1){
					if (t2[t3]+o2[o3]>=10){
						if (t3-1>-1&&o3-1>-1){
							count+=1;
							o2[o3-1]+=(Integer)((t2[t3]+o2[o3])/10);
						}
						else {
							count+=1;
						}
					}
					t3-=1;
					o3-=1;
				}
				if (count==0){
					System.out.println("No carry operation.");
				}
				else {
					System.out.println(count+" carry operations.");
				}
			}
		}
	}
}
