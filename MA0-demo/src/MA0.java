//
import java.util.Scanner;

public class MA0 {
	
	public static void main(String[] args)
	{
		System.out.println("Input a multi-digit integer (less than 2147483648):");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int temp_int = Integer.parseInt(input);
		Test(temp_int);
	}


public static void Test(int input) {
	//if input is an int 33424
	//output 3, 3, 4, 2, 4
	if (input != 0) {
		int digit = input%10; //33424%10 = 4
		input = input/10;
		Test(input);
		System.out.println(digit);
	}
}
}