package ccclevel1f16c4hw;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean [] [] wellplan= new boolean[200][401];
		wellplan[4][199] = true;
		wellplan[5][199] = true;
		wellplan[6][199] = true;
		wellplan[0][200] = true;
		wellplan[1][200] = true;
		wellplan[2][200] = true;
		wellplan[6][200] = true;

		wellplan[2][203] = true;
		wellplan[3][203] = true;
		wellplan[4][203] = true;
		wellplan[6][203] = true;

		wellplan[4][204] = true;
		wellplan[6][204] = true;


		wellplan[2][205] = true;
		wellplan[3][205] = true;
		wellplan[4][205] = true;
		wellplan[6][205] = true;

		wellplan[2][206] = true;
		wellplan[6][206] = true;

		wellplan[2][207] = true;
		wellplan[3][207] = true;
		wellplan[4][207] = true;
		wellplan[5][207] = true;
		wellplan[6][207] = true;

		String direction = sc.next();
		boolean ok = true;
		int row = 4;
		int col = 199;
		while(direction.equals("q") && ok){
			int dr = 0;
			int dc = 0;
			if (direction.equals("l")) dc = -1;
			else if (direction.equals("u")) dc = -1;
			else if (direction.equals("r")) dc = 1;
			else if (direction.equals("d")) dc = 1;
			int distance = sc.nextInt();
			while(distance > 0){
				row = row + dr;
				col = col + dc;
				if(wellplan[row][col]) ok = false;
				else wellplan[row][col] = true;
				distance = distance - 1;
			}
			if(ok)System.out.println((col-200)+" "+(row+1)*-1+"safe");
			else{
				System.out.println((col-200)+" "+(row+1)*-1+"DANGER");
			}
			direction = sc.nextLine();
		}
	}

}
