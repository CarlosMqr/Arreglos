import java.util.Scanner;

public class BuscarNumeroEnArreglo {
     public static void main(String[] args) {
          /*
          Programa que busca un número en un arreglo de números y retorna la posición a la vista del usuario
           */

          Scanner scanner = new Scanner(System.in);
          System.out.print("Ingresa la cantidad de elementos del arreglo \nSolo numeros enteros: ");
          int cantidad = scanner.nextInt();// se establece la cantidad de elementos que tendrá el arreglo

          int[] numeros = new int[cantidad];
          System.out.println("Ingresa los elementos");
          for (int i =0; i<numeros.length; i++){
               System.out.print("ingresa valor" + i + " = ");
               numeros[i] = scanner.nextInt(); // se guardan los elementos
          }
          // se muestran los elementos almecenados en el arreglo
          System.out.print("Elementos del arreglo");
          for (int i=0; i<numeros.length; i++){
               System.out.print("\t" + numeros[i]);
          }

          System.out.println("\nque numero desea buscar en el arreglo");
          int buscar = scanner.nextInt();// el numero se almacena en la variable "buscar"
          int i=0;// es el contador para el while

          //forma con el for()
          //for (;i < numeros.length && numeros[i] != buscar; i++){}



          while (i < numeros.length && numeros[i] != buscar){//recorre desde i = 0 hasta i = 9
                                                             /*
                                                             mientras que el número almacenado en la variable "buscar" sea
                                                             diferente del elemento del arreglo seguirá iterando,
                                                             pero cuando sea igual, encontró la posición del número
                                                             que se desea buscar
                                                             y queda la posición en la variable de iteración i
                                                              */
               i++;
          }

          if (i == numeros.length){// si i es igual a la cantidad de elementos, no encontró el número buscado
               System.out.println("numero no encontrado");
          }else if (buscar == numeros[i]){
               System.out.println("el numero " + buscar + " se encuentra en la posicion " + (i + 1));
          }

     }
}

