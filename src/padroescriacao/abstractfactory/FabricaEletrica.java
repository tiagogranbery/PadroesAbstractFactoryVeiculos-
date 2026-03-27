package padroescriacao.abstractfactory;

import padroescriacao.abstractfactory.CarroceriaSuv;

public class FabricaEletrica implements FabricaAbstrataVeiculo {

    private static FabricaEletrica instance;
    private FabricaEletrica() {}

    public static FabricaEletrica getInstance() {
        if (instance == null) {
            instance = new FabricaEletrica();
        }
        return instance;
    }

    @Override
    public Motor createMotor() {
        return new MotorEletrico();
    }

    @Override
    public Carroceria createCarroceria() {
        return new CarroceriaSuv();
    }
}

