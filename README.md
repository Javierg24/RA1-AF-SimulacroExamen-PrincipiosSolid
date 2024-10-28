# Proyecto de Simulación de Dispositivos Controlables

Este proyecto es una simulación de dispositivos electrónicos (como lámparas y ventiladores) que pueden ser controlados por un interruptor. La aplicación permite alternar el estado de los dispositivos entre encendido y apagado, y registra cada acción utilizando un sistema de logs.

## Estructura del Proyecto

El proyecto contiene las siguientes clases:

### 1. `Dispositivo` (Interfaz)
Esta interfaz define los métodos básicos que deben implementar todos los dispositivos controlables:
- `encender()`: Enciende el dispositivo.
- `apagar()`: Apaga el dispositivo.
- `isEncendido()`: Devuelve `true` si el dispositivo está encendido, `false` si está apagado.

### 2. `Lampara` (Implementa `Dispositivo`)
Representa una lámpara que puede ser encendida y apagada.
- **Atributos**:
  - `encendida`: Indica si la lámpara está encendida (`true`) o apagada (`false`).
  - `logger`: Una instancia de la clase `Logs` para registrar acciones.
- **Constructor**: Recibe un parámetro `logger` para inicializar el sistema de registro de eventos.
- **Métodos**:
  - `encender()`: Cambia el estado a encendido y registra la acción.
  - `apagar()`: Cambia el estado a apagado y registra la acción.
  - `isEncendido()`: Retorna el estado actual de la lámpara.

### 3. `Ventilador` (Implementa `Dispositivo`)
Clase similar a `Lampara`, pero representa un ventilador.
- **Atributos**:
  - `encendida`: Estado de encendido o apagado del ventilador.
  - `logger`: Instancia de la clase `Logs` para registrar acciones.
- **Constructor**: Recibe `logger` para registrar los eventos.
- **Métodos**:
  - `encender()`: Cambia el estado a encendido y registra la acción.
  - `apagar()`: Cambia el estado a apagado y registra la acción.
  - `isEncendido()`: Retorna el estado del ventilador.

### 4. `Interruptor`
Clase que controla los dispositivos implementados en la interfaz `Dispositivo`. Alterna el estado del dispositivo entre encendido y apagado.
- **Atributos**:
  - `dispositivo`: Un objeto que implementa la interfaz `Dispositivo`.
- **Constructor**: Inicializa `dispositivo` con el objeto de `Dispositivo` pasado como parámetro.
- **Método**:
  - `presionar()`: Alterna el estado del dispositivo (enciende si está apagado y viceversa).

### 5. `Logs`
Clase que gestiona los registros de eventos, mostrando cada acción en la consola.
- **Método**:
  - `guardarLog(String mensaje)`: Imprime un mensaje de log en la consola para indicar una acción realizada.

### 6. `Aplicacion`
Clase principal para ejecutar la aplicación y demostrar el funcionamiento del sistema de control de dispositivos y registro.
- **Método `main(String[] args)`**: 
  - Crea una instancia de `Logs`, luego una `Lampara` y un `Interruptor` que controla esta lámpara.
  - Alterna el estado de la lámpara usando el interruptor y registra las acciones.

