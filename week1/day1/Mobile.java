package week1.day1;

public class Mobile {
	
	String mobileBrandName = "Vivo";
	char mobileLogo = 'V';
	short noOfMobilePiece = 200;
	int modelNumber = 9;
	long mobileNumber = 9236478388L;
	float mobilePrice = 19999.99f;
	boolean isDamaged = true;
	
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		System.out.println(obj.mobileBrandName);
		System.out.println(obj.mobileLogo);
		System.out.println(obj.noOfMobilePiece);
		System.out.println(obj.modelNumber);
		System.out.println(obj.mobileNumber);
		System.out.println(obj.mobilePrice);
		System.out.println(obj.isDamaged);
		

	}

}
