package Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Localizacao localizacaoOriginal = new Localizacao("40.7128° N", "74.0060° W");
        Sensor sensorOriginal = new Sensor("Temperatura", localizacaoOriginal, 0.5);

        Sensor sensorClone = null;
        sensorClone = sensorOriginal.clone();
        Localizacao novaLocalizacao = new Localizacao("37.7749° N", "122.4194° W");
        sensorClone.setLocalizacao(novaLocalizacao);
        sensorClone.setTipo("Umidade");

        assertEquals("Sensor{tipo='Temperatura', localizacao=Localizacao{latitude='40.7128° N', longitude='74.0060° W'}, precisao=0.5}", sensorOriginal.toString());
        assertEquals("Sensor{tipo='Umidade', localizacao=Localizacao{latitude='37.7749° N', longitude='122.4194° W'}, precisao=0.5}", sensorClone.toString());
    }
}