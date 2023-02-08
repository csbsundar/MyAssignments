package Week1.day2;


public class Palindrome {

	public static void main(String[] args) {
		int input= 34343;
		int num= input;
		int temp = 0;
		for(int i= num;i>0;i = i/10)
		{
			//System.out.println("loop start");
			int rem= i % 10;
			 temp = (temp * 10) + rem;


		}
		if(input == temp) {
			System.out.println("given number " +num+ "is palindrome");

		}
		else {
			System.out.println("given number " +num+ "is not a palindrome");

		}
		//System.out.println(num);

	}

}
	