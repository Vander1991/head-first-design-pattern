package szu.vander.duck;

public class Duck implements Comparable<Duck> {

	private String name;
	
	private int weight;

	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int compareTo(Duck o) {
		if(this.weight < o.weight) {
			return -1;
		} else if(this.weight > o.weight) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
