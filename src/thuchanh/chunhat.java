package thuchanh;

import javax.print.DocFlavor;

public class chunhat {
    double width;
    double height;

    public chunhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double chuvi() {
        return (width +height) *2;
    }
    public double dientich() {
        return width*height;
    }
    public String tenhinh() {
        return "Đào Văn Trọng";
    }
    public int hay() {
        return (int) ((width+height)/2);
    }
}

