package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveMontarMotorEconomico() {
        Veiculo veiculo = new Veiculo(new FabricaEconomica());

        assertEquals("Motor Economico", veiculo.montarMotor());
    }

    @Test
    void deveMontarMotorEsportivo() {
        Veiculo veiculo = new Veiculo(new FabricaEsportiva());

        assertEquals("Motor Esportivo", veiculo.montarMotor());
    }

    @Test
    void deveMontarCarroceriaSedan() {
        Veiculo veiculo = new Veiculo(new FabricaEconomica());

        assertEquals("Carroceria Sedan", veiculo.montarCarroceria());
    }

    @Test
    void deveMontarCarroceriaEsportiva() {
        Veiculo veiculo = new Veiculo(new FabricaEsportiva());

        assertEquals("Carroceria Esportiva", veiculo.montarCarroceria());
    }
}

