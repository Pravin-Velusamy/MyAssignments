package weeek1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a1 = {25,12,1,56,9,5};
		int[] a2 = {10,18,25,27,1,9};
		int num;
		
		for(int i = 0;i<a1.length;i++)
		{
			for(int j = 0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					num = a1[i];
					System.out.println(num);
				}
			}
		}
	}

}
