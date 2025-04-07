package test;

public class DataXY extends DataX {
	int y;
	
	/* 생성자 */
	public DataXY() {
		super(123); //x의 값을 세팅
		y = -888;
	}
	
	void disp_y() {
		System.out.println("x=" + getX() + " y=" +y);
	}
	
	//overload
	void disp(int x) {
		System.out.println("overload x=" + getX() + " y=" +y);
	}
	
	//override
	void disp() {
		System.out.println("override x=" + getX());
	}
	
	public static void main(String[] args) {
		DataX d1 = new DataX();
		d1.disp();
		
		DataXY d2 = new DataXY();
		//d.x = 100;
		//d.setX(100);
		//d.y = 200;
		d2.disp_y();
		d2.disp(1);
		d2.disp();
		
	}
}
