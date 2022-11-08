package weeek1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 6, fnum = 2, num = 1, sum;
		System.out.println(fnum);
		for(int i = 1;i<n;i++)
		{
			
			sum = fnum + num;
			fnum = num;
			num = sum;
			System.out.println(sum);
		}
	}

}
