/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;


public class MainStrategy {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(5.0, 3.0);

        CalculadoraFrete calculadora = new CalculadoraFrete();

        calculadora.setStrategy(new FreteFixo());
        System.out.println("Frete Fixo: " + calculadora.calcularFrete(pedido));

        calculadora.setStrategy(new FretePeso());
        System.out.println("Frete Peso: " + calculadora.calcularFrete(pedido));

        calculadora.setStrategy(new FreteVolume());
        System.out.println("Frete Volume: " + calculadora.calcularFrete(pedido));
    }
}