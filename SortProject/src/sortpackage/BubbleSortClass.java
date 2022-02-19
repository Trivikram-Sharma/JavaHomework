package sortpackage;
import java.util.*;
public class BubbleSortClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the number:");
			data[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(data[i]<data[j]) {
					//Swapping elements without using temp variable if first element is smaller
					data[i] = data[i] + data[j];
					data[j] = data[i] - data[j];
					data[i] = data[i] - data[j];
				}
			}
		}
		System.out.println("Sorted array\n--------");
		for(int d:data) {
			System.out.println(d);
		}
	}

}
