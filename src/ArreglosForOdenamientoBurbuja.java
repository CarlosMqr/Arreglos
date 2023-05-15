public class ArreglosForOdenamientoBurbuja {
     public static void arregloInverso (String[] productos){
          int contador = productos.length;
          for (int i =0; i<contador/2;i++){
               String actual = productos[i];
               String inverso = productos[contador-1-i];
               productos[i] = inverso;// el primer valor del arreglo pasará al último lugar
               productos[contador-1-i] = actual;// la última posicion pasará a la primera posicion

          }
     }
     public static void metodoBurbuja(Object arreglo[]){
          //ordena los los arreglos con este metodo
          int total = arreglo.length;
          int contador2 = 0;
          for (int i=0; i <total;i++){
               for(int j=0; j<total -1 -i;j++){
                    if (  ((Comparable<Object>)arreglo[j+1]).compareTo(arreglo[j])< 0){//permite saber si un arreglo es mayor que otro
                         Object auxiliar = arreglo[j];
                         arreglo[j] = arreglo[j+ 1];
                         arreglo[j+ 1] = auxiliar;
                    }
                    contador2++;
               }
          }
          //System.out.println("contador2 = " + contador2);
     }
     public static void main(String[] args) {
          String[] productos = new String[7];
          productos[0] = "Kingston Pendrive 64GB";
          productos[1] = "Samsung Galaxy";
          productos[2] = "Disco Duro SSD";
          productos[3] = "Asus Notebook";
          productos[4] = "Macbook Air ";
          productos[5] = "Chromecast 4ta generacion";
          productos[6] = "Bicicleta Oxford";
          int contador = productos.length;

          metodoBurbuja(productos);
          //Arrays.sort(productos);
          //arregloInverso(productos);

          for (int i=0; i< contador; i++){
               System.out.println("productos " + (i) + "= " + productos[i]);
          }


          Integer[] numeros = new Integer[4];
          numeros[0] = 23;
          numeros[1] = 12;
          numeros[2] = 697;
          numeros[3] = 3;

          metodoBurbuja(numeros);

          for (int i=0; i < numeros.length; i++){
               System.out.println("numeros = " + numeros[i]);
          }








     }
}

