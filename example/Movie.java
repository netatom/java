package test;

public class Movie {
	// 필드선언
	private int id;
	private String title;
	private String janre;
	private int time;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setJanre(String janre) {
		this.janre = janre;
	}
	
	// 생성자
	public Movie() {
		
	}

	public Movie(int id, String title, String janre, int time) {
		this.id = id;
		this.title = title;
		this.janre = janre;
		this.time = time;
	}
	
	//메소드선언
	void disp() {
		System.out.println("id: " + id);
		System.out.println("title: " + title);
		System.out.println("janre: " + janre);
		System.out.println("time: " + time);
	}
}
