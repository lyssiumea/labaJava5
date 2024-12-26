import java.util.List;
import java.util.ArrayList;

public class ListManager {  // 5.3.8
    private List<String> L1;
    private List<String> L2;

    public ListManager(List<String> L1, List<String> L2) {
        this.L1 = L1;
        this.L2 = L2;
    }

    public List<String> createUniqueList() {
        List<String> uniqueList = new ArrayList<>();

        // Проверка на пустоту списков
        if (L1.isEmpty()) {
            System.out.println("Список L1 пуст.");
            return uniqueList;
        }
        if (L2.isEmpty()) {
            System.out.println("Список L2 пуст.");
            return uniqueList;
        }

        // Формирование уникального списка
        for (String item : L1) {
            if (!L2.contains(item)) {
                uniqueList.add(item);
            }
        }

        return uniqueList;
    }

    @Override
    public String toString() {
        return "L1: " + L1 + "\nL2: " + L2;
    }
}
