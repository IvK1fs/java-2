package application;


import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in); //use valores com virgula
	
	System.out.print("Digite um número: ");
	
	double nota = sc.nextDouble();
	
	System.out.println("digite outro número: ");
	
	double notaDois  = sc.nextDouble();
	
	double calc = (nota + notaDois)/ 2 ;
	
	System.out.printf("a media entre %.2f e %.2f é igual a %.2f. ", nota, notaDois, calc); 
	
        sc.close();
	}

}
