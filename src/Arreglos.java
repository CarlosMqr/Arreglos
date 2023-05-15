import java.util.Arrays;

public class Arreglos {
     public static void main(String[] args) {
          String[] productos = new String[7];
          productos[0] = "Usb 64GB";
          productos[1] = "Samsung";
          productos[2] = "Disco duro ssd";
          productos[3] = "Asus notebook";
          productos[4] = "Macbook air ";
          productos[5] = "Chromecast 4ta generacion";
          productos[6] = "Bicicleta";
          int contador = productos.length;
          Arrays.sort(productos);// sirve para ordenar alfabéticamente
          /*int i=0;
          while (i < contador){
               System.out.println("productos " + (i) + "= " + productos[i]);
               i++;
          }*/
          for (int i=contador -1; i>= 0; i--){
               System.out.println("productos " + (i) + "= " + productos[i]);

          }


          int[] numeros = new int[4];
         /* int i = numeros[0];
          int j = numeros[1];           para ver lo que contiene cada elemento
          int k = numeros[2];
          int l = numeros[3];
          System.out.println("i = " + i);*/

          numeros[0] = 23;
          numeros[1] = 12;
          numeros[2] = 697;
          numeros[3] = 3;
          int contadorInt = numeros.length;
          Arrays.sort(numeros);//ordena los numeros de menor a mayor
          for (int num: numeros) {
               System.out.println(num);

          }
     }
}

