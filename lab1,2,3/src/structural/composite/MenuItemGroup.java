package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuItemGroup extends MenuComponent {

    private final String name;
    private final List<MenuComponent> items = new ArrayList<>();

    public MenuItemGroup(String name) {
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
    public void print() {
        System.out.println("\nCombo: " + name);
        for (MenuComponent item : items) {
            item.print();
        }
    }
}
