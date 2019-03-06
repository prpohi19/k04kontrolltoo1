
public class App {

    public static void main(String[] args) throws Exception {
        Polygon triangle1 = new Polygon(
            new double[] {2, 0, 1},
            new double[] {0, 0, 1.732}
        );

        Polygon triangle2 = new Polygon(
            new double[] {5, 3, 8},
            new double[] {8, 1, 8}
        );

        Polygon rectangle = new Polygon(
            new double[] {0, 7, 7, 0},
            new double[] {0, 0, 4, 4}
        );

        System.out.println(triangle1);
        System.out.println("Kas on võrdkülgne: " + (triangle1.isEquilateral(3) ? "Jah" : "Ei"));
        System.out.println("Kas on võrdkülgne: " + (triangle1.isEquilateral(5) ? "Jah" : "Ei"));
        System.out.println("Kas punktid on samal kaugusel keskelt: " + (triangle1.isSameDistanceFromCenter(3) ? "Jah" : "Ei"));

        System.out.println();
        System.out.println(triangle2);
        System.out.println("Kas on võrdkülgne: " + (triangle2.isEquilateral() ? "Jah" : "Ei"));
        System.out.println("Kas punktid on samal kaugusel keskelt: " + (triangle2.isSameDistanceFromCenter(3) ? "Jah" : "Ei"));

        System.out.println();
        System.out.println(rectangle);
        System.out.println("Kas on võrdkülgne: " + (rectangle.isEquilateral(3) ? "Jah" : "Ei"));
        System.out.println("Kas punktid on samal kaugusel keskelt: " + (rectangle.isSameDistanceFromCenter(3) ? "Jah" : "Ei"));
        
    }
}