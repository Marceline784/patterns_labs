package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private final String name;
    private final List<MenuComponent> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        items.remove(component);
    }

    @Override
    public List<MenuComponent> getChildren() {
        return items;
    }

    @Override
    public void print() {
        System.out.println("\nMenu: " + name);
        for (MenuComponent item : items) {
            item.print();
        }
    }
}
