package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
System.out.println("Digite o seu salário: ");

double salario = sc.nextDouble();

System.out.println("digite o salario minimo: ");
double salarioMinimo = sc.nextDouble;

double calc = salario / salarioMinimo; 

System.out.printf("você recebe %.3f salarios minimos", calc);




	sc.close();
	}

}
