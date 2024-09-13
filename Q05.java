package application;


import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite um número: ");
	
	int num = sc.nextInt();
	
System.out.printf("O sucessor de %d é %d%nO antecessor de %d é %d", num, num + 1, num , num -1 );

	
        sc.close();
	}

}
