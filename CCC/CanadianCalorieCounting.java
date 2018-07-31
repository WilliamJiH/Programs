
package downloads;
import java.util.Scanner;


public class CanadianCalorieCounting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] burger = {461,431,420,0};
        int [] side = {100,57,70,0};
        int [] drink = {130,160,118,0};
        int [] dessert = {167,266,75,0};
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        System.out.println("Your total calorie count is " + (burger[a-1] + side[b-1] + drink[c-1] + dessert[d-1]));
    }
}
