package src;

public class DepartamentoTecnologico implements Departamento {

    private Integer id;
    private String name;

    public DepartamentoTecnologico(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public void printNomedoDepartamento() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}