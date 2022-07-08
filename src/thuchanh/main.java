package thuchanh;

public class main {
    public static void main(String[] args) {
        chunhat vuong = new chunhat(4, 6);
        vuong.chuvi();
        vuong.dientich();
        System.out.println(vuong.chuvi() + vuong.dientich());
        System.out.println(vuong.tenhinh());
        System.out.println(vuong.hay());
    }
}
