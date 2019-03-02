import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class Spill {

	
	public static void main(String [] args) {
		
		int antallSpillere;
		int runde = 1;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hvor mange spillere ?");
		antallSpillere = 1 + sc.nextInt();
		List<Spiller> spillere = new ArrayList<>();
		for(int s = 1; s < antallSpillere; s ++) {
			spillere.add(new Spiller(s, 0));
		}
		System.out.println(spillere);
		
		
			
		while( runde < 3) {
			System.out.println("Runde " + (runde) + " starter");
			System.out.println();
			
			while( j < antallSpillere - 1) {
				System.out.println("Spiller nr: " + (j+1) + " sin tur");
				System.out.println("Spiller nr: " + (j+1) + " trillet disse terningene");
				System.out.println();
				Spiller.trill(j+1);
				j++;
			}
			j=0;
			System.out.println("Runde " + runde + " er ferdig");
			runde++;
			
			
		}
		System.out.println(spillere);
	}
	
}

