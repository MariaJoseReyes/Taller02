import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sismologia {
    public static void main(String[] args) {

        int dias = Sismologia.cantidadDias();
        Sismologia.crearArreglo(dias);
        mostrarOpciones();
        int opcion = elegirOpcion();
        casoOpcion(opcion);
    }

    public static int elegirOpcion(){
        Scanner leer = new Scanner(System.in);
        int opcion=0;
        try {
            while (opcion < 1 || opcion > 3) {
                System.out.println("Ingrese la opcion");
                opcion = leer.nextInt();
                if (opcion < 1 || opcion > 3) {
                    System.out.println("Error, la opcion debe ser entre 1 y 3");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, debe ser un numero entero");
        } catch (RuntimeException e) {
            System.out.println("Error con el tiempo de uso");

        }
        return opcion;
    }

    public static void casoOpcion(int opcion, double[][]sismos){
        switch (opcion){
            case 1: if (opcion==1){
                Sismologia.sismoMasIntenso(sismos);
            }
            case 2: if (opcion==2){
                Sismologia.diasSismosgrandes(sismos);
            }
            case 3: if (opcion==3)
                Sismologia.alertaEscaladaSismica(sismos);


        }
    }

    public static void mostrarOpciones(){
        System.out.println("Bienvenidx a la pagina de registros sismicos");
        System.out.println("¿Que desea hacer?");
        System.out.println("[1] ¿Cuando ocurrio el sismo mas intenso?");
        System.out.println("[2] ¿Cuantos dias ocurrieron sismos sobre o igual 5.5 grados?");
        System.out.println("[3] ¿Hay alerta de escalada sismica?");
    }

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

    public static double [][] sismosRandom (double [][] sismos){
        Random azar = new Random(19);

        for (int i=0; i<sismos.length; i++){
            for (int j=0; j<24; j++){
                sismos[i][j] = Math.random()*9.5;
            }
        }
        return sismos;
    }

    
}
