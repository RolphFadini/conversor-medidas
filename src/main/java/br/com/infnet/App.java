package br.com.infnet;

import br.com.infnet.util.ConversorDeTemperaturas;
import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        LOGGER.info("Iniciando o Porgrama");
        System.out.println("=======================");
        System.out.println("Bem vindo ao conversor!");
        System.out.println("=======================");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Opção:");
        System.out.println("1 - C para K");
        System.out.println("2 - C para F");

        switch(scanner.nextInt()){
            case 1: {
                System.out.println("Digite a temperatura em C");
                try {
                    double celsius = scanner.nextDouble();
                    ConversorDeTemperaturas conversorDeTemperaturas = new ConversorDeTemperaturas();
                    LocalDateTime start = LocalDateTime.now();
                    LOGGER.info("Inicio do calculo de conversão");
                    double kelvin = conversorDeTemperaturas.celsiusParaKelvin(celsius);
                    LocalDateTime end = LocalDateTime.now();
                    long between = ChronoUnit.MILLIS.between(start, end);
                    LOGGER.debug("Final do metodo de conversão com tempo: " + between + " MS" + " para o valor: " + celsius);
                    System.out.println("A temperatura em K é: " + kelvin + "K");
                } catch(InputMismatchException e) {
                    LOGGER.error("Valor inválido para temperatura");
                    System.out.println("Valor inválido para temperatura");
                }
                break;
            }
            case 2: {
                System.out.println("Digite a temperatura em C");
                try {
                    double celsius = scanner.nextDouble();
                    ConversorDeTemperaturas conversorDeTemperaturas = new ConversorDeTemperaturas();
                    LocalDateTime start = LocalDateTime.now();
                    LOGGER.info("Inicio do calculo de conversão");
                    double fahrenheith = conversorDeTemperaturas.celsiusParaFahrenheith(celsius);
                    LocalDateTime end = LocalDateTime.now();
                    long between = ChronoUnit.MILLIS.between(start, end);
                    LOGGER.debug("Final do metodo de conversão com tempo: " + between + " MS");
                    System.out.println("A temperatura em K é: " + fahrenheith + "F");
                } catch (InputMismatchException e) {
                    LOGGER.error("Valor inválido para temperatura");
                    System.out.println("Valor inválido para temperatura");
                }
                break;
            }
        }
        LOGGER.info("Finalizando o Porgrama");
    }
}
