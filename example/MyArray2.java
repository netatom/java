package test;

public class MyArray2 {
	public static void main(String[] args) {
		//배열
		int[] a = {1,2,3,4,5}; // 배열이 5개로 자동생성
		int[][] b = { // 배열이 2행 5열로 자동생성
				{11,22,33,44,55},
				{111,222,333,444,555}
		};
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
