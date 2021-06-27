package pkg;

public abstract class KonMember{
	protected instrument itm;
	
	public void setInstrument(instrument i){
		this.itm = i;
		System.out.println("The instrument has been changed");
	}
	
	public abstract void playInstrument();
}