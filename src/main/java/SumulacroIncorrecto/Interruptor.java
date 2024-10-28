/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SumulacroIncorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Interruptor {

    private Lampara lampara;

    public Interruptor(Lampara lampara) {
        this.lampara = lampara;
    }

    public void presionar() {
        if (lampara.encendida) {
            lampara.apagar();
        } else {
            lampara.encender();
        }
    }
}
