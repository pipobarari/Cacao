/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacao;

/**
 *
 * @author NZXT
 */
public class Jugador {

    private String nombre;
    private int puntuacion;
    private Recolector recolector; 
    private Moneda moneda;
    private Aldea aldea;

    public Jugador(String nombre, int puntuacion, Recolector recolector, Moneda moneda, Aldea aldea) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.recolector = recolector;
        this.moneda = moneda;
        this.aldea = aldea;
    }
    
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Recolector getCartas() {
        return recolector;
    }

    public void setCartas(Recolector cartas) {
        this.recolector = cartas;
    }

    public Recolector getRecolector() {
        return recolector;
    }

    public void setRecolector(Recolector recolector) {
        this.recolector = recolector;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Aldea getAldea() {
        return aldea;
    }

    public void setAldea(Aldea aldea) {
        this.aldea = aldea;
    }
    
    
}
