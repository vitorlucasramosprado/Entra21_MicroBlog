package entity;

public class Administrator extends User{

	public Administrator() {
		super();
	}
	public Administrator(String name, String email, String cpf) {
		super(name, email, cpf);
	}
	
	public void blockPruu(Pruu pruu) {
		pruu.setBlocked(true);
	}
	
	public void unlockPruu(Pruu pruu) {
		pruu.setBlocked(false);
	}
	
	
}
