package Sem03;

public class Triangle extends Figure {
    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    /**
     * Метод вычисления площади треугольника
     */
    @Override
    public void area() {
        if((a > 0) && (b > 0) && (c > 0)) {
            double p = (a + b + c) / 2;
            double s = Math.sqrt((p * ((p - a) * (p - b) * (p - c))));
            System.out.println("Площадь треугольника равна " + s);
        } else {
            System.out.println("Стороны треугольника должны быть больше нуля!");
        }
    }

}
