import java.util.InputMismatchException;
import java.util.Scanner;
public class MENU {

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
                Sismologia.diasSismosgrandes(sismos, dias);
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
}
