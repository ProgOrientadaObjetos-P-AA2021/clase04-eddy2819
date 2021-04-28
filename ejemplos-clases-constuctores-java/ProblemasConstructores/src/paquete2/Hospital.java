/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Hospital {

    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;

    public Hospital(String nom, String ci, int nd, int ne) {
        nombre = nom;
        ciudad = ci;
        numeroDoctores = nd;
        numeroEnfermeros = ne;
    }

    /*
        Crear un constructor que reciba como parámetros
        valores que serán asignados a los atributos.
    
     */
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerNumeroDoctores(int n) {
        numeroDoctores = n;
    }

    public void establecerNumeroEnfermeros(int n) {
        numeroEnfermeros = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroDoctores() {
        return numeroDoctores;
    }

    public int obtenerNumeroEnfermeros() {
        return numeroEnfermeros;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Informativos de un Hospital\n"
                + "Nombre Hospital: %s\n"
                + "Ciudad: %s\n"
                + "Numero Doctores: %d\n"
                + "Numero enfermeros: %d\n", obtenerNombre(),
                obtenerCiudad(),
                obtenerNumeroDoctores(),
                obtenerNumeroEnfermeros());
        return cadena;
    }

}
