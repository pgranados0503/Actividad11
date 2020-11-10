/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;
import java.util.*;

class Circulo {
 
    double area,r,perimetro,b,radio,pi;
    
 // Area
    public void obtenerArea(){
    Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Opcion selecciona: Circulo.");
        System.out.println("Ingrese el radio del Circulo");
        r = inputUsuario.nextDouble();
        area = (((3.1416)*(r*r)));        
        System.out.println("El area de la figura es: " +area);
  
    }
    
    
  // Perimetro
    
   public void obtenerPerimetro(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Ingrese el radio del Circulo");
        r = inputUsuario.nextDouble();
        pi = ((3.1416)*(2));
        perimetro = pi*r;
        System.out.println("El Perimetro de la Figura es: " +perimetro);
       
    }  
    
}
