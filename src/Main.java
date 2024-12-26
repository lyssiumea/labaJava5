import java.io.File;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main { // вариант 8
    public static void main(String[] args) {

        // 5.1.1. Шаблоны (дроби)
//        Fraction fraction1 = new Fraction(3, 6);
//        CashedFraction cachedFraction1 = new CashedFraction(fraction1);
//        System.out.println("Дробь 1: " + fraction1);
//        System.out.println("Вещественное значение дроби 1: " + cachedFraction1.getDecimalValue());
//        cachedFraction1.setNumerator(7);
//        System.out.println("Дробь 1 после изменения числителя: " + fraction1);
//        System.out.println("Вещественное значение дроби 1: " + cachedFraction1.getDecimalValue());
//        Fraction fraction2 = new Fraction(-9, 4);
//        CashedFraction cachedFraction2 = new CashedFraction(fraction2);
//        System.out.println("\nДробь 2: " + fraction2);
//        System.out.println("Вещественное значение дроби 2: " + cachedFraction2.getDecimalValue());
//        cachedFraction2.setDenominator(8);
//        System.out.println("Дробь 2 после изменения знаменателя: " + fraction2);
//        System.out.println("Вещественное значение дроби 2: " + cachedFraction2.getDecimalValue());

        // 5.2.1. Количество мяуканий.
//        Meowable cat = new Cat("Вася");
//        MeowCounter catWithCounter = new MeowCounter(cat);
//        MeowHandler.handleMeowing(new Meowable[]{catWithCounter, catWithCounter, catWithCounter}); // метод обработки
//        System.out.println("Количество мяуканий: " + catWithCounter.getMeowCount());

        // 5.3.8. Список.
//        List<String> list1 = new ArrayList<>();
//        list1.add("apple");
//        list1.add("banana");
//        list1.add("orange");
//        List<String> list2 = new ArrayList<>();
//        list2.add("banana");
//        list2.add("kiwi");
//        ListManager manager = new ListManager(list1, list2);
//        System.out.println(manager);
//        List<String> uniqueList = manager.createUniqueList();
//        System.out.println("Уникальный список (элементы из L1, которых нет в L2): " + uniqueList);

        // 5.4.8. Мап (ученики)
//        List<Student> students = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader("src/students.txt"))) {
//            int n = Integer.parseInt(br.readLine().trim());
//            for (int i = 0; i < n; i++) {
//                String line = br.readLine();
//                String[] parts = line.split(" ");
//                String lastName = parts[0];
//                String firstName = parts[1];
//                int schoolNumber = Integer.parseInt(parts[2]);
//                int score = Integer.parseInt(parts[3]);
//
//                students.add(new Student(lastName, firstName, schoolNumber, score));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            return;
//        }
//
//        List<Student> school50Students = new ArrayList<>(); // фильтрация
//        for (Student student : students) {
//            if (student.getSchoolNumber() == 50) {
//                school50Students.add(student);
//            }
//        }
//
//        if (school50Students.isEmpty()) {
//            System.out.println("Нет учеников школы №50.");
//            return;
//        }
//        school50Students.sort(Comparator.comparingInt(Student::getScore).reversed()); // подсчет лучших
//        int maxScore = school50Students.get(0).getScore();
//        List<Student> topStudents = new ArrayList<>();
//        for (Student student : school50Students) {
//            if (student.getScore() == maxScore) {
//                topStudents.add(student);
//            }
//        }
//
//        System.out.println("\nРезультаты экзамена по информатике (Школа №50):");
//        if (topStudents.size() > 2) {
//            System.out.printf("\nКоличество учеников с максимальным баллом (%d): %d\n", maxScore, topStudents.size());
//        } else if (topStudents.size() == 1) {
//            System.out.printf("\nЛучший ученик: %s с баллом %d\n", topStudents.get(0).getFullName(), maxScore);
//        } else if (topStudents.size() == 2) {
//            System.out.printf("\nЛучшие ученики:\n");
//            for (Student student : topStudents) {
//                System.out.printf("- %s с баллом %d\n", student.getFullName(), maxScore);
//            }
//        }

        // 5.5.8. Сет (отсутствующие рус буквы)
//        String alphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
//        Set<Character> foundLetters = new HashSet<>();  // для хранения уникальных букв из текста
//        StringBuilder textContent = new StringBuilder();
//        try (BufferedReader br = new BufferedReader(new FileReader("src/textRUS.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                textContent.append(line).append("\n");
//                for (char c : line.toLowerCase().toCharArray()) {
//                    if (alphabet.indexOf(c) != -1) {
//                        foundLetters.add(c);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            return;
//        }
//        Set<Character> missingLetters = new HashSet<>();    // опр отсутствующие буквы
//        for (char c : alphabet.toCharArray()) {
//            if (!foundLetters.contains(c)) {
//                missingLetters.add(c);
//            }
//        }
//        System.out.println("\nТекст из файла:\n" + textContent.toString());
//        System.out.println("Количество отсутствующих букв: " + missingLetters.size());
//        System.out.print("Отсутствующие буквы: ");
//        for (char c : missingLetters) {
//            System.out.print(c + " ");
//        }

        // 5.6.3. Очередь
//        CircularQueue circularQueue = new CircularQueue();
//        circularQueue.enqueue(1);
//        circularQueue.enqueue(2);
//        circularQueue.enqueue(3);
//        circularQueue.enqueue(2);
//        circularQueue.enqueue(4);
//        if (circularQueue.hasEqualAdjacent()) {
//            System.out.println("\nВ очереди есть хотя бы один элемент, который равен следующему за ним.");
//        } else {
//            System.out.println("\nВ очереди нет элементов, которые равны следующему за ними.");
//        }

        // 5.7.1. Cтрим
//        List<Point> points = Arrays.asList(
//                new Point(1, -2),
//                new Point(3, 4),
//                new Point(1, 2),
//                new Point(3, -4),
//                new Point(1, -2),
//                new Point(5, 6),
//                new Point(3, 4)
//        );
//        Polyline polyline = new Polyline(points.stream()
//                .map(point -> new Point(point.getX(), Math.abs(point.getY()))) // преобразуем у в положительное
//                .distinct()
//                .sorted(Comparator.comparing(Point::getX)) // сорт по х
//                .collect(Collectors.toList())); // все в список
//        System.out.println(polyline);

        // 5.7.2. Cтрим
        String filePath = "src/people.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            Map<Integer, List<String>> groupedNames = br.lines()
                    .map(line -> line.split(":"))
                    .filter(parts -> parts.length == 2 && !parts[1].isEmpty())
                    .collect(Collectors.groupingBy(
                            parts -> Integer.parseInt(parts[1]),
                            Collectors.mapping(parts -> capitalize(parts[0].toLowerCase()), Collectors.toList())
                    ));
            System.out.println(groupedNames);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String capitalize(String name) {
        if (name == null || name.isEmpty()) return name;
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);

    }
}