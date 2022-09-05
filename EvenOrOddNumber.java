
package week1.day1;

import java.util.Scanner;

public class EvenOrOddNumber {
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the n value");
	int	input=n.nextInt();
	   if (input%2==0)
	System.out.println("n is a even number");
	else 
	System.out.println("n is a odd number");
}
}

