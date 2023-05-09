package src;

import java.util.Scanner;

public class TipoOnibus {

    public static void main(String[] args) {
        Onibus onibus = new Onibus();

        Scanner menu = new Scanner (System.in);

        System.out.print("##---- Menu de Análise ---- ##\n\n");
        System.out.print("|----------------------------------|\n");
        System.out.print("| Opção 1 - Piso Baixo |\n");
        System.out.print("| Opção 2 - Convencional alongado |\n");
        System.out.print("| Opção 3 - Padron simples |\n");
        System.out.print("|----------------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("\4001\n");

                onibus.setTramissao(new TramissaoAutomatica());
                onibus.utilizarTramissao();
                onibus.setAcesso(new AcessoRampa());
                onibus.utilizarAcesso();
                break;

            case 2:
                System.out.print("\n4002\n");

                onibus.setTramissao(new TramissaoManual());
                onibus.utilizarTramissao();
                onibus.setAcesso(new AcessoElevador());
                onibus.utilizarAcesso();               
                break;
                
            case 3:
                System.out.print("\n4003\n");

                onibus.setTramissao(new TramissaoHidroautomatica());
                onibus.utilizarTramissao();
                onibus.setAcesso(new AcessoPorta());
                onibus.utilizarAcesso();
                break;

            default:
                System.out.print("\nOpção Inexistente!");
                break;

        }
    }
}