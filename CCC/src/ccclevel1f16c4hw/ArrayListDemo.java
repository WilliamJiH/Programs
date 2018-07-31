package ccclevel1f16c4hw;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//declaring an array list to store integers
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();
		//add element
		num.add(10);
		num.add(20);
		System.out.println(num);
		//size of array list
		System.out.println(num.size());
		//insert element in a specific location
		num.add(1,30);
		System.out.println(num);
		//remove an element
		System.out.println(num.remove(2));//remove the element in the index 2
		System.out.println(num);
		//returning the index of an element
		//[10,30]
		num.add(30);
		//[10,30,30]
		System.out.println(num.indexOf(30));
		//set
		num.set(0, 100);//set will change the element specified by the index
		System.out.println(num);
		//get method
		System.out.println(num.get(0));
		
		
	}

}
