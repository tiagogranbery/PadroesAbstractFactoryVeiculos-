package padroescriacao.abstractfactory;

public class MotorEletrico implements Motor {
    @Override
    public String montar() {
        return "Motor Elétrico";
    }
}
