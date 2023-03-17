import Sem03.Area;
import Sem03.Triangle;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,2,2);
        triangle.area();

        LinkedList<Area> areas = new LinkedList<>();

        Area a1 = new Triangle(2, 2, 2);
        a1.area();
        Area a2 = new Triangle(3, 3, 3 );
        a2.area();

    }
}