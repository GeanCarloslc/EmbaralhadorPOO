
import static org.junit.Assert.*;

import io.github.geancarloslc.domain.entity.embaralhador.Embaralhador;
import io.github.geancarloslc.domain.entity.embaralhador.EmbaralhadorAleatorio;
import org.junit.Test;

public class EmbaralhadorAleatorioTests {

    @Test
    public void embaralhadorAleatorio(){
        Embaralhador embaralhador = new EmbaralhadorAleatorio();
        String palavraEmbaralhada = embaralhador.embaralhar("Carro");
        assertNotEquals("Carro", palavraEmbaralhada);
    }
}
