package src;
public class TramissaoHidroautomatica implements Tramissao{
    @Override
    public void acelerar() {
        System.out.println("Este veiculo possui transmissao hidroautomatica e possui certo cuidado na manutenção");
    }
}
