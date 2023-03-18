package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoEntradaEmPatioTest {

    @Test
    void deveExecutarEntradaEmPatio() {
        IServico servico = ServicoFactory.obterServico("EntradaEmPatio");
        assertEquals("Entrada em pátio autorizada", servico.executar());
    }

    @Test
    void deveCancelarEntradaEmPatio() {
        IServico servico = ServicoFactory.obterServico("EntradaEmPatio");
        assertEquals("Entrada em pátio negada", servico.cancelar());
    }
}
