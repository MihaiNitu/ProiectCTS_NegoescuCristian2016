package Clase;

import java.util.LinkedList;

import Interfete.IBicicleta;

public class Client {
	LinkedList<IBicicleta> Comanda=new LinkedList<IBicicleta>();
	public void ApeleazaComanda(IBicicleta iBicicleta){
		Comanda.add(iBicicleta);
		iBicicleta.executa();
	}
	
	public void Undo(){
		Comanda.pollLast().nuExecuta();
	}

}
