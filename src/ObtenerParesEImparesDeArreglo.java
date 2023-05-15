import java.util.Scanner;

public class ObtenerParesEImparesDeArreglo {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int[] numeros = new int[10];
          int[] pares, impares;// solo se declara que son arreglos porque no se sabe su tamaño


          System.out.println("ingresa 10 numeros enteros");
          for (int i = 0; i < numeros.length; i++){ // se piden numeros al azar y se almacenan el arreglo numeros[i]
               System.out.print("Valor" + i + " = ");
               numeros[i] = scanner.nextInt();
          }
          /*
          se utilizan dos contadores para identificar cuantos números son pares y cuantos números son impares
          además estos contadores serán la cantidad de elementos que tendrá el arreglo pares y el arreglo impar
           */
          int totalPares =0;
          int totalImpares=0;

          for (int i =0; i < numeros.length; i++){// se identifican cuantos números son par y cuantos son impar
               if (numeros[i] % 2 == 0){
                    totalPares ++;
               }else
                    totalImpares++;
          }
          /*
          se inicializan los arreglos en donde se almacenaran los numeros pares e impares
          la cantidad de elementos que tendran la define el contador respectivo
           */
          pares = new int[totalPares];
          impares = new  int[totalImpares];

          /*
          se utilizan dos variables auxiliares para el arreglo pares e impares que seran su índice,
          ya que el arreglo numeros utiliza el índice i
           */

          int j=0;
          int k=0;
          for (int i =0; i < numeros.length; i++){
               if (numeros[i] % 2 == 0){
                    pares[j++] = numeros[i];
               }else {
                    impares[k++] = numeros[i];
               }
          }

          System.out.println("///// Pares ////");

          for (int i =0; i< pares.length; i++){
               System.out.print( "\t" + pares[i]);
          }
          System.out.println("\n");
          System.out.println("//// Impares //////");
          for (int i =0; i< impares.length; i++){
               System.out.print("\t" + impares[i]);
          }




     }
}
