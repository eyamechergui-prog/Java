package exercice;
import java.util.*;
public class ex3td4 {
public static void main(String[] args) {
	LinkedList<String> A = new LinkedList<>();
    A.add("Mohamed");
    A.add("Amira");
    A.add("Youssef");
    A.add("Sarra");
    LinkedList<String> B = new LinkedList<>();
    B.add("Khalil");
    B.add("Leila");
    B.add("Hichem");
    B.add("Rania");
    B.add("Anis");
    B.add("Meriem");
    A.addLast("Hello World");
    B.addFirst("Bonjour");
    System.out.println("Premier élément de A : " + A.getFirst());
    System.out.println("Dernier élément de B : " + B.getLast());
    A.addAll(B);
    Iterator<String> it = B.iterator();
    boolean remove = true;
    while (it.hasNext()) {
    	it.next();
    	if (remove) {
    		it.remove();
    	}
    	remove = !remove; }
    System.out.println("\nContenu de A (méthode 1) :");
    for (String nom : A) {
    	System.out.println(nom);
    }
}}

