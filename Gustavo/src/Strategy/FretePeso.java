/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author Kaique
 */
public class FretePeso implements FreteStrategy {
    public double calcularFrete(Pedido pedido) {
        return pedido.getPeso() * 2.0; // Frete baseado no peso
    }
}
