package src;

public class Hora {
    private int horas,
                minutos,
                segundos;
    
    public Hora (int horas, int minutos, int segundos){
        //preenchendo as horas
        if(horas>=0 && horas <24 )
            this.horas = horas;
        else
            throw new IllegalArgumentException("Hora inválida");
            
        //preenchendo os minutos
        if(minutos >=0 && minutos < 60)
            this.minutos = minutos;
        else
            throw new IllegalArgumentException("Minutos inválidos");
        
        //preenchendo os segundos
        if( segundos >=0 && segundos < 60)
            this.segundos = segundos;
        else
            throw new IllegalArgumentException("Segundos inválidos");
            
                
    }
    
    @Override
    public String toString(){
     return String.format("%d:%d:%d", getHora(), getMinuto(), getSegundo());
    }
    
    public int getHora(){
        return this.horas;
    }
    
    public int getMinuto(){
        return this.minutos;
    }
    
    public int getSegundo(){
        return this.segundos;
    }
    
}