package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoEnvioDeLicencaTest {
    @Test
    void deveExecutarEnvioDeLicenca() {
        IServico servico = ServicoFactory.obterServico("EnvioDeLicenca");
        assertEquals("Envio de licença autorizada", servico.executar());
    }

    @Test
    void deveCancelarEnvioDeLicenca() {
        IServico servico = ServicoFactory.obterServico("EnvioDeLicenca");
        assertEquals("Envio de licença negada", servico.cancelar());
    }
}
