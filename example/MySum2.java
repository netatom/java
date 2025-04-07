package test;

public class MySum2 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i=1; i<=5; i++){
			sum = sum + i;
		}
		System.out.println("sum=" + sum);
		
		String[] names = {"1","2","3","4","5"};
		//foreach
		for (String name : names) {
			System.out.println(name + "");
		}
		
	}
}
