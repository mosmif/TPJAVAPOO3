import java.util.ArrayList;
import java.util.List;

// Generic class to store elements of any type
public class GenericStorage<T> {
    private List<T> elements;

    public GenericStorage() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T o) {
        if (o != null) {
            elements.add(o);
        }
    }

    public void removeElement(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        System.out.println("Invalid index: " + index);
        return null;
    }

    public int getSize() {
        return elements.size();
    }
}
