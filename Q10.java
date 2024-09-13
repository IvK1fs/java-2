package application;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite a quantidade de kilometros: "); 
	
	Double km = sc.nextDouble();
	
	System.out.println("Digite a quantidade de dias: ");
	
	Double dias = sc.nextDouble();
	
	
	
System.out.printf("O valor a ser cobrado será: R$%.2f", (90 * dias)+(km * 0.20) );

	
        sc.close();
	}

}
