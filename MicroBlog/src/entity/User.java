package entity;

import java.util.ArrayList;

public class User {
	
	private String name;
	private String email;
	private String cpf;
	private ArrayList<Pruu> pruu;
	
	public User() {
		super();
	}
	
	public User(String name, String email, String cpf) {
		super();
		this.name = name;
		this.email = email;
		this.cpf = cpf;
	}
	
	
	public void addLike(Pruu pruu) {
		pruu.setLikes();
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
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Pruu> getPruu() {
		return pruu;
	}

	public void setPruu(ArrayList<Pruu> pruu) {
		this.pruu = pruu;
	}
	
}
