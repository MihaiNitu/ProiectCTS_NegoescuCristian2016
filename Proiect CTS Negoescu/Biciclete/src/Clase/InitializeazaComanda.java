package Clase;

import Interfete.DisponibilitateStoc;
import Interfete.IBicicleta;

public class InitializeazaComanda implements IBicicleta {

	private DisponibilitateStoc dStoc;
	public InitializeazaComanda(DisponibilitateStoc dStoc) {
		// TODO Auto-generated constructor stub
		this.dStoc=dStoc;
	}
	@Override
	public void executa() {
		// TODO Auto-generated method stub
		dStoc.PrimesteComanda();
	}

	@Override
	public void nuExecuta() {
		// TODO Auto-generated method stub
		dStoc.RespingeComanda();
	}
	
}
