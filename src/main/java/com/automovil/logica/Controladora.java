package com.automovil.logica;

// Recibe peticiones de la interfaz grafica y lo manda a donde sea necesario

import com.automovil.persistencia.ControladoraPersistencia;

// La logica se encarga de modelar
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil(auto);
    }
    
}
