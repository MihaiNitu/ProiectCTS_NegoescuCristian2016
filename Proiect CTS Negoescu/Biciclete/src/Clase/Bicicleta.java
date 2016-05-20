package Clase;

public class Bicicleta {
	private final String Model;
	private String TipCauciuc;
	private int NumarViteze;
	
	private Bicicleta(String Model){
		this.Model=Model;
	}

	public String getTipCauciuc() {
		return TipCauciuc;
	}

	public void setTipCauciuc(String tipCauciuc) {
		TipCauciuc = tipCauciuc;
	}

	public int getNumarViteze() {
		return NumarViteze;
	}

	public void setNumarViteze(int numarViteze) {
		NumarViteze = numarViteze;
	}
	
	public String toString(){
		return "Detalii Bicicleta\nModel: "+ this.Model +"\nTipCauciuc: "+this.TipCauciuc+"\nNumar viteze: "+this.NumarViteze;
	}
	public static class BicicletaBuilder{
		private Bicicleta Bicicleta;
		
		public BicicletaBuilder(String Model){
			this.Bicicleta=new Bicicleta(Model);
		}
		public BicicletaBuilder AdaugaTipCauciuc(String TipCauciuc){
			this.Bicicleta.TipCauciuc=TipCauciuc;
			return this;
		}
		public BicicletaBuilder AdaugaNumarViteze(int NumarViteze){
			this.Bicicleta.NumarViteze=NumarViteze;
			return this;
			}
		public Bicicleta Build(){
			return this.Bicicleta;
		}
	}
	

}
