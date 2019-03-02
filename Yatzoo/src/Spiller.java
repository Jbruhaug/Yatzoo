import java.util.Scanner;

public class Spiller {
	static int sum = 0 ;
	int nr = 0;

	public Spiller(int nr, int sum) {
		this.nr = nr;
		this.sum = sum;
				
	}
	public Spiller(int sum) {
		this.sum += sum;
				
	}

	public static void trill(int nr) {
		
		Scanner sc = new Scanner(System.in);
		Terninger nyeTerninger = new Terninger(5,6);
		int i = 0;
		int j = 0;
		nyeTerninger.trill();
		nyeTerninger.skrivut(nyeTerninger);
		System.out.println();
		
		for(i = 0; i< 3; i++) {
			System.out.println("Vil du trille om igjen? 1 for ja eller 0 for nei");
			int svar = sc.nextInt();
			if(svar <= 0) {
				break;
			}
			
			System.out.println();
			System.out.print("Hvilken terninger vil du trille på nytt, 0 for ingen");
			for(j = 0; j< 5; j++) {
				int reroll = sc.nextInt() -1;
				if(reroll < 0) {
					break;
				}
				if(reroll >= 0) {
					nyeTerninger.trillTerning(reroll);
					System.out.print("og ? 0 for ingen");
					System.out.println();
				}
			}
			nyeTerninger.skrivut(nyeTerninger);
			System.out.println();
			
	}
		System.out.println("Plasserings Alternativ");
		int valg = sc.nextInt();
		if(nyeTerninger.treLike(nyeTerninger)) {
			System.out.println(" 5 for Tre like");
		}
		
		if(valg == 5 && nyeTerninger.treLike(nyeTerninger)) {
		
		}
		
		
		System.out.println();
	
	}
	public int getNr() {
		return nr;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "Spiller [nr=" + nr + "]" + "Poeng [sum=" + sum + "]";
	}
}
