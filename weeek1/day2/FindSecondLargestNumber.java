package weeek1.day2;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
		int[] arr = {25, 22, 21, 56, 18, 9};
		int temp = 0, n = arr.length;
		
		for (int i=0;i<arr.length;i++)
		{
			
			for (int j=i+1;j<arr.length;j++)
			{
				
				if(arr[j]<arr[i])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array after sorting in ascending order\n");
		
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Second largest number in the array: " +arr[n-2]);

	}

}
