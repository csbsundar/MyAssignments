package Week1.day2;

public class Primenumber {
	public static void main(String[] args) {
		int num = 9;
		boolean flag =false;

		for (int i = 2; i < 15; i++) {
			int rem = num % i;
			if(rem == 0)
			{
				flag = true;
				break;

		}

		}
		if(flag) {

			System.out.println("given number "+num+ "is not a prime nuumber");
		}
		else {

			System.out.println("given number "+num+ "is  a prime nuumber");
		}

	}

}
	


