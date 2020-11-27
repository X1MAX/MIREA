package Pr8;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() { }
    public void remove(E element) {
        this.content.remove(element);
    }
    public void moveToBack(E element) {
        if(this.content.remove(element)) {
            this.content.add(element);
        }
    }

}