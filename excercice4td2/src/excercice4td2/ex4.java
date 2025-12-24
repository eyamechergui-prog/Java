package excercice4td2;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrez la première valeur (x) : ");
	    int x = clavier.nextInt();
	    System.out.print("Entrez la deuxième valeur (y) : ");
        int y = clavier.nextInt();
        int max = (int)Math.max(x, y); 
        System.out.println("La valeur maximum est : " + max);
        clavier.close(); 


	}

}
