/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SumulacroIncorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
// Clase que representa una lámpara (violación del SRP y del OCP)
public class Lampara implements Dispositivo {

    boolean encendida = false;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Lámpara encendida");
        guardarLog("Lámpara encendida");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Lámpara apagada");
        guardarLog("Lámpara apagada");
    }

    @Override
    public void guardarLog(String mensaje) {
        // Guardar el log en un archivo (violación de SRP, la clase tiene dos responsabilidades )
        System.out.println("Guardando log: " + mensaje);
    }
}
