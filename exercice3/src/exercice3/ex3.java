package exercice3;

public class ex3 {

	public static void main(String[] args) {
		int[] tableau = {1,2,3,4,5,6,7,8,9,10};
		int somme = 0;
        for(int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        System.out.println("La somme des éléments du tableau est : " + somme);
        for(int i = 0; i < tableau.length / 2; i++) {
            int temp = tableau[i];
            tableau[i] = tableau[tableau.length - 1 - i];
            tableau[tableau.length - 1 - i] = temp;
        }
        System.out.print("Tableau inversé : ");
        for(int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

	}

}
