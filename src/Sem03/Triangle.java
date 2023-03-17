package Sem03;

public class Triangle extends Figure {
    /**
     * Стороны треугольника
     * @param a
     * @param b
     * @param c
     */
    public Triangle(int a, int b, int c) {

        super(a, b, c);
    }

    /**
     * Метод вычисления площади треугольника
     */
    @Override
    public void area() {
        int p = (a + b + c) / 2;
        double s = Math.sqrt((p * ((p - a) * (p - b) * (p - c))));
        System.out.println(s);
    }

}
