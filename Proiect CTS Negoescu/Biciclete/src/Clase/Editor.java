package Clase;

import Interfete.IAfisaza;

public class Editor {
	IAfisaza CurrentState;
	public Editor(){
		CurrentState=new Disponibil();
	}
	public void setStare(Stare stare){
		if(stare==Stare.DISPONIBIL){
			this.CurrentState=new Disponibil();
			
		}
		else this.CurrentState=new Indisponibil();
		
	}
	
	public void Show(String text){
		this.CurrentState.print(text);
	}
}
