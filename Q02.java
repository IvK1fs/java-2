package application;


import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("nome do funcionário: ");
	String nome = sc.nextLine();
	
	System.out.println("Insira o seu salário: ");
	double salario = sc.nextDouble();

System.out.printf("O funcionário %s, tem um salário de R$%.2f",nome, salario);
	
        sc.close();
	}

}
