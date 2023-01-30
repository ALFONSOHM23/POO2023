
import javax.swing.JOptionPane;
public class Areas{

 public static void main(String args[]){
 
  String valor=JOptionPane.showInputDialog("Elija que figura desea calcular\n1.-Circulo\n2.-Cuadrado\n3.-Exit");
  int opcion=Integer.parseInt(valor);
 
  switch(opcion){
  
   case 1:{
    valor=JOptionPane.showInputDialog("Radio");
    double radio=Double.parseDouble(valor);
    double area=3.1416*(radio*radio);
    System.out.println("El area es: "+area);
    double circumference= Math.PI*2*radio;
    System.out.println("La circunferencia es: "+circumference);
   break;
   }
   
   case 2:{
    valor=JOptionPane.showInputDialog("Lado");
    double side=Double.parseDouble(valor);
    double diagonal=Math.sqrt(side+side);
    System.out.println("La diagonal es: "+diagonal);
    double area=(side*side);
    System.out.println("El area es: "+area);
    double perimeter=(side*4);
    System.out.println("El perimetro es: " +perimeter);
    break;
    }
   
   case 3: {
	System.out.println("Exit program");
	System.exit(0);
   break;
   }
  
  }
  return;
 }
}