package downloads;

import java.util.Scanner;

public class ThestudentCoucilBreakfast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pp = sc.nextInt();
		int gp = sc.nextInt();
		int rp = sc.nextInt();
		int op = sc.nextInt();
		int mamount = sc.nextInt();
		int tcombination = 0;
		int max = Integer.MAX_VALUE;
		
		for(int i = 0; i <= mamount/pp;i++){
			for(int j = 0; j <= mamount/gp; j++){
				for(int k = 0; k <= mamount/rp; k++){
					for(int l = 0; l <= mamount/op; l++){
						if(i * pp + j * gp + k * rp + l * op == mamount){
							System.out.println("# of PINK is " + i +
									"# of GREEN is " + j +
									"# of RED is "+ k +
									"# of ORANGE is "+l);
							if((i+j+k+l)< max){
								max = (i + j + k + l);
							}
							tcombination++;
						}
					}
				}
			}
		}
	}

}
