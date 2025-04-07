package test;

public class MySwitch {
	public static void main(String[] args) {
		int b = 200;
		
		switch (b) {
		case 100:
			System.out.println("b는 100");
			break;
		case 200:
			System.out.println("b는 200");
			break;
		default:
			System.out.println("b는 초기값");
			break;
		}
	}
}
