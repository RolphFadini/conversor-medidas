package br.com.infnet.util;

import br.com.infnet.exception.ValorInvalidoException;

public class ConversorDeVolumes {
    public double litrosParaGaloes(double litros) {
        if(litros < 0) {
            throw new ValorInvalidoException("Não pode converter valores negativos");
            //throw new IllegalArgumentException("Não aceitamos valores negativos");
        }
        return litros / 3.785;
    }
}
