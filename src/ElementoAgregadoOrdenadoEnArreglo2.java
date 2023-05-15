import java.util.Scanner;

public class ElementoAgregadoOrdenadoEnArreglo2 {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          float[] arreglo = new float[7];
          float numero;
          int posicion;
          float ultimo =0f;
          System.out.println("Agrega 7 numeros");
          for (int i =0; i < arreglo.length; i++){
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
          ultimo = arreglo[arreglo.length-1];// se respalda el ultimo valor de l arreglo para que no se pierda
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

          float[] arregloB = new float[8];
          System.arraycopy(arreglo,0,arregloB,0,arreglo.length);

          if (numero > ultimo){
               arregloB[arregloB.length-1] = numero;
          }else {
               arregloB[arregloB.length-1] = ultimo;
               arregloB[posicion] = numero;
          }

          //System.out.println("El numero " + numero + " se ordeno con los numeros contenidos en el arreglo");
          for (int i=0; i< arregloB.length; i++){
               System.out.println("Indice: " + i + " valor: " + arregloB[i]);

          }








     }
}
