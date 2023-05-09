package src;
public class AcessoElevador implements Acesso{
    @Override
    public void transportar() {
        System.out.println("Este veiculo possui acesso de cadeira de rodas por meio de um elevador com dregaus moveis");
    }
}