package listingpackage;
import java.util.*;
public class Listing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number:");
			data[i] = sc.nextInt();
		}
		System.out.println("Printing numbers with for loop\n -----------------");
		for(int i=0;i<5;i++) {
			System.out.println(data[i]);
		}
		System.out.println("Printing numbers with for each loop\n--------------");
		for(int d:data) {
			System.out.println(d);
		}
	}

}
