package Giaiphungtrinh;

public class main {
    public static void main(String[] args) {
        maytinh fxmax = new maytinh(2,10,3);
        System.out.println(fxmax.getDiscriminant());
        System.out.println(fxmax.getRoot1());
        System.out.println(fxmax.getRoot2());
        maytinh fxmin = new maytinh(3,5);
        System.out.println(fxmin.thich());
    }
}
