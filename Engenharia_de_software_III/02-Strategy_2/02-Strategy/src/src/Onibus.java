package src;
public class Onibus {
    private Tramissao tramissao;
    public void setTramissao(Tramissao stramissao){
        tramissao = stramissao;
    }

    public void utilizarTramissao(){
        tramissao.acelerar();

    }
    private Acesso acesso;
    public void setAcesso(Acesso sacesso){
        acesso = sacesso;
    }

    public void utilizarAcesso(){
        acesso.transportar();

    }

}
