import java.util.Scanner;

public class TareaNumeroMayorDeArreglo {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int[] numeros = new int[7];

          for (int i =0; i < numeros.length; i++){
               System.out.print("Indice: " + i + " valor: ");
               numeros[i] = scanner.nextInt();
          }

          int mayor = 0;


          for (int i =0; i < numeros.length; i++){
               mayor = numeros[mayor] > numeros[i] ? mayor : i;
          }


          System.out.println("El numero mayor es: " + numeros[mayor]);







     }
}
