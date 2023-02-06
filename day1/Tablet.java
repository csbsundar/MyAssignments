package Week1.day1;

public class Tablet {
	public void sendsms() { 
		System.out.println("From oppo");
	}		
		public void makeCall() {
			System.out.println("Calling my friend");
		}
		public static void main(String[] args) {
		Tablet tab= new Tablet();
		tab.sendsms();
		tab.makeCall();
		}
}
		

