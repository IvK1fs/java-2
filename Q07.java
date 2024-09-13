package application;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite a distância em metros: "); //
	
	Double num = sc.nextDouble();
	
System.out.printf("a distância %f coreresponde a%n%.5fKm%n%.5fHm%n%.5fDam%n%.3fdm%n%.3fcm%n%.3fmm ", num, num/1000, num / 100,num / 10, num * 10, num * 100, num * 1000);

	
        sc.close();
	}

}
