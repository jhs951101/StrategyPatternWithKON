package pkg;

public class Yui extends KonMember{
	
	public Yui(instrument i){
		itm = i;
	}
	
	public void playInstrument(){
		itm.play();
	}
}