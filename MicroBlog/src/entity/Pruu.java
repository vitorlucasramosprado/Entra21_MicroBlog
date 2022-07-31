package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pruu {
	
	private static int counter = 1;
	private int id;
	private String text;
	private int likes;
	private boolean blocked;
	private Date created_at;
	private String formattedDate;
	
	public Pruu() {
		super();
	}
	
	public Pruu(String text) {
		validateText(text);
		this.id = Pruu.counter++;
		this.text = text;
		this.likes = 0;
		this.blocked = false;
		this.created_at = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		this.formattedDate = formatter.format(created_at);
	}

	public static void validateText(String text) {
		if (text.length() > 300 || text.trim().length() < 1) {
			System.out.println("O pruu precisa ter no máximo 300 caracteres ou no mínimo 1"); 
		return;
		}
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes() {
		this.likes++;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
	
		this.blocked = blocked;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		if (isBlocked()) {
			return "Pruu"+ 
					"\nid: " + this.id +
					"\nBLOQUEADO!! \n\n";
		}
		return "Pruu"+ 
				"\nid: " + this.id +
				"\nText: " + this.text + 
				"\nLikes: " + this.likes+
				"\nCriado em: " + this.formattedDate+
				"\n\n";
	}

	
}
