package Week1.day2;

import java.util.Arrays;

public class largestandsmallestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers []={22,3981,-19,82,0,45,37};
		Arrays.sort(numbers);
		int a=numbers.length;
		System.out.println("minimum number is " +numbers[0]);
		System.out.println("maximum number is " +numbers[a-1] );	
	}
		
		
		
	

}
