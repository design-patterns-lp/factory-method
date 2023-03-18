package factoryMethod;

public class ServicoSaidaDeVia implements IServico{

    public String executar() {
        return "Saida de via autorizada";
    }

    public String cancelar() {
        return "Saida de via negada";
    }
}
