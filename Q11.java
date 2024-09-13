package application;



import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite a sua idade em ano: "); 
	
	int anos = sc.nextInt();
	
	System.out.println("Digite a quantidade de meses: ");
	
	
	int meses = sc.nextInt();
	
	System.out.println("Digite a quantidade de dias: ");
	
	int dias = sc.nextInt();
	
	
System.out.printf(" a quantidade de dias é igual a %d",(anos * 365) +(meses * 30) + dias );

	
        sc.close();
	}

}
