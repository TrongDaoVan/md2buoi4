package Giaiphungtrinh;

public class maytinh {
    int a;
    int b;
    int c;

    public maytinh(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public maytinh(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return b*2 -4*a*c;
    }
    public double getRoot1() {
        return (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public double getRoot2() {
        return (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    public double thich() {
        return a*b;
    }
}
