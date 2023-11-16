package br.com.infnet.util;

public class ConversorDeTemperaturas {
    public double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double celsiusParaFahrenheith(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double kelvinParaFahrenheith(double kelvin) {
        return (kelvin - 273.15) * 1.8 + 32;
    }
}
