/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;
import java.util.*;

/**
 *
 * @author Paul
 */
class Triangulo {
     //DECLARACIÓN DE VARIABLES
    double area, a, perimetro,b,l;
    
    //INTERFAZ AREA
    public void obtenerArea(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Ingrese la base del Triangulo");
        b = inputUsuario.nextDouble();
        System.out.println("Ingresa la altura del Triangulo");
        a = inputUsuario.nextDouble();
        area = ((b*a)/2);
        System.out.println("El area de la figura es: " +area);
        
    }
    
    //INTERFAZ PERIMETRO
    public void obtenerPerimetro(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Opcion selecciona: Triangulo.");
        System.out.println("Ingrese el lado de Triangulo");
        l = inputUsuario.nextDouble();
        perimetro = l+l+l;
        System.out.println("El Perimetro de la Figura es: " +perimetro);
        
    }
}
