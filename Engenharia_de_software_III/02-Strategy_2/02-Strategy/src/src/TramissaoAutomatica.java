package src;
public class TramissaoAutomatica implements Tramissao{
    @Override
    public void acelerar() {
        System.out.println("Este veiculo possui transmissao automatica para poder dirigir com maior facilidade nos corredores");
    }
}
