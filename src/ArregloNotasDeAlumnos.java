import java.util.Scanner;

public class ArregloNotasDeAlumnos {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          double[] matematicas = new double[7];
          double[] historia = new double[7];
          double[] lenguaje = new double[7];

          double sumaMatematicas =0;
          double sumaHistoria =0;
          double sumaLenguaje =0;

          System.out.println("Ingresa 7 notas de alumnos de matematicas");
          for(int i = 0; i < matematicas.length; i++){
               System.out.print("Nota" + i + " = ");
               matematicas[i] = scanner.nextDouble();
          }

          System.out.println("Ingresa 7 notas de alumnos de historia");
          for(int i = 0; i < historia.length; i++){
               System.out.print("Nota" + i + " = ");
               historia[i] = scanner.nextDouble();
          }

          System.out.println("Ingresa 7 notas de alumnos de lenguaje");
          for(int i = 0; i < lenguaje.length; i++){
               System.out.print("Nota" + i + " = ");
               lenguaje[i] = scanner.nextDouble();
          }



          for (int i =0; i < 7; i++){
               sumaMatematicas += matematicas[i];
               sumaHistoria += historia[i];
               sumaLenguaje += lenguaje[i];
          }
          double promedioMate = (sumaMatematicas/matematicas.length);
          double promedioHis = (sumaHistoria/historia.length);
          double promedioLen = (sumaLenguaje/lenguaje.length);

          System.out.println("Promedio total de alumnos de matematicas =" + promedioMate );
          System.out.println("Promedio total de alumnos de historia =" + promedioHis);
          System.out.println("Promedio total de alumnos de lenguaje =" + promedioLen);

          //obtener el promedio de un solo alumno

          System.out.println("ingresa el identificador del alumno 0 - 6");
          int id = scanner.nextInt();

          double promedioAlumno = (matematicas[id] + historia[id] + lenguaje[id])/3;
          System.out.println("promedioAlumno = " + promedioAlumno);



     }
}
