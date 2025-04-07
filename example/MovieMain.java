package test;

public class MovieMain {
	
	public static void main(String[] args) {
		Movie[] movies = {
				new Movie(1, "고질라", "SF", 120),
				new Movie(2, "고질라2", "SF", 100),
				new Movie(3, "고질라3", "SF", 150),
				new Movie(4, "고질라4", "SF", 140),
				new Movie(5, "고질라5", "SF", 90)
		};
		
		for (Movie movie : movies) {
			movie.disp();
			System.out.println("=====");
		}
	}
}
