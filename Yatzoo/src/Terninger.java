
public class Terninger {
	
	private int antallTerninger;
	private int antallSider;
	private Terning[] terningerArr;
	
	public Terninger() {
		antallTerninger = 0;
		antallSider = 6;
		terningerArr = null;
	}
	
	public Terninger(int antallTerninger, int antallSider) {
		this.antallTerninger = antallTerninger;
		this.antallSider = antallSider;
		
		//samler alle terninger i ein array
		this.terningerArr = new Terning[antallTerninger];
		
		int i = 0;
		//Lager terninger
		for(i = 0; i< antallTerninger; i++) {
			terningerArr[i] = new Terning(antallSider);
		}
	}
	//trill alle terninger
	public int trill() {
		
		int i = 0;
		int sum = 0;
		
		for(i = 0; i< antallTerninger; i++) {
			
			sum = sum + trillTerning(i);
		}
		
		return sum ;
		
	}
	//trill spesifikk terning
	public int trillTerning(int terningNum) {
	
		return terningerArr[terningNum].trill();
		
	}
	
	public int getTerningVerdi(int terningNum) {
		
		return terningerArr[terningNum].getVerdi();
	
	}
	
	public int leggSammen(){
	
		int i = 0;
		int sum = 0;
		
		for(i = 0; i< antallTerninger; i++) {
			
			sum = sum + getTerningVerdi(i);
		}
		
		return sum ;
		
	}
	
	public void skrivut( Terninger  ny ) {
		
		int i = 0;
		System.out.println("Terning 1	" +  "Terning 2	" + "Terning 3	" + "Terning 4	" + "Terning 5	");
		while (i < 5) {
		
			System.out.print("    " + ny.getTerningVerdi(i) +  "		");
			i++;
		}
		
	}
	public int[] lagFrek(){
		int i;
		int [] frekTabell = new int[6 + 1];
		
		for (i=0; i < 5; i++) {
			frekTabell[terningerArr[i].getVerdi()]++;
		}
		
		return frekTabell;
	}
	public boolean treLike(Terninger nyeTerninger ) {
		int[] frekTabell;
		frekTabell = nyeTerninger.lagFrek();
		boolean ertreLike = false;
		int i ;
		for (i = 1; i<= 6; i++) {
			if (frekTabell[i] >= 3) {
				ertreLike = true;
			}
		}		
		return ertreLike;
	}

	
}
