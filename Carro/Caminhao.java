package Carro;

public class Caminhao extends Veiculo {
    private double cargaMaxima;

    public Caminhao(String marca, String modelo, String cor, int ano, double cargaMaxima) {
        super(marca, modelo, cor, ano);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Carga máxima: " + cargaMaxima + " kg");
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está se movendo.");
    }
}
