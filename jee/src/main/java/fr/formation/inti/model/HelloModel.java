package fr.formation.inti.model;

public class HelloModel {

	private String name;

	public HelloModel() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getHello() {
		if (name == null) {
			return "hello every body";
		}
		return "hello" + name;
	}
	
}
