package Functions;

public class Perimeter {
    double circle(double radius) {
        double perimeter = 2 * 3.141 * radius;
        double area = 3.141 * (radius * radius);
        return area;
    }

    double rectangle(double length, double breath) {
        double perimeter = 2 * length * breath;
        double area = length * breath;
        return area;
    }

    public static void main(String[] args) {

    }
}
