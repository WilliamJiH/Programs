package CCC2017CLASS3;
//??????
import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=4;i++){
			for(int j = 4 - i; j >= 0;j--){
				System.out.println(" ");
			}
			
			for(int k = 1; k <=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=1;i<=3;i++){
			for(int j=1;j<=i-1;j++){
				System.out.println(" ");
			}
			
			for(int k=1;k<=7-2*1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
