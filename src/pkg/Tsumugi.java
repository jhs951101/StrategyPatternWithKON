package pkg;

public class Tsumugi extends KonMember{
	
	public Tsumugi(instrument i){
		itm = i;
	}
	
	public void playInstrument(){
		itm.play();
	}
}