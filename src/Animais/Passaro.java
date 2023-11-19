package Animais;

public class Passaro extends Animal {

    static int numeroDePassaros;

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Eu acho que vi um gatinho");
    }
}
