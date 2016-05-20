package Clase;

import Interfete.DisponibilitateStoc;
import Interfete.IBicicleta;

public class IntrerupeComanda implements IBicicleta {
	
	private DisponibilitateStoc dStoc;
	public IntrerupeComanda(DisponibilitateStoc dStoc) {
		// TODO Auto-generated constructor stub
		this.dStoc=dStoc;
	}
	@Override
	public void executa() {
		// TODO Auto-generated method stub
		dStoc.IntrerupeComanda();
	}

	@Override
	public void nuExecuta() {
		// TODO Auto-generated method stub
		dStoc.ReprimireComanda();
	}
}
