package application;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite um número: "); //utilize virgula;
	
	Double num = sc.nextDouble();
	
System.out.printf("O dobro de %.2f é %.2f%nA terça parte de %.2f é %.4f",num, num *2, num, num/3 );

	
        sc.close();
	}

}
