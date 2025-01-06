package Carro;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected String cor;
    protected int ano;

    public Veiculo(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
}
