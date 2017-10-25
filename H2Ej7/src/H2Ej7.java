/*7.-Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero
que indicará fin de entrada de datos, el programa debe calcular y escribir la suma de los
introducidos en lugar par y los introducidos en lugar impar, es decir los introducidos
primero, tercero, quinto … etc. y la suma de los introducidos el segundo, cuarto, sexto
... etc.
*/
import java.util.Scanner;

public class H2Ej7 {

	public static void main(String[] args) {

		int num;
		int cont=0;
		int sumapar=0;
		int sumaimpar=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		while (num != 0){			
			cont=cont+1;
			
			if (cont % 2 == 0){
				
				sumapar=sumapar+num;
				
			}else{
				sumaimpar=sumaimpar+num;
			}
			
			System.out.println("Escribe un numero: ");
			num=teclado.nextInt();
		}
		
			System.out.println("El total de suma en lugar par es " + sumapar);
			System.out.println("El total de suma en lugar impar es " + sumaimpar);

	}

}
