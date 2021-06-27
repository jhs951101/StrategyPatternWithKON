package pkg;

public class Ritsu extends KonMember{
	
	public Ritsu(instrument i){
		itm = i;
	}
	
	public void playInstrument(){
		itm.play();
	}
}