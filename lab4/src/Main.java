import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Результати виконання завдань 1-13 ---");

        // 1. Непарні числа
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.print("Завдання 1: ");
        StreamTasks.task1(numbers);

        // 2. Середнє значення
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.0, 5.0);
        System.out.print("Завдання 2: ");
        StreamTasks.task2(doubleList);

        // 3. Алфавітний порядок
        List<String> cities = Arrays.asList("Чернівці", "Київ", "Львів", "Одеса", "Харків");
        System.out.print("Завдання 3: ");
        StreamTasks.task3(cities);

        // 4. Сума парних
        List<Integer> numbersForSum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.print("Завдання 4: ");
        StreamTasks.task4(numbersForSum);

        // 5. Факторіал
        int n = 5;
        System.out.print("Завдання 5: ");
        StreamTasks.task5(n);

        // 6. Множення та сума
        List<Integer> nums6 = Arrays.asList(1, 2, 3, 4);
        System.out.print("Завдання 6: ");
        StreamTasks.task6(nums6);

        // 7. Квадрати
        List<Integer> nums7 = Arrays.asList(2, 3, 5);
        System.out.print("Завдання 7: ");
        StreamTasks.task7(nums7);

        // 8. Сортування за довжиною
        List<String> words8 = Arrays.asList("Java", "Stream", "API", "Lambda");
        System.out.print("Завдання 8: ");
        StreamTasks.task8(words8);

        // 9. Кількість слів
        String sentence = "Я люблю програмувати на Java";
        System.out.print("Завдання 9: ");
        StreamTasks.task9(sentence);

        // 10. Пошук першого непорожнього рядка
        List<String> strings10 = Arrays.asList("", "   ", null, "Перший текст", "Другий");
        System.out.print("Завдання 10: ");
        StreamTasks.task10(strings10);

        // 11. Перевірка великої літери
        List<String> strings11 = Arrays.asList("Java", "Stream", "Lambda");
        System.out.print("Завдання 11: ");
        StreamTasks.task11(strings11);

        // 12. Друге за величиною число
        List<Integer> nums12 = Arrays.asList(10, 45, 10, 99, 2, 99, 50);
        System.out.print("Завдання 12: ");
        StreamTasks.task12(nums12);

        // 13. Найбільше парне
        List<Integer> nums13 = Arrays.asList(1, 3, 5, 8, 12, 4, 10);
        System.out.print("Завдання 13: ");
        StreamTasks.task13(nums13);
    }
}