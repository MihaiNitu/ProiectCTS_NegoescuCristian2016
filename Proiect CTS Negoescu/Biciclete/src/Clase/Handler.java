package Clase;

public abstract class Handler {
	protected Handler succcesor=null;

	

	public void setSucccesor(Handler succcesor) {
		this.succcesor = succcesor;
	}
	
	public abstract void PreluareCerere(Mesaj mesaj);
}
