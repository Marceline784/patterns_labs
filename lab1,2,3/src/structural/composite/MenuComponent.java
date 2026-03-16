package structural.composite;

import java.util.List;

public abstract class MenuComponent {
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public List<MenuComponent> getChildren() {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}