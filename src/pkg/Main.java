package pkg;

public class Main{
	public static void main(String[] args){
		
		KonMember yui = new Yui(new guitar());
		KonMember ritsu = new Ritsu(new drum());
		KonMember mio = new Mio(new bass());
		KonMember tsumugi = new Tsumugi(new keyboard());
		KonMember azusa = new Yui(new guitar());
		
		yui.playInstrument();
		ritsu.playInstrument();
		mio.playInstrument();
		tsumugi.playInstrument();
		azusa.playInstrument();  // �Ǳ⸦ ������
		
		mio.setInstrument(new guitar());  // �Ǳ⸦ ������
		mio.playInstrument();
		
	}
}