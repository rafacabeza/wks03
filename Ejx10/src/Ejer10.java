import java.util.Scanner;
public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, conta, pp; // posible primo
		boolean encontrado;
		System.out.println("Introdce un numero");
		n = sc.nextInt();
		while (n < 0){
			System.out.println("Introdce un numero");
			n = sc.nextInt();
		}
		
		pp = n;
		encontrado = false;
		while (encontrado == false){
			pp = pp - 1; conta = 0;// pruebo con otro numero para ver si es primo
			for (k=2; k<pp-1; k++){// probando divisores
				if (pp % k == 0){
						conta = conta + 1;
				}
			}
			if (conta==0){ // si no tiene divisores es primo
				encontrado = true;
				System.out.println("El numero " +pp + " es el primo más cercano a " +n +" por debajo");
			}
		}
		
	}//main

}//Class
