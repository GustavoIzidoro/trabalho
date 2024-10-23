/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;


public class Pedido {
    private double peso;
    private double volume;

    public Pedido(double peso, double volume) {
        this.peso = peso;
        this.volume = volume;
    }

    public double getPeso() {
        return peso;
    }

    public double getVolume() {
        return volume;
    }
}
