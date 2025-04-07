package test;

import java.util.Scanner;

public class MyScanner2 {
	public static void main(String[] args) {
		int a = 5;
		mymethod(a); // 메소드 호출
		System.out.print("your name: ");
		String name = getString();
		System.out.println("your name is " + name);
		double ave = average(11.11, 33.33);
		System.out.println("평균: " + ave);
		int su = maxnum(100, 300);
		System.out.println("큰값: " + su);
	}
	
	static String getString() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s; //s값을 돌려준다
	}
	
	static void mymethod(int n) {
		System.out.println("input number: " + n);
	}
	
	static double average(double x, double y) {
		double n;
		n = (x+y) / 2.0; //두수의 평균
		return n;
	}
	
	static int maxnum(int x, int y) {
		int n;
		if (x>y){
			n = x;
		} else {
			n = y;
		}
		//큰수
		return n;
	}
}
