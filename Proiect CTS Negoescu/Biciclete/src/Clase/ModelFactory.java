package Clase;

import java.util.HashMap;

import Interfete.Flyweight;

public class ModelFactory implements Flyweight{
	private HashMap<String, Model> Tipuri=new HashMap<String, Model>();

	@Override
	public Model PreiaModel(String tip) throws incorectException {
		
		Model Feluri=Tipuri.get(tip);
		if(Feluri==null){
			Feluri=new Model(tip);
			
			Tipuri.put(tip, Feluri);	
		}
		
		return Feluri;
	}

	public int PreiaMarime(){
		return Tipuri.size();
	}
}
