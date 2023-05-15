import java.util.Scanner;

public class TareaNumeroMayorOcurrenciaArreglo {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("ingresa 10 numero y algunos repetidos");

          int[] arreglo = new int[10];
          for (int i=0; i < arreglo.length; i++){
               System.out.print("Indice: " + i + " valor: ");
               arreglo[i] = scanner.nextInt();
          }

          int[] repetidos = new int[10];


          for (int i=0; i < arreglo.length; i++){
               int contador =0;
               for (int j=0; j < arreglo.length; j++){
                    if (arreglo[i] == arreglo[j]){
                         contador ++;
               }
               }
               repetidos[i] = contador;
          }

          int indice =0;
          int max =0;

          for (int i =0; i< 10; i++){
               if(max < repetidos[i]){
                    max = repetidos[i];
                    indice = i;
               }
          }

          System.out.println("El numero con mayor ocurrencia es: "+ arreglo[indice] + "\n" + " numero de repeticiones: " + max);




     }
}
