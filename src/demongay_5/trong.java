package demongay_5;

public class trong extends connguoi {
    public int chieucao;
    public int cannang;

    public trong(int chieucao, int cannang) {
        this.chieucao = chieucao;
        this.cannang = cannang;
    }

    @Override
    public int x2tuoi() {
        return tuoi*5;
    }
//    @Override
//    public int x2tuoi() {
//        return tuoi * 4;
//    }
}
