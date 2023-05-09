package src;
public class AcessoRampa implements Acesso{
    @Override
    public void transportar() {
        System.out.println("Este veiculo possui acesso de cadeira de rodas por meio de uma rampa e ajoelhamento (rebaixamento do) no veiculo");
    }
}