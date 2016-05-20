package Clase;

import Interfete.IAfisaza;

public class Indisponibil implements IAfisaza {

	@Override
	public void print(String text) {
		// TODO Auto-generated method stub
		System.out.println("Stocul este indisponibil: " + text);

	}

}
