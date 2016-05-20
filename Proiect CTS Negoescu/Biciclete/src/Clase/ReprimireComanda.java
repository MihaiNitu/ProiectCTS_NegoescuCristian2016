package Clase;

import Interfete.DisponibilitateStoc;
import Interfete.IBicicleta;

public class ReprimireComanda  implements IBicicleta{
	private DisponibilitateStoc dStoc;
	public ReprimireComanda(DisponibilitateStoc dStoc) {
		// TODO Auto-generated constructor stub
		this.dStoc=dStoc;
	}
	@Override
	public void executa() {
		// TODO Auto-generated method stub
		dStoc.ReprimireComanda();
	}

	@Override
	public void nuExecuta() {
		// TODO Auto-generated method stub
		dStoc.IntrerupeComanda();
	}

}
