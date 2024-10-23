
package State;


public class EstadoPulando implements Estado {
    public void andar() {}
    public void correr() {}
    public void pular() {
        System.out.println("Personagem pulando");
    }
    public void atacar() {}
}
