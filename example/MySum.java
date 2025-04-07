package test;

public class MySum {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i<=5000) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum=" + sum);
		
		do {
			sum = sum + i;
			i++;
		} while (i<=5000);
		System.out.println("sum=" + sum);
	}
}
