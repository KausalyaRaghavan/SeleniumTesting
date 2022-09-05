package week1.day2;

import java.util.Arrays;

public class Arrayfindduplicatenumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the numer of 85  present in this
		int[] num= {22,1354,-19,18,18,18,18,0,19,19,321,321};
	      Arrays.sort(num);
		  for (int i =0;i<num.length-1;i++) {
			  if (num[i] == num[i+1]) {
				  
			System.out.println("Duplicate"+num[i]);
				 
				 }
			 
			  
			 

}
		 
}}


