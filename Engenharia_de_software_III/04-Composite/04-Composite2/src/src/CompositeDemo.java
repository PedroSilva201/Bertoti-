package src;

public class CompositeDemo {
    public static void main(String args[]) {
        Departamento departamentoVendas = new DepartamentoVendas(1, "Departamento Vendas");
        Departamento departamentoFinanceiro = new DepartamentoFinanceiro(2, "Departamento Financeiro");
        Departamento departamentoTecnologico = new DepartamentoTecnologico(2, "Departamento Tecnologico");
        Departamento departamentoRH = new DepartamentoRH(2, "Departamento RH");
        DepartamentoCentral departamentoCentral = new DepartamentoCentral(5, "Departamento Central");

        departamentoCentral.addDepartment(departamentoVendas);
        departamentoCentral.addDepartment(departamentoFinanceiro);
        departamentoCentral.addDepartment(departamentoTecnologico);
        departamentoCentral.addDepartment(departamentoRH);

        departamentoCentral.printNomedoDepartamento();
    }
}
/*referencias biliograficas desta atividade
 * https://www.baeldung.com/java-composite-pattern 
 * &
 * https://refactoring.guru/pt-br/design-patterns/composite/java/examples*/
 