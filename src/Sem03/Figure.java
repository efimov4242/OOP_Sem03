package Sem03;

public abstract class Figure implements Area{
    double a;
    double b;
    double c;
    double d;

    public Figure(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Figure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Figure(double a) {
        this.a = a;
    }
}
