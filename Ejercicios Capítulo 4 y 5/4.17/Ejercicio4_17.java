import java.util.Scanner;

public class Ejercicio4_17 {

public static void main(String[] args) {

    int kilometros = 0;
    int litros = 0;
    int kilometrosTotales=0;
    int litrosTotales=0;
    double promedio=0;
    Scanner in = new Scanner(System.in);

    while (kilometros != -1 ) {
    System.out.println("Introduzca numero de kilometros en su viaje \n"+ "");
    kilometros = in.nextInt();
    kilometrosTotales +=kilometros;
    System.out.println("Introduzca numero de litros en su viaje");
    litros = in.nextInt();
    litrosTotales += litros;

    promedio = kilometros/litros;
    System.out.println("Los kilometros por litro de este viaje son:"+ promedio);

    }
    promedio = litrosTotales /kilometrosTotales;
    System.out.println("El promedio kilometros por litro es:"+promedio);


}

}