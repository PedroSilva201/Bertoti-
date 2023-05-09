package src;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoCentral implements Departamento {
    private Integer id;
    private String name;

    private List<Departamento> childDepartamentos;

    public DepartamentoCentral(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartamentos = new ArrayList<>();
    }

    public void printDepartmentName() {
    	childDepartamentos.forEach(Departamento::printNomedoDepartamento);
    }

    public void addDepartment(Departamento departamento) {
    	childDepartamentos.add(departamento);
    }

    public void removeDepartment(Departamento departamento) {
    	childDepartamentos.remove(departamento);
    }

	@Override
	public void printNomedoDepartamento() {
		// TODO Auto-generated method stub
		
	}
}