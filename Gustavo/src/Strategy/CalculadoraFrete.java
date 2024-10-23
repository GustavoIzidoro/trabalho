/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;


public class CalculadoraFrete {
    private FreteStrategy strategy;

    public void setStrategy(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularFrete(Pedido pedido) {
        return strategy.calcularFrete(pedido);
    }
}
