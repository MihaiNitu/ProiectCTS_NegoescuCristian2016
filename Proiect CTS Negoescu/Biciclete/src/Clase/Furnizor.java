package Clase;

public class Furnizor {
	private String nume;
	private String adresa;
	private int id;
	
	private static Furnizor Instanta;
	
	private Furnizor() throws incorectException{
		this.nume="Pegas";
		this.adresa="Piata Romana nr 9";
		this.setId(1234);
	}
	

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public void DetaliiFirma(){
		System.out.println("Furnizorul: "+ this.nume +" \nPunct de lucru: " + this.adresa );
	}
	public static Furnizor PreiaInstanta() throws incorectException{
		if(Instanta==null){
			Instanta=new Furnizor();
		}
		return Instanta;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) throws incorectException {
		if(id==1234){
			this.id = id;
		}
		else{
			throw new incorectException();
		}
		
		
	}
	
}
