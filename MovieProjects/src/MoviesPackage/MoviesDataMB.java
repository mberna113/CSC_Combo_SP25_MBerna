package MoviesPackage;

public class MoviesDataMB { // this is the DRIVER for MoviesMB

	public static void main(String[] args) {
		//MoviesMB myMovie = new MoviesMB();

		//getValues(myMovie);
		//printMovie(myMovie);
		//System.out.println(myMovie.toString());
		
		MoviesMB nextMovie = new MoviesMB("The Dark Knight", "Christopher Nolan", 152, 9, 94, 2);
		System.out.println(nextMovie.toString());
		
		
		
	}//end main
	
	public static void getValues(MoviesMB myMovie){

		myMovie.setNameofMovie("Avatar");
		myMovie.setDirector("James Cameron");
		myMovie.setMinutes(220);
		myMovie.setRating(9.5);
		myMovie.setRottenTomatoScore(9);
	}//end getValues
	
	public static void printMovie(MoviesMB myMovie) {
		//System.out.println(myMovie);
		
		System.out.println("Name of Movie: " + myMovie.getNameofMovie());
		System.out.println("Director: " + myMovie.getDirector());
		System.out.println("Run-time: " + myMovie.getMinutes());
		System.out.println("Rating: " + myMovie.getRating());
		System.out.println("Rotten Tomato's Score: " + myMovie.getRottenTomatoScore());
				
	}//end printMovie
	
	

}
