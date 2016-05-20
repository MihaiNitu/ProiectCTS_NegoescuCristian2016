package Clase;

import Interfete.Biciclete;

public class BicicletaFactory {
	public Biciclete CreazaInstanta(TipBicicleta TipBicicleta){
		switch(TipBicicleta){
		case Kent:return new Kent();
		case Drumet:return new Drumet();
		case Cutezator:return new Cutezator();
		}
		return null;
		
	}
}
