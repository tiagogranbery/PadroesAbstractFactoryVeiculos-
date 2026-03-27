package padroescriacao.abstractfactory;

public interface FabricaAbstrataVeiculo {
    Motor createMotor();
    Carroceria createCarroceria();
}