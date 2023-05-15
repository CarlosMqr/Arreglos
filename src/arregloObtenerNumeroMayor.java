import java.util.Scanner;

public class arregloObtenerNumeroMayor {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);


          int[] arreglo = new int[5];
          System.out.println("ingresa 5 valores enteros");
          for (int i = 0; i < arreglo.length; i++){
               System.out.print("Valor" + i + " = ");
               arreglo[i] = scanner.nextInt();
          }


          int mayor = 0;// se usa una variable auxiliar dado que i se esta usando en el for
          for (int i = 1; i < arreglo.length; i++){
               mayor = (arreglo[mayor] > arreglo[i])? mayor : i;
               /*
               con el operador ternario realizamos lo siguiente de arriba
               mayor = 0 es la posicion del arreglo = 1
               i = 1 es la posicion del arreglo = 100

               como mayor = posicion 0 = 1 no es mayor que i = posicion 1 = 100
                */
          }

          System.out.println("el numero mayor del arreglo es = " + arreglo[mayor]);



          /*for (int i = 0; i< arreglo.length; i++){
               System.out.println("posicion " + i + " = " + arreglo[i]);
          }*/
     }
}
