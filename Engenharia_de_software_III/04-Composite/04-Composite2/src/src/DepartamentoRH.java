package src;

public class DepartamentoRH implements Departamento {

    private Integer id;
    private String name;

    public DepartamentoRH(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public void printNomedoDepartamento() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}