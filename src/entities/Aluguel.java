package entities;

public class Aluguel {

	private String name;
	private String email;
	private Integer numeroQuarto;

	public Aluguel() {
	}

	public Aluguel(String name, String email, Integer numeroQuarto) {
		this.name = name;
		this.email = email;
		this.numeroQuarto = numeroQuarto;
	}

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

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	
	public String toString() {
		return  name + ", "+ email;
	}
}
