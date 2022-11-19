package week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("100");
	}

	public static void main(String[] args) {
		
		Desktop system = new Desktop();
		system.computerModel();
		system.desktopSize();

	}

}
