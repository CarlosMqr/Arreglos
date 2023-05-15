import java.util.Scanner;

public class TareaArregloPrimeroUltimo {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          /*
          intercala los valores del arreglo empezando por el primero después el último asi sucesivamente
          guardando los valores en un nuevo arreglo
           */
          System.out.println("Ingresa 10 numeros enteros");

          int[] arregloA = new int[10];
          int[] arregloB = new int[10];
          for (int i =0; i < arregloA.length; i++){
               System.out.print("Indice:" + i + " :") ;
               arregloA[i] = scanner.nextInt();// se almacenan los valores
          }

          int aux =0;// se necesita de una variable auxiliar ya que i se esta usando

          for (int i =0; i< arregloA.length/2; i++){
               arregloB[aux++] = arregloA[i];//toma el primer valor del arreglo y lo almacena
               arregloB[aux++] = arregloA[arregloA.length -1 -i];// toma el último valor y lo almacena
               /*
               primer valor 1
               último valor 10
               segundo valor 2
               penultimo valor 9
               de esa forma se almacenan los valores en el arregloB
                */

          }

          for (int i=0; i < arregloB.length; i++){
               System.out.println("Indice: " + i + " valor: " + arregloB[i]);
          }


     }//main
}// clase
