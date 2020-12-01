import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sismologia {

    public static int cantidadDias() {
        Scanner leer = new Scanner(System.in);
        int cant = 31;
        try {
            while (cant < 1 || cant > 30) {
                System.out.println("Ingrese la cantidad de dias");
                cant = leer.nextInt();
                if (cant < 1 || cant > 30) {
                    System.out.println("Error, el numero de dias debe ser entre 1 y 30");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, debe ser un numero entero");
        } catch (RuntimeException e) {
            System.out.println("Error con el tiempo de uso");

        }
        return cant;
    }
    
    public static double[][] crearArreglo(int n){
        double [][] sismos = double int[n][24];
        return sismos;
    }

    public static double [][] sismosRandom (double [][] sismos, int dias){
        Random azar = new Random(19);

        for (int i=0; i<dias; i++){
            for (int j=0; j<24; j++){
                sismos[i][j] = Math.random()*9.5;
            }
        }
        return sismos;
    }

    
}
