package Clase;

public abstract class ShowCommand {
	public abstract void alegeModel();
	public abstract void alegeTipCauciuc();
	public abstract void alegeNumarViteze();
	public final void test(){
		alegeModel();
		alegeTipCauciuc();
		alegeNumarViteze();            
	}

}
