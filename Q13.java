package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual será a porcetagem do IPI:");
	
	Double IPI = sc.nextDouble();
	
	System.out.println("insira o codigo da peça 1: ");
	
	int codUm = sc.nextInt();
	
	System.out.println("Insira o valor da peça: ");
	
	Double precoUm = sc.nextDouble(); 
	
	System.out.println("insira a quantidade de peças: ");
	
	int quantPecas1 = sc.nextInt();
	
System.out.println("insira o codigo da peça 2: ");
	
	int codDois = sc.nextInt();
	
	System.out.println("Insira o valor da peça: ");
	
	Double precoDois = sc.nextDouble(); 
	
	System.out.println("insira a quantidade de peças: ");
	
	int quantPecas2 = sc.nextInt();
	
	System.out.printf("o valor total será %f", (double)(precoUm*quantPecas1 + precoDois*quantPecas2)*(IPI/100 + 1));
	sc.close();
	}

}
