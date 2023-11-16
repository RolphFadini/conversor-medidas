package br.com.infnet.util;

import br.com.infnet.exception.ValorInvalidoException;

public class ConversorDeMassa {
    public double kilosParaLibras(double kilos) {
        if(kilos < 0) {
            throw new ValorInvalidoException("Não existe massa negativa");
        }
        return kilos * 2.20462;
    }
}
