import java.util.Objects;

public class Point {    // 5.7.1
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("{ %.2f;%.2f }", x, y);
    }

    @Override   // переопр equals для корректного сравнения объектов Point
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверка повторок
        if (!(obj instanceof Point)) return false; // пр тип
        Point other = (Point) obj;
        return Double.compare(this.x, other.x) == 0 && Double.compare(this.y, other.y) == 0; // сравниваем х и у
    }

    @Override   // переопр hashCode для генерации хэш-кода на основе координат
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
