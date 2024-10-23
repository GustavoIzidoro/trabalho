/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;


public class Personagem {
    private Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void andar() {
        estado.andar();
    }

    public void correr() {
        estado.correr();
    }

    public void pular() {
        estado.pular();
    }

    public void atacar() {
        estado.atacar();
    }
}
