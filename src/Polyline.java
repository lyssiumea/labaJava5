import java.util.*;
import java.util.stream.Collectors;

public class Polyline { // 5.7.1.
    private List<Point> points;

    public Polyline(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Линия " + points.stream()
                .map(Point::toString)
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
