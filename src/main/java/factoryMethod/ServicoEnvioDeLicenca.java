package factoryMethod;

public class ServicoEnvioDeLicenca implements IServico{

    public String executar() {
        return "Envio de licença autorizada";
    }

    public String cancelar() {
        return "Envio de licença negada";
    }
}
