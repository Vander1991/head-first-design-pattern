package szu.vander.safeproxy.cglibtest;

public class HelloWorldImpl {

	private String word;
	
	public HelloWorldImpl(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public void sayHello(String word) {
		
		System.out.println(this.word + " Say :" + word);
		
	}

}
