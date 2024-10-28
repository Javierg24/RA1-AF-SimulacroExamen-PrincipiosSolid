/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SumulacroIncorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
// Interfaz con múltiples responsabilidades (violación del ISP)
public interface Dispositivo {

    void encender();

    void apagar();

    void guardarLog(String mensaje);
}
