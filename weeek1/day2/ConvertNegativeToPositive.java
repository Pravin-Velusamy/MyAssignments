package weeek1.day2;

public class ConvertNegativeToPositive {
	
	public int coversion(int negativeNumber) {
		
		if(negativeNumber < 0)
			negativeNumber = -negativeNumber;
		return negativeNumber;

	}

	public static void main(String[] args) {
		
		int a = -25;
		ConvertNegativeToPositive obj = new ConvertNegativeToPositive();
		
		int result = obj.coversion(a);
		System.out.println("After converting negative number to positive number: " +result);
	}

}
