package src;
public class AcessoPorta implements Acesso{
    @Override
    public void transportar() {
        System.out.println("Este veiculo possui acesso de cadeira de rodas por meio de uma porta elevatoria com area especifica dentro do veiculo");
    }
}