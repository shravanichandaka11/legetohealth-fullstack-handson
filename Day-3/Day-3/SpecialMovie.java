package com.activity.day3;

public class SpecialMovie extends Movie {
	
	String visualEffects;
	String soundEffects;
	
	public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String genre,
			String visualEffects, String soundEffects) throws IllegalArgumentException {
		super(movieName, producedBy, directedBy, duration, year, genre);
		System.out.println("constructor called");
		this.visualEffects = visualEffects;
		this.soundEffects = soundEffects;
	}
	
	@Override
	public String toString() {
		return   "visual Effects: " + visualEffects + "sound effects: " + soundEffects  ;
	}

	@Override
	public String showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		return "visual Effects: " + visualEffects + "sound effects: " + soundEffects ;
	}
	

}
