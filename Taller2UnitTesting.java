import java.util.InputMismatchException;

public class Taller2UnitTesting {
    public int verificarSismos() {
        int dias;
        do {
            try {
                Scanner leer = new Scanner(in);
                dias = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Dato inválido");
            }
        }while(true);
    int[][] datosSensor = new int[dias][24];
        for (int x=0; x < datosensor.length; x++){
            for (int y=0; y < datosSensor[x].length; y++) {
            }
        }

    /*public int[] ordenarMayorMenor(int[] valores) {
        for (int x = 0; x < valores.length; x++) {
            for (int i = 0; i < valores.length - x - 1; i++) {
                if (valores[i] < valores[i + 1]) {
                    int temp = valores[i + 1];
                    valores[i + 1] = valores[i];
                    valores[i] = temp;
                }
            }
        }
        return valores;*/
    }
}
