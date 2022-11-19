package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	
	public void getStudentInfo(String name, int id) {
		System.out.println("Pravin, 22");
	}
	
	public void getStudentInfo(long phoneNumber, String email) {
		System.out.println("789685995L, pravin.v25@gamil.com");
	}

	public static void main(String[] args) {
		
		Students stud = new Students();
		stud.getStudentInfo(22);
		stud.getStudentInfo("Pravin", 22);
		stud.getStudentInfo(789685995L, "pravin.v25@gamil.com");
		

	}

}
