package src;

public class ControleDeHorario {

    public static void main(String[] args) {

        Hora horaChegada = new Hora(15, 30, 00);
        Hora horaSaida = new Hora(17, 30, 00);
        Funcionario geddyLee = new Funcionario("Teste", horaChegada, horaSaida);
        
        System.out.println("Horario de chegada na empresa: " + horaChegada.toString());
        System.out.println("Horario de saída na empresa: " + horaSaida.toString());
        System.out.printf("Tempo trabalhado neste dia foi de: %.1f\n horas",geddyLee.getHorasTrabalhadas());
        

    }

}