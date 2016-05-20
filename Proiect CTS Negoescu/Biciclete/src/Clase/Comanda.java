package Clase;

import Interfete.DisponibilitateStoc;

public class Comanda implements DisponibilitateStoc {

	@Override
	public void PrimesteComanda() {
		// TODO Auto-generated method stub
		
		System.out.println("Comanda a fost preluata");
	}

	@Override
	public void RespingeComanda() {
		// TODO Auto-generated method stub
		System.out.println("Comanda nu afost preluata");
	}

	@Override
	public void IntrerupeComanda() {
		// TODO Auto-generated method stub
		System.out.println("Comanda in asteptare");
		
	}

	@Override
	public void ReprimireComanda() {
		// TODO Auto-generated method stub
		System.out.println("Comanda a fost reluata");
	}
	

}
