/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "san Agustin";
        String ciudad = "Loja";
        int numDoc = 50;
        int numEnf = 30;
        Hospital hs = new Hospital(nombre, ciudad, numDoc, numEnf);
        System.out.printf("%s\n", hs);

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.print("\nInformacion");
        System.out.print("\nIngrese Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudad = sc.nextLine();
        System.out.print("Ingrese Numero de Doctores: ");
        numDoc = sc.nextInt();
        System.out.print("Ingrese Numero de Enfermeros: ");
        numEnf = sc.nextInt();
        Hospital hs2 = new Hospital(nombre, ciudad, numDoc, numEnf);
        System.out.printf("\nDatos Informativos de un Hospital\n"
                + "Nombre Hospital: %s\n"
                + "Ciudad: %s\n"
                + "Numero Doctores: %d\n"
                + "Numero enfermeros: %d\n", hs2.obtenerNombre(),
                hs2.obtenerCiudad(),
                hs2.obtenerNumeroDoctores(),
                hs2.obtenerNumeroEnfermeros());


        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
    }
}
