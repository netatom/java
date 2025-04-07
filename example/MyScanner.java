package test;

import java.util.Scanner; // Scanner를 쓰려면 이부분을 추가해야한다

public class MyScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id;
		System.out.println("id는");
		id = scanner.nextLine();
		System.out.println("input id: " + id);
		scanner.close();
	}
	
}
