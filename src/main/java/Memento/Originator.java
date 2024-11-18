package Memento;

public class Originator {
    int h,w;
    Memento createMemento(){
        return new Memento(h,w);
    }
    public void restoreMemento(Memento memento){
        memento.h = this.h;
        memento.w = this.w;
    }
}
