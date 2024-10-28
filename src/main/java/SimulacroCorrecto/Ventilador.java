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
 * Clase que representa un ventilador que puede ser encendido o apagado.
 * Implementa la interfaz {@link Dispositivo} para manejar sus estados básicos.
 * 
 */
public class Ventilador implements Dispositivo {

    // Estado interno que indica si el ventilador está encendido (true) o apagado (false)
    private boolean encendida = false;
    
    // Instancia de Logs para registrar las acciones del ventilador
    private Logs logger;

    /**
     * Constructor que inicializa el ventilador con un sistema de registro.
     *
     * @param logger una instancia de la clase {@link Logs} para guardar registros de encendido y apagado
     */
    public Ventilador(Logs logger) {
        this.logger = logger;
    }

    /**
     * Enciende el ventilador, actualiza su estado interno y guarda un log de la acción.
     */
    @Override
    public void encender() {
        encendida = true; // Cambia el estado a encendido
        System.out.println("Ventilador encendido");
        logger.guardarLog("Ventilador encendido"); // Guarda log de la acción
    }

    /**
     * Apaga el ventilador, actualiza su estado interno y guarda un log de la acción.
     */
    @Override
    public void apagar() {
        encendida = false; // Cambia el estado a apagado
        System.out.println("Ventilador apagado");
        logger.guardarLog("Ventilador apagado"); // Guarda log de la acción
    }

    /**
     * Verifica si el ventilador está encendido.
     *
     * @return true si el ventilador está encendido; false si está apagado
     */
    @Override
    public boolean isEncendido() {
        return encendida;
    }
}

