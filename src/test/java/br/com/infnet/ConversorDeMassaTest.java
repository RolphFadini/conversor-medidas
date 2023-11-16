package br.com.infnet;

import br.com.infnet.exception.ValorInvalidoException;
import br.com.infnet.util.ConversorDeMassa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorDeMassaTest {
    @Test
    @DisplayName("Deve Testar a conversão de KG para Libras")
    public void testaKilosParaLibras(){
        ConversorDeMassa conversorDeMassa = new ConversorDeMassa();
        double libras = conversorDeMassa.kilosParaLibras(1);
        assertEquals(2.204, conversorDeMassa.kilosParaLibras(1), 0.01);
        assertEquals(2966.6945, conversorDeMassa.kilosParaLibras(1345.67), 0.01);

        assertThrows(ValorInvalidoException.class, () ->{
           conversorDeMassa.kilosParaLibras(-1345.67);
        });
    }
}
