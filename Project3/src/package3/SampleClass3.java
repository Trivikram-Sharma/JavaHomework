package package3;
import java.util.*;
public class SampleClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num%2==0)
			System.out.println("The given number is even");
		else
			System.out.println("The given number is odd");
	}

}
