package Clase;

public class Model {
	private String tip;
	
	public Model() throws incorectException{
		this.setTip("Pegas");
	}
	public Model(String tip) throws incorectException{
		this.setTip(tip);
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) throws incorectException {
		if(tip.length()>3&& tip.length()<10){
			this.tip=tip;
		}
		else {
			throw new incorectException();
		}
	}

}
