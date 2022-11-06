package week1.day1;


public class TwoWheeler {
	
		
		int noOfWheeles = 2;
		short noOfMirrors = 2;
		long chassisNumber = 2347984315L;
		boolean isPunctured = false;
		String bikeName = "Ns";
		double runningKM = 54598.24;
			

	public static void main(String[] args) {

		TwoWheeler bike = new TwoWheeler();
		
		System.out.println(bike.noOfWheeles);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKM);		

	}

}
