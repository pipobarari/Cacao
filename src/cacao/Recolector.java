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
public class Recolector {
    private int tipo;
    private int color;
    private Image imagen;

    public Recolector(int tipo, int color, Image imagen) {
        this.tipo = tipo;
        this.color = color;
        this.imagen = imagen;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
}
