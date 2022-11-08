package weeek1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153, rem, temp;
		double res = 0;
		temp = num;
		
		while(temp!=0)
		{
			rem = temp % 10;
			res = res + Math.pow(rem, 3);
			temp = temp / 10;
		}
		
		if (res == num)
			System.out.println("The given number is an Armstrong number");
		
		else
			System.out.println("The given number is not an Armstrong number");

	}

}
