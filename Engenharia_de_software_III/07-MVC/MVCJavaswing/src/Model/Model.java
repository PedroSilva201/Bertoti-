package Model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<String> names;

    public Model() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public List<String> getNames() {
        return names;
    }
}
