package src;
public class TramissaoManual implements Tramissao{
    @Override
    public void acelerar() {
        System.out.println("Este veiculo possui transmissao manual para ser utilizado em rotas regulares");
    }
}
