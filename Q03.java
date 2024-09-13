package application;


import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite um número: ");
	
	int numero = sc.nextInt();
	
	System.out.println("digite outro número: ");
	
	int numerodois = sc.nextInt();
	
	int calc = numero + numerodois;
	
	System.out.printf("a soma entre %d e %d é igual a %d. ", numero, numerodois, calc); 
	
        sc.close();
	}

}
