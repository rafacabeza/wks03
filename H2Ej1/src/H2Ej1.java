/*1.-Escribir un programa que calcule e imprima la SUMA de los números impares
comprendidos entre a y b que deben leerse por teclado y filtrarse para que a<=b*/
import java.util.Scanner;
public class H2Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, k, suma;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir un numero entero");
		a = teclado.nextInt();
		System.out.println("Introducir un numero entero");
		b = teclado.nextInt();
		while(a > b){
			System.out.println("Introducir otro numero mayor o igual que " + a);
			b = teclado.nextInt();
		}
		suma = 0;
		for( k = a; k <= b; k++){
			if(k % 2 != 0){
				suma = suma + k;
			}
		}
		System.out.println("La suma de los numeros impares es " + suma);
		
	}//main

}//class
