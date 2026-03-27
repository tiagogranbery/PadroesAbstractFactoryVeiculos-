package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveMontarMotorEconomico() {
        FabricaAbstrataVeiculo fabrica = FabricaEconomica.getInstance();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Motor Econômico", veiculo.montarMotor());
    }

    @Test
    void deveMontarMotorEsportivo() {
        FabricaAbstrataVeiculo fabrica = FabricaEsportiva.getInstance();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Motor Esportivo", veiculo.montarMotor());
    }

    @Test
    void deveMontarCarroceriaSedan() {
        FabricaAbstrataVeiculo fabrica = FabricaEconomica.getInstance();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Carroceria Sedan", veiculo.montarCarroceria());
    }

    @Test
    void deveMontarCarroceriaEsportiva() {
        FabricaAbstrataVeiculo fabrica = FabricaEsportiva.getInstance();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Carroceria Esportiva", veiculo.montarCarroceria());
    }

    @Test
    void deveMontarVeiculoEletrico() {
        FabricaAbstrataVeiculo fabrica = FabricaEletrica.getInstance();
        Veiculo veiculo = new Veiculo(fabrica);

        assertEquals("Motor Elétrico", veiculo.montarMotor());
        assertEquals("Carroceria Suv", veiculo.montarCarroceria());
    }
}