package src;

import java.util.ArrayList;
import java.util.List;

public abstract class NameComponent {
    public abstract void addName(String name);

    public abstract List<String> getNames();
}

class NameGroup extends NameComponent {
    private List<NameComponent> components = new ArrayList<>();

    @Override
    public void addName(String name) {
        for (NameComponent component : components) {
            component.addName(name);
        }
    }

    @Override
    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (NameComponent component : components) {
            names.addAll(component.getNames());
        }
        return names;
    }

    public void addComponent(NameComponent component) {
        components.add(component);
    }

    public void removeComponent(NameComponent component) {
        components.remove(component);
    }
}

class NameLeaf extends NameComponent {
    private List<String> names = new ArrayList<>();

    @Override
    public void addName(String name) {
        names.add(name);
    }

    @Override
    public List<String> getNames() {
        return names;
    }
}