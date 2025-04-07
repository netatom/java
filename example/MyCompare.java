package test;

public class MyCompare {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		if (a>50){
			System.out.println("50이상");
		}
		
		if (a %2 == 0){
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		if (a>b){
			System.out.println("a는 b보다 큼");
		} else if (a<b) {
			System.out.println("a는 b보다 작음");
		} else {
			System.out.println("a와b가 같음");
		}
	}
}
