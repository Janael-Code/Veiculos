package Carro;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fiat", "Uno", "Vermelho", 2020, 4);
        Veiculo moto = new Moto("Honda", "CB 500", "Preta", 2021, true);
        Veiculo caminhao = new Caminhao("Mercedes-Benz", "Actros", "Branco", 2018, 18000);

        System.out.println("Informações do Veículo 1:");
        carro.exibirInformacoes();
        carro.mover();
        System.out.println();

        System.out.println("Informações do Veículo 2:");
        moto.exibirInformacoes();
        moto.mover();
        System.out.println();

        System.out.println("Informações do Veículo 3:");
        caminhao.exibirInformacoes();
        caminhao.mover();
    }
}
