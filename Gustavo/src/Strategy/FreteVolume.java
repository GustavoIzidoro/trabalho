/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author Kaique
 */
public class FreteVolume implements FreteStrategy {
    public double calcularFrete(Pedido pedido) {
        return pedido.getVolume() * 1.5; // Frete baseado no volume
    }
}
