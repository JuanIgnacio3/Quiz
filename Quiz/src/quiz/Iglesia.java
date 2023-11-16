/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Iglesia {
    public String nombre;
    public String nombrePastor;
    public int cantidadFeligreses;
    public Feligres[] feligreses;

    public Iglesia(String nombre, String nombrePastor, int cantidadFeligreses) {
        this.nombre = nombre;
        this.nombrePastor = nombrePastor;
        this.cantidadFeligreses = cantidadFeligreses;
        this.feligreses = new Feligres[cantidadFeligreses];
    }

    public void agregarFeligres(String nombre, int cedula, double diezmo, int index) {
        Feligres feligres = new Feligres(nombre, cedula, diezmo);
        feligreses[index] = feligres;
    }

    public void calcularImpuestosYBeneficios() {
        double totalDiezmos = 0;

        for (Feligres feligres : feligreses) {
            totalDiezmos += feligres.diezmo;
        }

        double impuestoMunicipalidad = totalDiezmos * 0.09;

        double impuestoComedorMunicipal = totalDiezmos * 0.21;

        double gananciaPastor = totalDiezmos * 0.70;

        System.out.println("Informe:");
        System.out.println("Monto total de ganancias de la iglesia: " + totalDiezmos);
        System.out.println("Monto para la municipalidad (infraestructura): " + impuestoMunicipalidad);
        System.out.println("Monto para el comedor municipal: " + impuestoComedorMunicipal);
        System.out.println("Monto de ganancia para el pastor: " + gananciaPastor);

        // Lista de nombres y cédulas de personas con diezmo 0
        System.out.println("Personas con diezmo igual a 0:");
        for (Feligres feligres : feligreses) {
            if (feligres.diezmo == 0.0) {
                System.out.println("Nombre: " + feligres.nombre + ", Cédula: " + feligres.cedula);
    }
}

// Lista de nombres y cédulas de personas con diezmo mayor a 100000
System.out.println("Personas con diezmo mayor a 100000:");
for (Feligres feligres : feligreses) {
    if (feligres.diezmo > 100000) {
        System.out.println("Nombre: " + feligres.nombre + ", Cédula: " + feligres.cedula);
    }
}
    }
}
