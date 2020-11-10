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
class Cuadrado {
    
    
     double area, lado, perimetro;
    
    //INTERFAZ AREA
    public void obtenerArea(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Ingrese el lado de Cuadrado");
        lado = inputUsuario.nextDouble();
        area = lado*lado;
      System.out.println("El area de la figura es: " +area);

    }
    
    //INTERFAZ PERIMETRO
    public void obtenerPerimetro(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Ingrese el lado de Cuadrado");
        lado = inputUsuario.nextDouble();
        perimetro = lado*4;
        System.out.println("El Perimetro de la Figura es: " +perimetro);
        System.exit(0);
    }
    
    
    
    
}
