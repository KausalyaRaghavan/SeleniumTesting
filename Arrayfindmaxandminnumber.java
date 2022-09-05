package week1.day2;

import java.util.Arrays;

public class Arrayfindmaxandminnumber {

	public static void main(String[] args) {
		
		int[] num= {22,1354,-19,18,0,19,321};
		Arrays.sort(num);
	  for (int i =0;i<num.length;i++) {
		System.out.println(num[i]);
		
}
	  System.out.println("Minium number is "+num[0]);
	  System.out.println("Maximum number is "+num[6]);
	  
}}

