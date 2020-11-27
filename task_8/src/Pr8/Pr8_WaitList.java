package Pr8;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;


public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> c) {
        this.content = new ConcurrentLinkedQueue<>(c);
    }
    public void add(E element) {
        this.content.add(element);
    }
    public E remove() {
        return this.content.poll();
    }
    public boolean contains(E element) {
        return this.content.contains(element);
    }
    public boolean containsAll(Collection<E> c){
        return this.content.containsAll(c);
    }
    public boolean isEmpty() {
        return this.content.isEmpty();
    }
    @Override
    public String toString() {
        return this.content.toString();
    }
}