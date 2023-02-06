package Week1.day1;

public class Mobile {
	public void makeCall() {
System.out.println("make a call to my friend");
String mobileModel ="SamsungA52";
Float mobileWeight = 180.1f;
System.out.println("mobile model is" +mobileModel);
System.out.println("mobile weight is" +mobileWeight);

	}

public void sendMessage() {
	System.out.println("send a message to my friend");
	boolean isFullyCharged=true;
	System.out.println("is mobile is fully charged" +isFullyCharged);
}
public static void main(String[]args) {
	Mobile mobileDetails = new Mobile();
	System.out.println("This is my mobile");
	mobileDetails.makeCall();
	mobileDetails.sendMessage();
}
}
