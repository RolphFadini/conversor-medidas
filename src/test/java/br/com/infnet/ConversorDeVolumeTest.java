package br.com.infnet;

import br.com.infnet.exception.ValorInvalidoException;
import br.com.infnet.util.ConversorDeVolumes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorDeVolumeTest {
    @Test
    @DisplayName("Deve Testar conversão de L para GL")
    public void testaLitroParaGalao() {
        ConversorDeVolumes conversorDeVolumes = new ConversorDeVolumes();
        assertEquals(0.264, conversorDeVolumes.litrosParaGaloes(1),0.001);
        assertEquals(4.876, conversorDeVolumes.litrosParaGaloes(18.456),0.001);

        assertThrows(ValorInvalidoException.class, () ->{
            conversorDeVolumes.litrosParaGaloes(-18.456);
        });
    }

}
