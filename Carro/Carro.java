package Carro;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, String cor, int ano, int portas) {
        super(marca, modelo, cor, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + portas);
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo.");
    }
}
