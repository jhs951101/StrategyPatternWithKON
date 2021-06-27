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
		azusa.playInstrument();  // 악기를 연주함
		
		mio.setInstrument(new guitar());  // 악기를 변경함
		mio.playInstrument();
		
	}
}