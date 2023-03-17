package Sem03;

public abstract class Figure implements Area{
    int a;
    int b;
    int c;
    int d;

    public Figure(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Figure(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Figure(int a) {
        this.a = a;
    }
}
