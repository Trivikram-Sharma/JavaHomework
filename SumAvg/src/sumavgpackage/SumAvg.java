package sumavgpackage;

import java.util.*;
public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = new int[5];
		int sum=0,avg;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number:");
			data[i] = sc.nextInt();
		}
		for(int d:data) {
			sum +=d;
		}
		avg = sum/data.length;
		System.out.println("Sum of the five numbers is :"+sum);
		System.out.println("Average of the five numbers is: "+avg);
	}

}
