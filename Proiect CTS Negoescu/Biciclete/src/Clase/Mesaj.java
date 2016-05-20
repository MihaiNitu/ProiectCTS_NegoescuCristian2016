package Clase;

public class Mesaj {
	private int Priority;
	private String text;
	
	public Mesaj(String text,int Priority) {
		this.text=text;
		this.Priority=Priority;
	}
	
	public int getPriority() {
		return Priority;
	}

	public String getText() {
		return text;
	}
 
	
	
	
	

}
