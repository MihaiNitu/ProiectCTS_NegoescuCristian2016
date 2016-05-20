package Main;

import Clase.Bicicleta;
import Clase.Bicicleta.BicicletaBuilder;
import Clase.BicicletaFactory;
import Clase.Client;
import Clase.Comanda;
import Clase.CutezatorComanda;
import Clase.DrumetComanda;
import Clase.Editor;
import Clase.Furnizor;
import Clase.InitializeazaComanda;
import Clase.IntrerupeComanda;
import Clase.KentComanda;
import Clase.Mesaj;
import Clase.MessageCenter;
import Clase.MessageCenterHigh;
import Clase.MessageCenterMedium;
import Clase.Model;
import Clase.ModelFactory;
import Clase.Stare;
import Clase.TipBicicleta;
import Clase.incorectException;
import Interfete.Biciclete;
import Interfete.DisponibilitateStoc;
import Interfete.IBicicleta;

public class Main {

	public static void main(String[] args) throws incorectException {
	//  ------Singleton-------
		System.out.println("-> Singleton <-");
		Furnizor Pegas=Furnizor.PreiaInstanta();
		Pegas.DetaliiFirma();
	//	------Builder-------
		System.out.println();
		System.out.println("-> Builder <-");
		Bicicleta PegasKent=new BicicletaBuilder("Kent").AdaugaTipCauciuc("Kenda Road Runner").AdaugaNumarViteze(7).Build();
		System.out.println(PegasKent);
	//	------Factory-------
		System.out.println();
		System.out.println("-> Factory <-");
		Biciclete afisareBiciclete;
		BicicletaFactory AlegeModel=new BicicletaFactory();
		afisareBiciclete=AlegeModel.CreazaInstanta(TipBicicleta.Kent);
		System.out.println(afisareBiciclete.toString());
    // ------Chain Of Responsability-------
		System.out.println();
		System.out.println("-> Chain of Responsability <-");
		MessageCenter Mc=new MessageCenter();
		MessageCenterMedium Mcm= new MessageCenterMedium();
		MessageCenterHigh Mch= new MessageCenterHigh();
		
		Mch.setSucccesor(Mcm);
		Mcm.setSucccesor(Mc);
		Mesaj a=new Mesaj("Zona 1", 81);
		Mesaj b=new Mesaj("Zona 2", 41);
		Mesaj c=new Mesaj("Zona 3", 39);
		Mch.PreluareCerere(a);
		Mch.PreluareCerere(b);
		Mch.PreluareCerere(c);
		
	// ------Comand-------
		System.out.println();
		System.out.println("-> Comand <-");
		DisponibilitateStoc dStoc=new Comanda();
		IBicicleta bicicleta=new InitializeazaComanda(dStoc);
		Client client=new Client();
		
		client.ApeleazaComanda(bicicleta);
		client.ApeleazaComanda(bicicleta);
		client.ApeleazaComanda(bicicleta);
		client.ApeleazaComanda(bicicleta);
		
		bicicleta=new IntrerupeComanda(dStoc);
		client.ApeleazaComanda(bicicleta);
		client.ApeleazaComanda(bicicleta);
		
		client.Undo();
		client.Undo();
		client.Undo();
		client.Undo();
		client.Undo();
		client.Undo();
		
		// ------Flyweight-------
				System.out.println();
				System.out.println("-> Flyweight <-");
			ModelFactory Mf=new ModelFactory();
			Mf.PreiaModel("Kent");
			Mf.PreiaModel("Kent");
			Mf.PreiaModel("Kent");
		    Mf.PreiaModel("Drumetul");
		    Mf.PreiaModel("Drumetul");
            System.out.println("A-ti selectat " + Mf.PreiaMarime() +  " tipuri de biciclete");
            
       // ------State-------
			System.out.println();
			System.out.println("-> State <-");    
			
			Editor edt=new Editor();
			edt.Show("Kent");
			edt.setStare(Stare.INDISPONIBIL);
			edt.Show("Drumetul");
			
	  // ------Template-------
			System.out.println();
			System.out.println("-> Template <-"); 
			DrumetComanda Drumet=new DrumetComanda();
			KentComanda Kent=new KentComanda();
			CutezatorComanda Cutezator=new CutezatorComanda();
			
			Kent.test();
			System.out.println("---------");
			Drumet.test();
			
	}
	
	

}
