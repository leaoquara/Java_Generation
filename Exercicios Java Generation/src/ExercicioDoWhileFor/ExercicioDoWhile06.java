package ExercicioDoWhileFor;

import java.util.Scanner;

public class ExercicioDoWhile06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero, soma = 0, contador = 0, media;
		
		
		do { 
			System.out.print("Digite um numero: ");
			numero = sc.nextDouble();
			 	if(numero % 3 == 0) {
			 		soma+=numero;
			 		contador ++;
			 		
			 	}
			}while(numero != 0);
				media = soma/(contador -1);
				System.out.println("A media dos multiplos de 3 �: " + media);	
	}	
}