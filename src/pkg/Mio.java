package pkg;

public class Mio extends KonMember{
	
	public Mio(instrument i){
		itm = i;
	}
	
	public void playInstrument(){
		itm.play();
	}
}