package com.activity.day3;

public class InternationalMovie extends Movie {
	String country;
	String language;
	
	public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year,
			String genre, String country, String language) throws IllegalArgumentException {
		super(movieName, producedBy, directedBy, duration, year, genre);
		this.country = country;
		this.language = language;
	}
	@Override
	public String toString() {
		return  "Country " + country + " Language: " + language;
 
	}
	@Override
	public String showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		return "Country " + country + " Language: " + language;
	}
	
	
}
