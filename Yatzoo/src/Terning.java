import java.util.Random;

public class Terning {
	private int antallSider;
	private int verdi;
	
	public Terning() {
		antallSider = 5;
		verdi = 0;
	}
	
	public Terning(int sider) {
		antallSider = sider;
		verdi= 0;
    
	}
	
	public int trill() {
		verdi = (int)((Math.random() * antallSider) + 1);
		return verdi;
		
	}
	public int getAntallSider() {
		return antallSider;
	}
	public int getVerdi() {
		return verdi;
	}
	public void setAntallsider(int antallSider) {
		this.antallSider = antallSider;
	}
	


}
