
package State;


public class EstadoAtacando implements Estado {
    public void andar() {}
    public void correr() {}
    public void pular() {}
    public void atacar() {
        System.out.println("Personagem atacando");
    }
}
