package src;

import java.util.List;

public interface AddNameStrategy {
    void addName(List<String> names, String name);
}

class NormalAddNameStrategy implements AddNameStrategy {
    @Override
    public void addName(List<String> names, String name) {
        names.add(name);
    }
}

class UppercaseAddNameStrategy implements AddNameStrategy {
    @Override
    public void addName(List<String> names, String name) {
        names.add(name.toUpperCase());
    }
}