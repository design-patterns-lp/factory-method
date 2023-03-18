package factoryMethod;

public class ServicoEntradaDeVia implements IServico{

    public String executar() {
        return "Entrada de via autorizada";
    }

    public String cancelar() {
        return "Entrada de via negada";
    }
}
