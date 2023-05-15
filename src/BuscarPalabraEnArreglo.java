import java.util.Scanner;

public class BuscarPalabraEnArreglo {
     public static void main(String[] args) {
          /*
          Programa que busca un número en un arreglo de números y retorna la posición a la vista del usuario
           */

          Scanner scanner = new Scanner(System.in);
          System.out.print("Ingresa la cantidad de palabras del arreglo \nSolo numeros enteros: ");
          int cantidad = scanner.nextInt();// se establece la cantidad de elementos que tendrá el arreglo

          String[] numeros = new String[cantidad];
          System.out.println("Ingresa las palabras");
          for (int i =0; i<numeros.length; i++){
               System.out.print("ingresa palabra: ");
               numeros[i] = scanner.next(); // se guardan los elementos
          }
          // se muestran los elementos almecenados en el arreglo
          System.out.println("Elementos del arreglo");
          for (int i=0; i<numeros.length; i++){
               System.out.print("\t" + numeros[i]);
          }

          System.out.println("\nPalabra que desea buscar en el arreglo");
          String buscar = scanner.next();// el numero se almacena en la variable "buscar"
          int i=0;// es el contador para el while

          //forma con el for()
          //for (;i < numeros.length && numeros[i] != buscar; i++){}



          while (i < numeros.length && !numeros[i].equalsIgnoreCase(buscar)){//recorre desde i = 0 hasta i = 9
                                                             /*
                                                             mientras que el número almacenado en la variable "buscar" sea
                                                             diferente del elemento del arreglo seguirá iterando,
                                                             pero cuando sea igual, encontró la posición del número
                                                             que se desea buscar
                                                             y queda la posición en la variable de iteración i
                                                              */
               i++;
          }

          if (i==numeros.length){// si i es igual a la cantidad de elementos, no encontró el número buscado
               System.out.println("numero no encontrado");
          }else if (buscar.equalsIgnoreCase(numeros[i])){
               System.out.println(buscar + " se encuentra en la posicion " + (i + 1));
          }

     }
}

