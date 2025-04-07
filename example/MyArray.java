package test;

public class MyArray {
	public static void main(String[] args) {
		//배열
		int[] a = new int[10]; //오른쪽 []안에 값을 반드시 넣어야 한다
		for(int i=0; i<a.length; i++){ // 배열 크기만큼 반복
			a[i] = i +1;
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+"");
		}
	}
}
