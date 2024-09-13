package application;

import java.util.Locale;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //utilize ponto no imput<-----------------;
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o valor em reais: "); 
	
	Double num = sc.nextDouble();
	
System.out.printf("Você poderá comprar US$%.2f ", num /5.45);

	
        sc.close();
	}

}
