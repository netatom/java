package test;

public class MyClsMain {
	public static void main(String[] args) {
		MyCls a = new MyCls();
		MyCls b = new MyCls();
		a.intNum = 100;
		b.intNum = 200;
		a.showIntNum();
		b.showIntNum();
		
		a.setNum = 999;
		a.showsetNum();
		MyCls.setNum = -1;
		MyCls.showsetNum();
	}
}
