package Memento;

public class Memento {
    public Memento(int h, int w) {
        this.h = h;
        this.w = w;
    }

    int h;
    int w;
    void setState(int h,int w){
        this.h = h;  this.w=w;
    }
}
