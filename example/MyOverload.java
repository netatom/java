package test;

// 메소드 오버로드
// 메소드 이름은 같은데 매개변수 형, 개수가 틀려도 다른 메소드로 인식

public class MyOverload {
	public static void main(String[] args) {
		disp();
		disp(1);
		disp(1.1);
	}
	
	static void disp() {
		System.out.println("Java");
	}
	
	static void disp(int n) {
		System.out.println("Java " + n);
	}
	
	static void disp(double n) {
		System.out.println("Java " + n);
	}
}
