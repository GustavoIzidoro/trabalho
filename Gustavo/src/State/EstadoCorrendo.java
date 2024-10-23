
package State;

public class EstadoCorrendo implements Estado {
    public void andar() {}
    public void correr() {
        System.out.println("Personagem correndo");
    }
    public void pular() {}
    public void atacar() {}
}
