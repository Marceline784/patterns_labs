package structural.composite;

public class SpecialMenu extends MenuComponent {

    private final String name;
    private final MenuComponent item;

    public SpecialMenu(String name, MenuComponent item) {
        this.name = name;
        this.item = item;
    }

    @Override
    public void print() {
        System.out.println("\nSpecial Menu: " + name);
        item.print();
    }
}
