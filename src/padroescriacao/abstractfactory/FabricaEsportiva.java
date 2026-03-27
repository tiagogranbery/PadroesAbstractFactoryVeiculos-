package padroescriacao.abstractfactory;

public class FabricaEsportiva implements FabricaAbstrataVeiculo {

<<<<<<< HEAD
    private static FabricaEsportiva instance;

    private FabricaEsportiva() {}

    public static FabricaEsportiva getInstance() {
        if (instance == null) {
            instance = new FabricaEsportiva();
        }
        return instance;
    }

    @Override
=======
>>>>>>> 99eee01 (Adicionando projeto, Abstract Factory)
    public Motor createMotor() {
        return new MotorEsportivo();
    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> 99eee01 (Adicionando projeto, Abstract Factory)
    public Carroceria createCarroceria() {
        return new CarroceriaEsportiva();
    }
}