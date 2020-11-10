
package actividad11;
import java.util.*;

/**
 *
 * @author Paul
 */
public class Actividad11 {

   
    public static void main(String[] args) {
    int opcion, figura;

    Circulo circulo = new Circulo();
    Triangulo triangulo = new Triangulo();
    Cuadrado cuadrado = new Cuadrado();
    
    System.out.println("Selecciona que valor quieres obtener");
    System.out.println("1 - Area");
    System.out.println("2 - Perimetro");
    Scanner OpcionSeleccionada = new Scanner (System.in);
    opcion = OpcionSeleccionada.nextInt();
    
    if (opcion == 1)
    {
    System.out.println("Selecciona a que figura le quieres calcular el area");
    System.out.println("1 - Circulo");
    System.out.println("2 - Triangulo");
    System.out.println("3 - Cuadrado");
    Scanner FiguraSeleccionada = new Scanner (System.in);
    figura = FiguraSeleccionada.nextInt();
        if (figura == 1)
        {
        circulo.obtenerArea();
        }
        if (figura == 2)
        {
        triangulo.obtenerArea();
        }
        if (figura == 3)
        {
        cuadrado.obtenerArea();
        }
    }
    
    
    if (opcion == 2)
    {
    System.out.println("Selecciona a que figura le quieres calcular el perimetro");
    System.out.println("1 - Circulo");
    System.out.println("2 - Triangulo");
    System.out.println("3 - Cuadrado");
    Scanner FiguraSeleccionada = new Scanner (System.in);
    figura = FiguraSeleccionada.nextInt();
        if (figura == 1)
        {
        circulo.obtenerPerimetro();
        }
        if (figura == 2)
        {
        triangulo.obtenerPerimetro();
        }
        if (figura == 3)
        {
        cuadrado.obtenerPerimetro();
        }
    }
    }
    
}
