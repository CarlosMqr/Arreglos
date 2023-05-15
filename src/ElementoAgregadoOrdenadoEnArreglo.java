import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class ElementoAgregadoOrdenadoEnArreglo {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          float[] arreglo = new float[7];
          float numero;
          int posicion;
          System.out.println("Agrega 6 numeros");
          

          for (int i =0; i < arreglo.length -1; i++){
               System.out.print("Valor: " + i + " : ");
               arreglo[i] = scanner.nextInt();
          }

          boolean descendente = false;
          boolean ascendente = false;
          for (int i=0; i < arreglo.length-2; i++){
               if (arreglo[i] > arreglo[i + 1]){
                    descendente = true;
               }

               if (arreglo[i] < arreglo[i + 1]){
                    ascendente = true;
               }
          }

          if (ascendente == true && descendente == true){
               System.out.println("Arreglo desordenado\nPor favor agregar los numeros ordenados");

               main(args);
               System.exit(0);
          }


          System.out.println("Ingresa un nuevo numero: ");

          numero = scanner.nextFloat();

          posicion =0;

          while (posicion < 6  && numero > arreglo[posicion]){
               posicion++;
          }
          /*
          recorre de desde la posicion 0 hasta 6 e identifica si el número es mayor al del arreglo
           */

          for (int i = arreglo.length-2; i >= posicion; i--){
               arreglo[i+1] = arreglo[i];
          }
          /*
          recorre desde i = 5 hasta posicion = 0
          dependiendo del número ingresado por el usuario seran las posiciones que bajara el arreglo
          el índice 6 queda con el valor 0 para poder asi recorrer
           */



          arreglo[posicion] = numero;
          //System.out.println("El numero " + numero + " se ordeno con los numeros contenidos en el arreglo");
          for (int i=0; i< arreglo.length; i++){
               System.out.println("Indice: " + i + " valor: " + arreglo[i]);

          }








     }
}
