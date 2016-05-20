package Clase;

public class MessageCenterMedium extends Handler {

	@Override
	public void PreluareCerere(Mesaj mesaj) {
		// TODO Auto-generated method stub
		
		if(mesaj.getPriority()>40 && mesaj.getPriority()<=80 ){
			System.out.println("Discount 20% valabil in zona:"+ mesaj.getText());
			
			
		}
		else {
			if(this.succcesor!=null){
				this.succcesor.PreluareCerere(mesaj);
			}
		}
	}

}
