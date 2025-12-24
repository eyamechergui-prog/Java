package EX2Td2;

public class somme {

	public static void main(String[] args) {
		int somme, x;
        somme = 0;
        x = 1;

        while(x <= 10) {
            somme += x;  
            x++;         
        }

        System.out.println("la somme vaut : " + somme);

	}

}
