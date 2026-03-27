package padroescriacao.abstractfactory;
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
