import java.util.*;
import java.util.stream.*;

public class StreamTasks {

    // 1. Відфільтрувати непарні числа (виправлено на void для консолі)
    public static void task1(List<Integer> list) {
        List<Integer> result = list.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    // 2. Середнє значення
    public static void task2(List<Double> list) {
        double average = list.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Середнє значення: " + average);
    }

    // 3. Сортування в алфавітному порядку
    public static void task3(List<String> list) {
        List<String> result = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Відсортований список: " + result);
    }

    // 4. Сума всіх парних чисел
    public static void task4(List<Integer> list) {
        int sum = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сума парних чисел: " + sum);
    }

    // 5. Факторіал числа
    public static void task5(int n) {
        long factorial = IntStream.rangeClosed(1, n)
                .asLongStream() // перетворюємо в long, щоб уникнути переповнення
                .reduce(1, (a, b) -> a * b);
        System.out.println("Факторіал числа " + n + ": " + factorial);
    }
    // 6. Множення та підсумовування всіх елементів
    public static void task6(List<Integer> list) {
        int sum = list.stream().reduce(0, Integer::sum);
        // Для множення важливо починати з 1, а не з 0
        long product = list.stream().reduce(1, (a, b) -> a * b);

        System.out.println("Сума: " + sum + ", Добуток: " + product);
    }

    // 7. Квадрат кожного числа
    public static void task7(List<Integer> list) {
        List<Integer> squared = list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println("Квадрати чисел: " + squared);
    }

    // 8. Сортування за довжиною рядка (зростання)
    public static void task8(List<String> list) {
        List<String> result = list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                // Або коротше: .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Сортування за довжиною: " + result);
    }

    // 9. Підрахунок кількості слів у реченні
    public static void task9(String sentence) {
        long count = Arrays.stream(sentence.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Кількість слів: " + count);
    }
    // 10. Знайти перший непорожній рядок
    public static void task10(List<String> list) {
        String result = list.stream()
                .filter(s -> s != null && !s.trim().isEmpty()) // Фільтруємо null та пробіли
                .findFirst()                                   // Беремо перший елемент
                .orElse("Не знайдено жодного непорожнього рядка");

        System.out.println("Перший непорожній рядок: " + result);
    }

    // 11. Перевірити, чи всі рядки починаються з великої літери
    public static void task11(List<String> list) {
        boolean allMatch = list.stream()
                .allMatch(s -> s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0)));

        System.out.println("Усі рядки з великої літери: " + allMatch);
    }

    // 12. Друге за величиною число в списку
    public static void task12(List<Integer> list) {
        Integer result = list.stream()
                .distinct()                         // Видаляємо однакові числа
                .sorted(Comparator.reverseOrder())  // Сортуємо від більшого до меншого
                .skip(1)                            // Пропускаємо перше (найбільше)
                .findFirst()                        // Беремо те, що стало першим (друге за величиною)
                .orElse(null);

        System.out.println("Друге за величиною число: " + result);
    }

    // 13. Найбільше парне число
    public static void task13(List<Integer> list) {
        Integer result = list.stream()
                .filter(n -> n % 2 == 0)            // Тільки парні
                .max(Integer::compare)              // Знаходимо максимум
                .orElse(null);

        System.out.println("Найбільше парне число: " + result);
    }
}