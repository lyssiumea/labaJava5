public class Line { // 5.7.1
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return String.format("Линия от %s до %s", start, end);
    }
}
