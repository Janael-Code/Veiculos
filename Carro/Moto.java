package Carro;

public class Moto extends Veiculo {
    private boolean temCapacete;

    public Moto(String marca, String modelo, String cor, int ano, boolean temCapacete) {
        super(marca, modelo, cor, ano);
        this.temCapacete = temCapacete;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tem capacete: " + (temCapacete ? "Sim" : "Não"));
    }

    @Override
    public void mover() {
        System.out.println("A moto está se movendo.");
    }
}
