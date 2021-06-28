/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacao;

import javafx.scene.image.Image;

/**
 *
 * @author NZXT
 */
class Aldea {
    private Image fondo;
    private Image personaje;
    private Image cacao;
    private Image sol;
    private int cantidadCacao;
    private int cantidadSol;
    private int cantidadSaltos;

    public Aldea(Image fondo, Image personaje, Image cacao, Image sol, int cantidadCacao, int cantidadSol, int cantidadSaltos) {
        this.fondo = fondo;
        this.personaje = personaje;
        this.cacao = cacao;
        this.sol = sol;
        this.cantidadCacao = cantidadCacao;
        this.cantidadSol = cantidadSol;
        this.cantidadSaltos = cantidadSaltos;
    }

    public Image getFondo() {
        return fondo;
    }

    public void setFondo(Image fondo) {
        this.fondo = fondo;
    }

    public Image getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Image personaje) {
        this.personaje = personaje;
    }

    public Image getCacao() {
        return cacao;
    }

    public void setCacao(Image cacao) {
        this.cacao = cacao;
    }

    public Image getSol() {
        return sol;
    }

    public void setSol(Image sol) {
        this.sol = sol;
    }

    public int getCantidadCacao() {
        return cantidadCacao;
    }

    public void setCantidadCacao(int cantidadCacao) {
        this.cantidadCacao = cantidadCacao;
    }

    public int getCantidadSol() {
        return cantidadSol;
    }

    public void setCantidadSol(int cantidadSol) {
        this.cantidadSol = cantidadSol;
    }

    public int getCantidadSaltos() {
        return cantidadSaltos;
    }

    public void setCantidadSaltos(int cantidadSaltos) {
        this.cantidadSaltos = cantidadSaltos;
    }
    
    
    
}
