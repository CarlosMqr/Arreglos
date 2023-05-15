import java.util.Scanner;

public class DetectarOrdenDelArreglo {
     public static void main(String[] args) {
          /*
          Programa que identifica si los elementos de un arreglo van en forma ascendente o descendente
          además de identificar si están desordenados o si todos los elementos son iguales
           */
          Scanner scanner = new Scanner(System.in);
          int[] a = new int[7];
          System.out.println("Ingresa 7 números");

          for (int i = 0; i < a.length; i++){
               System.out.print("Valor " + i + " = ");
               a[i] = scanner.nextInt();
          }

          boolean ascendente = false;
          boolean descendente = false;
          for (int i =0; i<a.length -1; i++){ // los verifica al mismo tiempo
               if (a[i] > a[i + 1]){ //verifica que los numeros vayan de mayor a menor
                    descendente = true;
               }

               if (a[i] < a[i + 1]){ // verifica que los numeros vayan de menos a mayor
                    ascendente = true;
               }
          }

          if (ascendente == true && descendente == true){// identifica si hay numeros intercalados mayor menor o menor mayor
               System.out.println("Arreglos desordenado");
          }

          if (ascendente == false && descendente == false){// si todos los numeros son los mismos
               System.out.println("Todos los números son iguales");
          }

          if (ascendente == true && descendente == false){// si los numeros van de menor a mayor
               System.out.println("Arreglos ordenado ascendente");
          }

          if (ascendente == false && descendente == true){// si los numeros van de mayor a menor
               System.out.println("Arreglos ordenado descendente");
          }







     }
}

