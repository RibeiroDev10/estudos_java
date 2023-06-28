package entities;

public class Rent {

	// Atributos da classe
	private String name;
	private String email;

	// Construtores
	public Rent() {

	}

	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// toString
	public String toString() {
		return name 
				+ ", "
				+ email;
	}

}