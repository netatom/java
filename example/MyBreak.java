package test;

public class MyBreak {
	public static void main(String[] args) {
		// break, continue
		int a =10;
		
		for (int i=1; i<=100; i++) {
			System.out.println("start");
			System.out.println("i="+i);
			//if (i == a ) continue;
			if (i == a ) break;
			System.out.println("end");
		}
	}
}
