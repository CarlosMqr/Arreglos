import java.util.Scanner;

public class DesplazarUnaPosicionEnArreglo {
     public static void main(String[] args) {
          /*
          Programa que inserta un nuevo elemento dado por el usuario y asi mismo
          el usuario indica la posicion donde se almacenara
           */

          Scanner scanner = new Scanner(System.in);

          int[] a = new int[10];
          int elemento,posicion;
          System.out.println("ingresa 9 numeros enteros");
          for (int i=0; i < a.length-1; i++){// pide 9 numeros el ultimo por defecto es 0
               System.out.print("Ingresa numero: ");
               a[i] = scanner.nextInt();// se almacenan los elementos
          }

          System.out.println("Valores del arreglo inicial");
          for (int i =0; i< a.length; i++){// imprime los valores del arreglo
               System.out.println("indice :" + i +  " = " + "Valor :" + a[i]);
          }


          System.out.print("Agrega un nuevo elemento al arreglo: ");
          elemento = scanner.nextInt();// se pide el nuevo elemento

          System.out.print("posicion donde se agregara el nuevo elemento (0-9): ");
          posicion = scanner.nextInt();// se pide la nueva posicion donde se almacenara el elemento

          for (int i = a.length-2; i >= posicion; i--){//el for comienza a iterar desde la posicion 8


               a[i+1] = a[i]; //bajara los numeros a la siguiente posicion hasta llegar a la posicion
                              // indicada por el usuario
          }

          a[posicion] = elemento;// indica la posicion donde se guardara el nuevo elemento


          for(int i =0; i < a.length; i++){
               System.out.println("Indice = " + i + " Valor: " +  a[i]);
          }
          System.out.println("Se agrego correctamente el valor: " + elemento + " en la posicion: " + posicion);





     }
}
