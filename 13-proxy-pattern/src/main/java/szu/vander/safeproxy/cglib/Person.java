package szu.vander.safeproxy.cglib;
/**
* @author      : Vander
* @date        : 2018-08-21
* @description ： 
*/
public class Person {

	private String name;
	
	private String gender;
	
	private String interests;
	
	private int rating;
	
	private int ratingCount = 0;

	public Person(String name, String gender, String interests) {
		this.name = name;
		this.gender = gender;
		this.interests = interests;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public int getRating() {
		return rating;
	}

	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		ratingCount++;
	}

	public int getRatingCount() {
		return ratingCount;
	}
	
}
