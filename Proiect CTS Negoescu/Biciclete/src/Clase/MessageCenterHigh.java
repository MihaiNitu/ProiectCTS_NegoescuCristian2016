package Clase;

public class MessageCenterHigh extends Handler {

	@Override
	public void PreluareCerere(Mesaj mesaj) {
		// TODO Auto-generated method stub
		
		if(mesaj.getPriority()>80 ){
			System.out.println("Discount 10% valabil in zona:"+ mesaj.getText());
			
			
		}
		else {
			if(this.succcesor!=null){
				this.succcesor.PreluareCerere(mesaj);
			}
		}
	

		
	}
	

}
