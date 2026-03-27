package padroescriacao.abstractfactory;

public class FabricaEconomica implements FabricaAbstrataVeiculo {

<<<<<<< HEAD
    private static FabricaEconomica instance;

    private FabricaEconomica() {}

    public static FabricaEconomica getInstance() {
        if (instance == null) {
            instance = new FabricaEconomica();
        }
        return instance;
    }

    @Override
=======
>>>>>>> 99eee01 (Adicionando projeto, Abstract Factory)
    public Motor createMotor() {
        return new MotorEconomico();
    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> 99eee01 (Adicionando projeto, Abstract Factory)
    public Carroceria createCarroceria() {
        return new CarroceriaSedan();
    }
}