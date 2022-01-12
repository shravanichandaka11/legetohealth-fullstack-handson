package com.activity.day3;

public class TestMovie {
	public static void main(String[] args) {
		
		   Movie m1 = new Movie("Frozen", "Tom");
		   System.out.println(m1.getMovieId());
		   Movie m2 = new Movie ("RRR", "Raaja","mouli", 2, 2022,"action");
		   System.out.println(m2.getMovieId());
		   Movie m3 = new Movie(" hello", " bob", "alex", 1, 2021, "comedy");
		   System.out.println(m3.getMovieId());
		   Movie m4 = new Movie ("God", " raja", "Rama", 1, 2021, "Devotional");
		   
		   System.out.println("--print movie ID with count -------");
		   System.out.println(m4.getMovieId());
		   System.out.println(m1);
		   System.out.println(m2);
		   
		   
		   System.out.println(" ----------print all attributes using using constructor---------");
		SpecialMovie sm1 = new SpecialMovie("abc", "john", "hary", 1,2021,"drama",  "vfx","dolby");
		InternationalMovie im =  new InternationalMovie("xyz", "gary", "tony", 2, 2022, "fiction", "India", "Telugu");
		System.out.println("movieName : " + sm1.getMovieName()+ " produceBy: " + sm1.getProducedBy()+ " directedBy: "+ sm1.getDirectedBy()+ " duration: " + sm1.getDuration() +"  year: " + sm1.getYear()+ " genre: " + sm1.getGenre() +sm1);
		System.out.println("movieName : " + im.getMovieName()+ " produceBy: " + im.getProducedBy()+ " directedBy: "+ im.getDirectedBy()+ " duration: " + im.getDuration() +"  year: " + im.getYear()+ " genre: " + im.getGenre() +im);
		
		
		System.out.println(" ---------print all attributes using using showDetails method---------");
		sm1.showDetails();
		im.showDetails();
		
	}
	
}