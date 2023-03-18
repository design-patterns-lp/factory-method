package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoSaidaDeViaTest {
    @Test
    void deveExecutarSaidaDeVia() {
        IServico servico = ServicoFactory.obterServico("SaidaDeVia");
        assertEquals("Saida de via autorizada", servico.executar());
    }

    @Test
    void deveCancelarSaidaDeVia() {
        IServico servico = ServicoFactory.obterServico("SaidaDeVia");
        assertEquals("Saida de via negada", servico.cancelar());
    }
}
