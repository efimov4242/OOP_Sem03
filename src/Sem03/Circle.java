package Sem03;

public class Circle extends Figure{
    public Circle(double a) {
        super(a);
    }

    @Override
    public void area() {
        if(a > 0) {
            System.out.println("Площадь круга равна " + Math.PI * Math.sqrt(a));
        } else {
            System.out.println("Радиус круга должен быть больше нуля!");
        }
    }
}
