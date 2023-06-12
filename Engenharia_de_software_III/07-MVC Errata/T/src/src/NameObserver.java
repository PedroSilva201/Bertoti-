package src;

import java.util.ArrayList;
import java.util.List;

public interface NameObserver {
    void update(List<String> names);
}

class NameSubject {
    private List<NameObserver> observers = new ArrayList<>();

    public void attach(NameObserver observer) {
        observers.add(observer);
    }

    public void detach(NameObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(List<String> names) {
        for (NameObserver observer : observers) {
            observer.update(names);
        }
    }
}