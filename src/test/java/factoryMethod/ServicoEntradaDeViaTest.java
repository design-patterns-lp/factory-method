package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoEntradaDeViaTest {

    @Test
    void deveExecutarEntradaDeVia() {
        IServico servico = ServicoFactory.obterServico("EntradaDeVia");
        assertEquals("Entrada de via autorizada", servico.executar());
    }

    @Test
    void deveCancelarEntradaDeVia() {
        IServico servico = ServicoFactory.obterServico("EntradaDeVia");
        assertEquals("Entrada de via negada", servico.cancelar());
    }
}
