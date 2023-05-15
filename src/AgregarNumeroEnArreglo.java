import java.util.Scanner;

public class AgregarNumeroEnArreglo {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int[] numeros = new int[10];
          int nuevoNum =0;
          int ultimo =0;

          System.out.println("Ingresa 10 elementos");
          for(int i=0; i < numeros.length; i++){
               System.out.print("Indice: " + i + " valor: ");
               numeros[i] = scanner.nextInt();
          }

          System.out.println("Agrega un nuevo numero");
          nuevoNum = scanner.nextInt();

          System.out.println("posicion donde se agregara el nuevo elemento (0-9): ");
          int posicion = scanner.nextInt();

          ultimo = numeros[numeros.length-1];

          for (int i = numeros.length -2; i >= posicion; i--){
               numeros[i+1] = numeros[i];
          }

          int[] num = new int[11];
          System.arraycopy(numeros,0, num, 0, numeros.length);

          num[posicion] = nuevoNum;

          num[num.length-1] = ultimo;

          for (int i=0; i < num.length; i++){
               System.out.println("Indice:" + i + " valor: " + num[i]);
          }

     }
}
