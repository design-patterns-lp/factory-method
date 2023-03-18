package factoryMethod;

public class ServicoEntradaEmPatio implements IServico{

    public String executar() {
        return "Entrada em pátio autorizada";
    }

    public String cancelar() {
        return "Entrada em pátio negada";
    }
}
