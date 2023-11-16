/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la iglesia:");
        String nombreIglesia = scanner.nextLine();

        System.out.println("Ingrese el nombre del pastor:");
        String nombrePastor = scanner.nextLine();

        System.out.println("Ingrese la cantidad de feligreses:");
        int cantidadFeligreses = scanner.nextInt();

        Iglesia iglesia = new Iglesia(nombreIglesia, nombrePastor, cantidadFeligreses);

        for (int i = 0; i < cantidadFeligreses; i++) {
            System.out.println("Ingrese el nombre del feligrés:");
            String nombreFeligres = scanner.next();

            System.out.println("Ingrese la cédula del feligrés:");
            int cedulaFeligres = scanner.nextInt();

            System.out.println("Ingrese el diezmo del feligrés:");
            double diezmoFeligres = scanner.nextDouble();

            iglesia.agregarFeligres(nombreFeligres, cedulaFeligres, diezmoFeligres, i);
        }

        iglesia.calcularImpuestosYBeneficios();

        scanner.close();
    }
}
