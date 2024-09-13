package application;

import java.util.Locale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //utilize ponto no imput;
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o tamanho da largura: "); 
	
	Double largura = sc.nextDouble();
	
	System.out.println("Digite o valor da altura: ");
	
	Double altura = sc.nextDouble();
	
	
	
System.out.printf("A area é igual a %.2f m2%nA quantidade de tinta é %.2f Litros", largura * altura, (largura * altura) / 2);

	
        sc.close();
	}

}
