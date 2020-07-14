
package arreglo;
import utils.Leer;
public class ejercicio {
    public static void MetodoArreglo () {
        int f;
        System.out.println("Tamaño del arreglo : ");
        f=Leer.entero();
        int[] a = new int[f+1];
        System.out.println("Ingresar elemntos: ");
        for (int i = 1; i < a.length; i++) {
            System.out.println("a["+i+"]:");
            a[i]=Leer.entero();    
        }
        System.out.println("Los elementos del arreglo son :");
        for (int i = 1; i < a.length; i++) {
            System.out.println("a["+i+"]:"+a[i]);
        }   
    }
    public static void main(String[] args) {
       MetodoArreglo(); 
    }
}
