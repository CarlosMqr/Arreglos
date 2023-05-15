import java.util.Scanner;

public class EliminarUnElementoDeArreglo {
     public static void main(String[] args) {
          //Programa: elimina un elemento de un arreglo y se guarda en otro arreglo
          Scanner scanner = new Scanner(System.in);
          int[] ArregloA = new int[10];
          int[] ArregloB = new int[9];

          System.out.println("Ingresa 10 numero enteros");
          for(int i =0 ; i < ArregloA.length; i++){
               System.out.print("Indice:" + i + " valor: ");
               ArregloA[i] = scanner.nextInt();
          }


          System.out.println("Indica el numero del indice para borrar numero que desea");
          int posicion = scanner.nextInt();
          for (int i = posicion; i < ArregloA.length -1; i++ ){
               ArregloA[i] = ArregloA[i+1];
          }
          /*

          desde la posicion indicada, ejemplo posicion = 3 valor = 4
          el ArregloA[i+1] elimina el valor de la posicion 3 y ahora la posicion 3 contiene el valor 5
          y se recorren asia arriba los demas elemnetos cambinado su posicion
          ejemplo
          Antes                     despues
          indice 3 = 4             indice 3 = 5
          índice 4 = 5             indice 4 = 6
          índice 5 = 6             indice 5 = 7
          índice 6 = 7             indice 6 = 8
          índice 7 = 8             indice 7 = 9
          índice 8 = 9             indice 8 = 10
          índice 9 = 10
           */

          /*for (int i=0; i < ArregloB.length; i++){
               ArregloB[i] = ArregloA[i];
          }*/
          //otra forma de copiar los elementos del ArregloA asia ArregloB
          System.arraycopy(ArregloA,0,ArregloB,0, ArregloB.length);

          for(int i =0; i < ArregloB.length; i++){
               System.out.println("Indice:" + i + " = " + ArregloB[i]);
          }




     }//metodo main
}//clase
