package src;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static Model instance;
    private List<String> names;
    private AddNameStrategy addNameStrategy;

    private Model() {
        names = new ArrayList<>();
        addNameStrategy = new NormalAddNameStrategy();
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public void setAddNameStrategy(AddNameStrategy strategy) {
        addNameStrategy = strategy;
    }

    public void addName(String name) {
        addNameStrategy.addName(names, name);
    }

    public List<String> getNames() {
        return names;
    }
}