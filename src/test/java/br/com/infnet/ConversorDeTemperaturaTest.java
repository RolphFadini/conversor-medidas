package br.com.infnet;

import br.com.infnet.util.ConversorDeTemperaturas;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorDeTemperaturaTest {
    @Test
    @DisplayName("Deve Testar a conversão de C para K")
    public void testaCelciusParaKelvin(){
        ConversorDeTemperaturas conversorDeTemperaturas = new ConversorDeTemperaturas();
        assertEquals(273.15,conversorDeTemperaturas.celsiusParaKelvin(0.0));
        assertEquals(348.13,conversorDeTemperaturas.celsiusParaKelvin(74.98),0.1);
        assertEquals(198.17,conversorDeTemperaturas.celsiusParaKelvin(-74.98),0.1);
    }

    @Test
    @DisplayName("Deve Testar a conversão de C para F")
    public void testaCelciusParaFahrenheith(){
        ConversorDeTemperaturas conversorDeTemperaturas = new ConversorDeTemperaturas();
        assertEquals(32,conversorDeTemperaturas.celsiusParaFahrenheith(0.0));
        assertEquals(319.4,conversorDeTemperaturas.celsiusParaFahrenheith(159.7),0.1);
        assertEquals(-69.16,conversorDeTemperaturas.celsiusParaFahrenheith(-56.2),0.1);
    }

    @Test
    @DisplayName("Deve Testar a conversão de K para C")
    public void testaKelvinParaCelsius(){
        ConversorDeTemperaturas conversorDeTemperaturas = new ConversorDeTemperaturas();
        assertEquals(-273.15,conversorDeTemperaturas.kelvinParaCelsius(0.0));
        assertEquals(592.17,conversorDeTemperaturas.kelvinParaCelsius(865.32),0.1);
        assertEquals(-294.595,conversorDeTemperaturas.kelvinParaCelsius(-21.445),0.01);
    }

    @Test
    @DisplayName("Deve Testar a conversão de K para F")
    public void testaKelvinParaFahrenheith() {
        ConversorDeTemperaturas conversorDeTemperaturas = new ConversorDeTemperaturas();
        assertEquals(-459.67,conversorDeTemperaturas.kelvinParaFahrenheith(0.0),0.1);
    }
}
