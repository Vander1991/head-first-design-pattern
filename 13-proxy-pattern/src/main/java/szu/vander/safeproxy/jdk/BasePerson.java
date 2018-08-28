package szu.vander.safeproxy.jdk;
/**
* @author : Vander Choi
* @date : 2018-08-21
* @description :
*/
public interface BasePerson {

	public String getName() ;

	public void setName(String name);

	public String getGender();

	public void setGender(String gender);

	public String getInterests();

	public void setInterests(String interests);

	public int getRating();

	public void setHotOrNotRating(int rating);

	public int getRatingCount() ;
	
}
