package test;

public class DataX {
	private int x;
	
	/* 생성자  */
	public DataX() {
		x = 999;
	}
	
	
	public DataX(int x) {
		this.x = x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	void disp() {
		System.out.println("x="+x);
	}
}
