import java.util.Scanner;
public class H2Ej8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p, q, k, contadivisoresp, contadivisoresq;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Número mayor que cero?");
		p = teclado.nextInt();
		while(p < 0){
			System.out.println("¿Número mayor que cero?");
			p = teclado.nextInt();
		}
		System.out.println("¿Número mayor que cero?");
		q = teclado.nextInt();
		while(q < 0){
			System.out.println("¿Número mayor que cero?");
			q = teclado.nextInt();
		}	
		contadivisoresp=0;	
		for(k = 1; k <= p; k++){
			if(p % k == 0){				
				contadivisoresp=contadivisoresp+1;
			}
		}
		contadivisoresq=0;	
		for(k = 1; k <= p; k++){
			if(q % k == 0){				
				contadivisoresq=contadivisoresq+1;
			}
		}
		if(contadivisoresp > contadivisoresq){
			System.out.println(p + " tiene más divisores que " + q);
		}else{
			if(contadivisoresq > contadivisoresq){
				System.out.println(q + " tiene más divisores que " + p);
			}else{
				System.out.println(p + " y " + q + " tienen el mismo numero de divisores");
			}
		}
		
	}// main

}//class
