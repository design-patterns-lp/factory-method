package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoLiberacaoDeViaTest {
    @Test
    void deveExecutarLiberacaoDeVia() {
        IServico servico = ServicoFactory.obterServico("LiberacaoDeVia");
        assertEquals("Liberação de via autorizada", servico.executar());
    }

    @Test
    void deveCancelarLiberacaoDeVia() {
        IServico servico = ServicoFactory.obterServico("LiberacaoDeVia");
        assertEquals("Liberação de via negada", servico.cancelar());
    }
}
