package padroescriacao.abstractfactory;

public class FabricaEconomica implements FabricaAbstrataVeiculo {

    private static FabricaEconomica instance;

    private FabricaEconomica() {}

    public static FabricaEconomica getInstance() {
        if (instance == null) {
            instance = new FabricaEconomica();
        }
        return instance;
    }

    @Override
    public Motor createMotor() {
        return new MotorEconomico();
    }

    @Override
    public Carroceria createCarroceria() {
        return new CarroceriaSedan();
    }
}