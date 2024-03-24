package Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        // Criação do sensor original
        Localizacao localizacaoOriginal = new Localizacao("40.7128° N", "74.0060° W");
        Sensor sensorOriginal = new Sensor("Temperatura", localizacaoOriginal, 0.5);

        // Clonagem do sensor original
        Sensor sensorClone = null;
        try {
            sensorClone = sensorOriginal.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Modificação do sensor clonado
        Localizacao novaLocalizacao = new Localizacao("37.7749° N", "122.4194° W");
        sensorClone.setLocalizacao(novaLocalizacao);
        sensorClone.setTipo("Umidade");

        // Verificação dos resultados
        assertEquals("Sensor{tipo='Temperatura', localizacao=Localizacao{latitude='40.7128° N', longitude='74.0060° W'}, precisao=0.5}", sensorOriginal.toString());
        assertEquals("Sensor{tipo='Umidade', localizacao=Localizacao{latitude='37.7749° N', longitude='122.4194° W'}, precisao=0.5}", sensorClone.toString());
    }
}