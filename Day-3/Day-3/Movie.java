package com.activity.day3;

public class Movie {
	private String movieName;
	private String producedBy;
	private String directedBy;
	private int duration;
	private int year;
	private String genre;
	
	private String movieId ;
	public String getMovieId() {
		return movieId =  movieName + "_" +  movieCount;
	}
	static int movieCount;
	
	// instance block which is called every time we create an object  
	{
		//System.out.println("instance block called");
		movieCount++;
		//System.out.println(movieCount);
	}
public Movie(String movieName, String producedBy) throws IllegalArgumentException{
	if((movieName ==null )|| movieName.trim().isEmpty()) {
		throw new IllegalArgumentException("Argument required");
	}
	if ((producedBy==null) ||(movieName.trim().isEmpty())) {
		throw new IllegalArgumentException("Argument required");
	}
	this.producedBy =producedBy;
	this.movieName = movieName;
	
}
public Movie(String movieName, String producedBy,String directedBy,int duration,int year, String genre) throws IllegalArgumentException{
	this (movieName, producedBy);
	if((directedBy ==null )|| directedBy.trim().isEmpty()) {
		throw new IllegalArgumentException("Argument required");
	}
	if ((genre==null) ||(genre.trim().isEmpty())) {
		throw new IllegalArgumentException("Argument required");
	}
	if (year == 0) {
		throw new IllegalArgumentException("Argument required");
	}
	if (duration == 0) {
		throw new IllegalArgumentException("Argument required");
	}
	this.directedBy =directedBy;
	this.duration = duration;
	this.genre = genre;
	this.year = year;
	
	
}
@Override
public String toString() {
	return "movieName : " + movieName+ " produceBy: " + producedBy+ " directedBy: "+ directedBy +"  duration: " + duration +"  year: " + year+ " genre: " + genre ;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getProducedBy() {
	return producedBy;
}
public void setProducedBy(String producedBy) {
	this.producedBy = producedBy;
}
public String getDirectedBy() {
	return directedBy;
}
public void setDirectedBy(String directedBy) {
	this.directedBy = directedBy;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public static int getMovieCount() {
	return movieCount;
}
public static void setMovieCount(int movieCount) {
	Movie.movieCount = movieCount;
}
public void setMovieId(String movieId) {
	this.movieId = movieId;
}

public String showDetails() {
	return "movieName : " + movieName+ " produceBy: " + producedBy+ " directedBy: "+ directedBy +"  duration: " + duration +"  year: " + year+ " genre: " + genre ;
}
}
