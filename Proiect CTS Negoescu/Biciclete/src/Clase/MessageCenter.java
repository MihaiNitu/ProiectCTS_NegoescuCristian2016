package Clase;

public class MessageCenter extends Handler {

	@Override
	public void PreluareCerere(Mesaj mesaj) {
		// TODO Auto-generated method stub
		 if (mesaj.getPriority()<=40){
			 System.out.println("Discount 15% valabil in zona:"+mesaj.getText());
		 }
	}
	

}
