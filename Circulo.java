import java.util.Scanner;//librería scanner

public class Circulo {

	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		double a,r; // área y radio
		System.out.print("Introduce el radio de un circulo: ");//
		r = sc.nextDouble();//leemos o pedimos el radio
		a=Math.PI*(r*r); // calculamos el area del circulo
		System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);//imprimimos el resultado
	}

}
