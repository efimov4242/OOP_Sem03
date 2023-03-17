package Sem03;

public class Rectangle extends Figure{
    public Rectangle(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    @Override
    public void area() {
        if((a == c) && (b == d) && (a > 0) && (b > 0) && (c > 0) && (d > 0)) {
            System.out.println("Площадь прямоугольника равна " + (a*c + b*d));
        } else {
            System.out.println("Стороны прямоугольника не равны!");
        }
    }
}
