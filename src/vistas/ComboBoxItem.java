/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Miguel
 */
public class ComboBoxItem {
    private int valor;
    private String texto;

    public ComboBoxItem(int value, String label) {
        this.valor = value;
        this.texto = label;
    }

    public ComboBoxItem() {
    }
    

    public int getValue() {
        return this.valor;
    }

    public String getLabel() {
        return this.texto;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    

    @Override
    public String toString() {
        return texto;
    }
}