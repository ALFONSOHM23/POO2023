
import java.util.Scanner;
public class Cuadrado{
	
public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);//se crea el objeto scanner
    int opcion;
    double lado,altura,perimetro,area,base;
    
    
        System.out.println("Bienvenido\nIngresa la opcion deseada");
        System.out.println("1:Cuadrado");
        opcion = leer.nextInt();
        
        
        switch (opcion) {
            case 1:
                //Cuadrado
                System.out.println("ingresa un lado del cuadrado");
                lado = leer.nextDouble();
                System.out.println("ingresa la altura del cuadrado");
                altura = leer.nextDouble();
                //perimetro
                System.out.println("perimetro "+(perimetro = lado * 4)); 
                //area
                System.out.println("area "+(area = ((lado*lado))));
                break;
           
            default:
                System.out.println("mensaje");
        }
        
    }
}