package test;

public class MyCast {
	public static void main(String[] args) {
		int a =10;
		System.out.println(a);
		
		float b = a; //10.0f 묵시적 캐스트
		System.out.println(b);
		
		float c = 3.14f;
		int d = (int)3; // 컴파일 에러 명시적 캐스트
		System.out.println(d);
	}
}
