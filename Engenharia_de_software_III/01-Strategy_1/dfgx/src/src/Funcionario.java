package src;

public class Funcionario {
    private String nome;
    private boolean atraso;
    private double tempoTrabalhado, tempoAtraso;
    
    public Funcionario(String nome, Hora horaChegada, Hora horaSaida){
        this.nome=nome;
        this.tempoAtraso = tempoAtraso(horaChegada);
        
        if(this.tempoAtraso > 0)
            this.atraso=true;
        
        if(atraso){
            System.out.println("O Funcionário '" + this.nome + "' esta atrasado. ");
        }
        
        this.tempoTrabalhado = horasTrabalhadas(horaChegada, horaSaida);
    }
    
    public double tempoAtraso(Hora horaChegada){
        return ((horaChegada.getHora()*60*60 + horaChegada.getMinuto()*60 + 
                 horaChegada.getSegundo()) - 8*3600.0)/3600.0;
    }
    
    public double horasTrabalhadas(Hora horaChegada, Hora horaSaida){
        double horas = ( (horaSaida.getHora()*60 + horaSaida.getMinuto()) - 
                       (horaChegada.getHora()*60 + horaChegada.getMinuto()) )/60.0;
        
        if(horas < 0)
            throw new IllegalArgumentException("Hora de saída anterior a hora de chegada");
        
        return horas;
    }
    
    public double getHorasTrabalhadas(){
        return this.tempoTrabalhado;
    }
}
//referencia bibliografica: https://www.javaprogressivo.net/2012/10/Composicao-em-Java-trocando-informacoes-entre-objetos.html
//adaptado