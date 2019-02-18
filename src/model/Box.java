package model;

public class Box {
    private int a,b,h;

    public Box(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                '}';
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

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
