package src;

public class DepartamentoVendas implements Departamento {

    private Integer id;
    private String name;

    public DepartamentoVendas(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public void printNomedoDepartamento() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}