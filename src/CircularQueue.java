import java.util.LinkedList;
import java.util.Queue;

public class CircularQueue {    // 5.6.3. Очередь
    private Queue<Integer> queue;

    public CircularQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(int value) {
        queue.add(value);
    }

    public boolean hasEqualAdjacent() {
        if (queue.isEmpty()) {
            return false;
        }
        Integer[] elements = queue.toArray(new Integer[0]);
        int size = elements.length;
        for (int i = 0; i < size; i++) {
            System.out.printf("Сравниваем %d с %d\n", elements[i], elements[(i + 1) % size]);
            if (elements[i].equals(elements[(i + 1) % size])) {
                return true;
            }
        }
        return false;
    }
}
