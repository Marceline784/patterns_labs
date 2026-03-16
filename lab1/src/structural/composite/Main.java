package structural.composite;

public class Main {
    public static void main(String[] args) {
        // Окремі страви
        Dish coffee = new Dish("Coffee", 3.5);
        Dish sandwich = new Dish("Sandwich", 5.0);
        Dish cake = new Dish("Cake", 4.0);
        Dish juice = new Dish("Orange Juice", 2.5);

        // Підменю
        Menu breakfastMenu = new Menu("Breakfast");
        breakfastMenu.add(coffee);
        breakfastMenu.add(sandwich);

        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.add(cake);

        // Комбо-набір
        MenuItemGroup combo = new MenuItemGroup("Morning Combo");
        combo.add(coffee);
        combo.add(juice);
        combo.add(sandwich);

        // Спеціальне меню дня
        SpecialMenu specialOfTheDay = new SpecialMenu("Chef's Special", combo);

        // Повне меню
        Menu fullMenu = new Menu("Full Menu");
        fullMenu.add(breakfastMenu);
        fullMenu.add(dessertMenu);
        fullMenu.add(specialOfTheDay);

        // Вивід меню
        fullMenu.print();
    }
}
