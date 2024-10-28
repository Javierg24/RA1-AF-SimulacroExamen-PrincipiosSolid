/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimulacroCorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
/**
 * Clase que representa una lámpara que puede ser encendida o apagada.
 * Implementa la interfaz {@link Dispositivo} para cumplir con las acciones
 * básicas de encender, apagar y verificar su estado.
 */
public class Lampara implements Dispositivo {

    // Estado interno que indica si la lámpara está encendida (true) o apagada (false)
    private boolean encendida = false;
    
    // Instancia de Logs para registrar las acciones de la lámpara
    private Logs logger;

    /**
     * Constructor que inicializa la lámpara con un sistema de registro.
     *
     * @param logger una instancia de la clase {@link Logs} para guardar registros de encendido y apagado
     */
    public Lampara(Logs logger) {
        this.logger = logger;
    }

    /**
     * Enciende la lámpara, actualiza su estado interno y guarda un log de la acción.
     */
    @Override
    public void encender() {
        encendida = true; // Cambia el estado a encendido
        System.out.println("Lámpara encendida");
        logger.guardarLog("Lámpara encendida"); // Guarda log de la acción
    }

    /**
     * Apaga la lámpara, actualiza su estado interno y guarda un log de la acción.
     */
    @Override
    public void apagar() {
        encendida = false; // Cambia el estado a apagado
        System.out.println("Lámpara apagada");
        logger.guardarLog("Lámpara apagada"); // Guarda log de la acción
    }

    /**
     * Verifica si la lámpara está encendida.
     *
     * @return true si la lámpara está encendida; false si está apagada
     */
    @Override
    public boolean isEncendido() {
        return encendida;
    }

}

