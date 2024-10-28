/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimulacroCorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Interruptor {

    private Dispositivo dispositivo;

    /**
     * Crea un nuevo interruptor que controla el dispositivo especificado.
     * @param dispositivo el dispositivo a controlar, debe implementar la    
     */
    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    
    // Método para alternar el estado del dispositivo al presionar el interruptor
    public void presionar() {
        if ((dispositivo.isEncendido())) { //Comprueba el estado del dispositivo si esta encendido, lo apaga
            dispositivo.apagar(); 
        } else {
            dispositivo.encender(); //Si está apagado el dispositivo lo enciende
        }
    }

}
