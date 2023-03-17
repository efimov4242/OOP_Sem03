import Sem03.Area;
import Sem03.Circle;
import Sem03.Rectangle;
import Sem03.Triangle;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,2,2);
        triangle.area();

//        LinkedList<Area> areas = new LinkedList<>();
//
        Area a1 = new Rectangle(2, 1, 2, 1);
        a1.area();

        Area circle = new Circle(0);
        circle.area();
//        Area a2 = new Triangle(1, 1, 3 );
//        a2.area();

    }
}