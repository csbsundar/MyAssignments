package Week1.day2;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7,8};
		int i;
		Arrays.sort(arr);
		int len=arr.length;
		for(i=0;i<len;i++) {
				if(arr[i]!=i+1) {	
					System.out.println("The missing element in array is:"+(i+1));
					break;	
			}
		}
		
	}
	
			}


