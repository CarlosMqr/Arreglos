public class arreglosCombinados {
     public static void main(String[] args) {

          int[] a,b,c;
          a = new int[10];
          b = new int[10];
          c = new int[20];

          for(int i =0; i < a.length; i++){
               a[i] = i + 1;
               //llena el arreglo a automáticamente
          }

          for(int i =0; i < b.length; i++){
               b[i] = (i + 1)*5;
               //llena el arreglo a automáticamente
          }
          int aux =0;// se tiene que crear una variable auxiliar
          for (int i =0; i < c.length/2; i++ ){
               //dentro del for se puede poner el largo de a.length o el largo de b.length
               c[aux++] = a[i];// se almacenan los elementos del arreglo "a"
               c[aux++] = b[i];// se almacenan los elementos del arreglo "b"
          }

          for (int j =0; j < c.length; j++){
               System.out.println(j + " = " + c[j]);
          }
     }
}
