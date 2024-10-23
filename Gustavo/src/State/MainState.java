/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;


public class MainState {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();

        Estado andando = new EstadoAndando();
        Estado correndo = new EstadoCorrendo();
        Estado pulando = new EstadoPulando();
        Estado atacando = new EstadoAtacando();

        personagem.setEstado(andando);
        personagem.andar();

        personagem.setEstado(correndo);
        personagem.correr();

        personagem.setEstado(pulando);
        personagem.pular();

        personagem.setEstado(atacando);
        personagem.atacar();
    }
}
