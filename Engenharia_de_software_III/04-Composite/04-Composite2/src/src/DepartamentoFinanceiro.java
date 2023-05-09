package src;

public class DepartamentoFinanceiro implements Departamento {

    private Integer id;
    private String name;

    public DepartamentoFinanceiro(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public void printNomedoDepartamento() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}