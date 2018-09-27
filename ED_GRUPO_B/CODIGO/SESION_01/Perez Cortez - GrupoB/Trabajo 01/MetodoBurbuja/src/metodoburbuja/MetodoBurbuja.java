package metodoburbuja;

import java.util.Scanner;

public class MetodoBurbuja {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int auxiliar;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("introduce el valor de la posicion " + i + ":");
            arreglo[i] = in.nextInt();
            System.out.println(" ");
        }
        // metodo de la burbuja
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;

                }

            }
        }
        //mostrar los datos ordenados
        System.out.println("Mostrar arreglo ordenado: ");
        System.out.println( );
        for (int i = 0; i < arreglo.length; i++) {
         
            System.out.print(arreglo[i] + " / ");

        }
    }

}
