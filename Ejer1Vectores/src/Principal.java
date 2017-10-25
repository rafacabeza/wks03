import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		Vector v1, v2, v3;
		int num;
		System.out.println("Cuantos elementos tendra el vector?");
		num=teclado.nextInt();
		v1= new Vector(num, -10, 10);
		v2= new Vector(num, -10, 10);
		v1.imprimeVector();
		v2.imprimeVector();
		v3=v1.sumaOtroVector(v2);
		System.out.println("*********");
		v3.imprimeVector();
	}//main

}//class
