package application;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Insira o seu nome: ");
	String nome = sc.nextLine();
	
System.out.printf("Olá %s, é um prazer de te conhecer!",nome);
	
        sc.close();
	}

}
