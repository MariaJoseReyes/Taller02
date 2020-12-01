import java.util.InputMismatchException;
import java.util.Scanner;

public class Taller02UnitTesting {
    
    public static void main(String[] args) {

        int dias = cantidadDias();
        crearArreglo(dias);

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
                sismoMasIntenso(sismos);
            }
            case 2: if (opcion==2){
                diasSismosgrandes(sismos);
            }
            case 3: if (opcion==3)
                alertaEscaladaSismica(sismos);

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
        double [][] sismos = new double [n][24];
        return sismos;
    }

    public static double [][] sismosRandom (double [][] sismos, int dias){
        Random azar = new Random();

        for (int i=0; i<dias; i++){
            for (int j=0; j<24; j++){
                sismos[i][j] = Math.random()*9.5;
            }
        }
        return sismos;
    }

    public static void diasSismosgrandes (double[][] sismos){
        int acumdias =0;
        for(int i=0; i< sismos.length; i++){
            for (int j=0; j<24; j++){
                if (sismos[i][j]>= 5.5){
                    acumdias= acumdias+1;
                }
            }
        }
        System.out.println("La cantidad de dias que hubieron sobre o igual a 5.5 grados en la escala de Ritcher fueron: ");
        System.out.println(acumdias);
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

    public static double[][] crearArreglo(int n) {
        double[][] sismos = new double[n][24];
        return sismos;
    }

    public static double[][] sismosRandom (double[][] sismos) {
        Random azar = new Random();

        for(int i=0; i<sismos.length; i++){
            for(int j=0; j<24; j++) {
                sismos[i][j] = Math.random()*9.5;
            }
        }
        return sismos;
    }

    public static void sismoMasIntenso(double [][] sismos) {
        double intensidad = 0;
        int hora = 0;
        int dia = 0;
        for(int i=0; i<sismos.length; i++){
            for(int j=0; j<24; j++) {
                if(sismos[i][j] > intensidad) {
                    intensidad = sismos[i][j];
                    dia = i+1;
                    hora = j;
                }
            }
        }
        System.out.println("El sismo más intenso registrado fue de "+intensidad+" grados, el día "+dia+" a las "+hora+":00 horas");
    }



    public static void alertaEscaladaSismica(double[][] sismos) {
        int lecturas = 0;
        int dia = 0;
        for(int i=0; i<sismos.length; i++) {
            for (int j = 0; j < 24; j++) {
                if (sismos[i][j] > 6) {
                    lecturas++;
                }
            }
            if (lecturas > 3) {
                dia = i + 1;
                System.out.println("Hay alerta de escalada sísmica en el día " + dia);
            }else {
                System.out.println("No hay alerta de escalada sísmica");
            }
            lecturas = 0;
        }
    }
}
