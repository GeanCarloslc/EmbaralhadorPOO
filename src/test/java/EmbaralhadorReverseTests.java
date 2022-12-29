import io.github.geancarloslc.domain.entity.embaralhador.Embaralhador;
import io.github.geancarloslc.domain.entity.embaralhador.EmbaralhadorAleatorio;
import io.github.geancarloslc.domain.entity.embaralhador.EmbaralhadorReverse;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class EmbaralhadorReverseTests {

    @Test
    public void embaralhadorReverse(){
        Embaralhador embaralhador = new EmbaralhadorReverse();
        String palavraEmbaralhada = embaralhador.embaralhar("Carro");
        assertNotEquals("Carro", palavraEmbaralhada);
    }

}
