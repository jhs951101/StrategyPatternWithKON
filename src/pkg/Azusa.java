package pkg;

public class Azusa extends KonMember{
	
	public Azusa(instrument i){
		itm = i;
	}
	
	public void playInstrument(){
		itm.play();
	}
}