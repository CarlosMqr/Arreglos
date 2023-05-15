import java.util.Scanner;

public class DesplazarPosicionEnArreglo {
     public static void main(String[] args) {
          /*
          programa que recorre los elementos de un arreglo asia abajo
          ejemplo
          Arreglo normal    Arreglo modificado
          índice 0 =1        índice 0 =10
          índice 1 =2        índice 1 =1
           */
          Scanner scanner = new Scanner(System.in);

          int[] a = new int[10];
          int ultimo;
          System.out.println("ingresa 10 numeros enteros");
          for (int i=0; i < a.length; i++){
               System.out.print("Ingresa numero: ");
               a[i] = scanner.nextInt();
          }

          System.out.println("Valores del arreglo inicial");

          for (int i =0; i< a.length; i++){
               System.out.println("indice :" + i +  " = " + "Valor :" + a[i]);
          }



          ultimo = a[a.length -1];// obtiene ultimo valor de indice 9 = valor 10

          for (int i = a.length-2; i >= 0; i--){// comienza a iterar en 8
               a[i+1] = a[i];//el número 8 del lado derecho baja a ser la posición 9 dentro del arreglo
          }

          a[0] = ultimo;// el último valor pasa a ser la posicion 0

          System.out.println("elementos del arreglos se corrieron asia a bajo");
          for(int i =0; i < a.length; i++){
               System.out.println("Indice = " + i + " Valor: " +  a[i]);
          }





     }
}
