import java.util.*;

public class Vector {
	private int v[];

	Vector(int cuantos){
		v=new int[cuantos];
	}

	Vector(int cuantos, int valorFijo){
		v=new int[cuantos];
		Arrays.fill(v, valorFijo);
	}

	Vector(int cuantos, int desde, int hasta){
		v=new int[cuantos];
		aleatorio(desde, hasta);
	}

	public void aleatorio(int desde, int hasta){
		Random azar= new Random();
		int k;
		for(k=0; k < v.length; k++){
			v[k]=azar.nextInt(hasta-desde+1) + desde;
		}
	}
	public void imprimeVector(){
		int k;
		System.out.println();
		for(k=0;k<v.length;k++){
			System.out.printf(" %3d ",v[k]);
		}		
	}

	public Vector sumaOtroVector(Vector otroVector){
		Vector suma=null;
		int k;
		if(v.length==otroVector.v.length){
			suma=new Vector(v.length);
			for(k=0;k<v.length;k++){
				suma.v[k]=v[k]+otroVector.v[k];
			}
		}
		return suma;
	}






}//class Vector
