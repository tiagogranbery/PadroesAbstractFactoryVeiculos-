package padroescriacao.abstractfactory;
<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {

        // VEÍCULO ECONÔMICO
        System.out.println("=== VEÍCULO ECONÔMICO ===");
        FabricaAbstrataVeiculo fabricaEconomica = FabricaEconomica.getInstance();
        Veiculo veiculoEconomico = new Veiculo(fabricaEconomica);
        System.out.println(veiculoEconomico.montarMotor());
        System.out.println(veiculoEconomico.montarCarroceria());

        // VEÍCULO ESPORTIVO
        System.out.println("\n=== VEÍCULO ESPORTIVO ===");
        FabricaAbstrataVeiculo fabricaEsportiva = FabricaEsportiva.getInstance();
        Veiculo veiculoEsportivo = new Veiculo(fabricaEsportiva);
        System.out.println(veiculoEsportivo.montarMotor());
        System.out.println(veiculoEsportivo.montarCarroceria());

        // VEÍCULO ELÉTRICO
        System.out.println("\n=== VEÍCULO ELÉTRICO ===");
        FabricaAbstrataVeiculo fabricaEletrica = FabricaEletrica.getInstance();
        Veiculo veiculoEletrico = new Veiculo(fabricaEletrica);
        System.out.println(veiculoEletrico.montarMotor());
        System.out.println(veiculoEletrico.montarCarroceria());
    }
}
=======

public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo(new FabricaEconomica());
        Veiculo v2 = new Veiculo(new FabricaEsportiva());

        System.out.println(v1.montarMotor() + " - " + v1.montarCarroceria());
        System.out.println(v2.montarMotor() + " - " + v2.montarCarroceria());
    }
}
>>>>>>> 99eee01 (Adicionando projeto, Abstract Factory)
