// CRISTIANE PITANA   RA: 1292112213

package app;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList<>(5);
		
		System.out.println("INSIRA OS NUMEMROS [1,2,3,4,5] EM UMA LISTA");
		for(int i =1; i<=5; i++) {
			lista.add(i);
		}
		System.out.println(lista);
		System.out.println("\n\n");
		
		System.out.println("REMOVA TODOS OS DADOS DA LISTA");
		while (!lista.isEmpty()) {
			lista.remove(0);
			System.out.print(lista);
		}
		System.out.println("\n\n");
		
		System.out.println("INSIRA-OS EM UMA PILHA COM 5 CÉLULAS");
		Stack<Integer> pilha = new Stack<Integer>();
		for(int i =1; i<=5; i++) {
			pilha.push(i);
		}
		System.out.println(lista);
		System.out.println("\n\n");
	
		System.out.println("REMOVA TODOS OS DADOS DA PILHA");
		pilha.clear();
		System.out.println(pilha);
		System.out.println("\n\n");
		
		System.out.println("INSIRA-OS EM UMA FILA COM 10 CÉLULAS");
		ArrayDeque fila = new ArrayDeque<>(10);
		for(int i =1; i<=5; i++) {
			fila.push(i);
		}
		System.out.println(fila);
		System.out.println("\n\n");
		
		System.out.println("INSIRA OS NUMEMROS [6,7,8,9,10] EM UMA LISTA");
		for(int i =6; i<=10; i++) {
			lista.add(i);
		}
		System.out.println(lista);
		System.out.println("\n\n");
		
		System.out.println("REMOVA TODOS OS DADOS DA LISTA");
		while (!lista.isEmpty()) {
			lista.remove(0);
			System.out.print(lista);
		}
		System.out.println("\n\n");
		
		System.out.println("INSIRA-OS EM UMA PILHA COM 5 CÉLULAS");
		for(int i =6; i<=10; i++) {
			pilha.push(i);
		}
		System.out.println(lista);
		System.out.println("\n\n");
	
		System.out.println("REMOVA TODOS OS DADOS DA PILHA");
		pilha.clear();
		System.out.println(pilha);
		System.out.println("\n\n");
		
		System.out.println("INSIRA-OS EM UMA FILA COM 10 CÉLULAS");
		for(int i =6; i<=10; i++) {
			fila.push(i);
		}
		
		System.out.println("\n\nEXIBA TODOS OS NUMEROS QUE FORAM INSERIDOS NA FILA ");
		System.out.println(fila);		
	
	}

}
