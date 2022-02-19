package maxnumpackage;
import java.util.*;
public class MaxNumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[5];
		Scanner sc = new Scanner(System.in);
		int max;
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number:");
			data[i] = sc.nextInt();
		}
		max = data[0];
		for(int i=1;i<5;i++) {
			if(max<data[i]) {
				max = data[i];
			}
		}
		System.out.println("Maximum element among the array elements is "+ max);
	}

}
