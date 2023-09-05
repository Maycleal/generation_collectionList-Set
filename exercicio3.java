package collectionList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;


public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		ArrayList<Double> num = new ArrayList<Double>();
			
		
		int contador;

		for(contador = 1; contador <11; contador++) {
			System.out.println("\nDigite o " + contador + "º número: ");
			num.add(ler.nextDouble());
			
			
		}
		
		System.out.println("\nLista dados do set:" + num);
	
		
	     System.out.println("\nLista dados do set pelo Iterator:");	
	
	
		Iterator<Double> iterator = num.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		

	}

}
