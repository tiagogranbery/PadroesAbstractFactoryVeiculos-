package padroescriacao.abstractfactory;

public class FabricaEsportiva implements FabricaAbstrataVeiculo {

    private static FabricaEsportiva instance;

    private FabricaEsportiva() {}

    public static FabricaEsportiva getInstance() {
        if (instance == null) {
            instance = new FabricaEsportiva();
        }
        return instance;
    }

    @Override
    public Motor createMotor() {
        return new MotorEsportivo();
    }

    @Override
    public Carroceria createCarroceria() {
        return new CarroceriaEsportiva();
    }
}