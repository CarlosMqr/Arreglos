public class EjemploArreglosOrdenPrincipioFinal {
     public static void main(String[] args) {
          int[] numeros = new int[10];
          int[] a = new int[10];

          for (int i=0; i < numeros.length; i++){// este for llena el arreglo
               numeros[i] = i + 1;//cuando i vale 0 le suma 1 y en primera posición queda 1 asi sucesivamente
          }

          int aux = 0;
          for (int i = 0; i < numeros.length/2; i++){ //otra forma de poner el largo "10 -1 -i"
               a[aux++] = numeros[i];
               a[aux++] = numeros[numeros.length -1 -i];
               /*
               de esta forma se almacenan los valores en otro arreglo
               la forma en que se almacenaran será uno y uno como en la seccion de abajo
               se necesita una variable auxiliar para ir incrementando en índice
                */

              // System.out.print(numeros[i] + " ");// imprime del i al 5
              // System.out.println(numeros[numeros.length -1 -i]);// imprime del 10 al 6
               //se imprime uno y uno

          }

          for (int i=0; i < a.length; i++){
               System.out.println("posicion " + i + " = " + a[i]);
          }
     }
}
