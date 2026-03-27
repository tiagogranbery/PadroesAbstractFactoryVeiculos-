package padroescriacao.abstractfactory;

public class Veiculo {

    private Motor motor;
    private Carroceria carroceria;

    public Veiculo(FabricaAbstrataVeiculo fabrica) {
        this.motor = fabrica.createMotor();
        this.carroceria = fabrica.createCarroceria();
    }

    public String montarMotor() {
        return this.motor.montar();
    }

    public String montarCarroceria() {
        return this.carroceria.montar();
    }
}