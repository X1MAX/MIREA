package Pr8;

class BoundedWaitList<E> extends WaitList<E>{
    private final int capacity;
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public void add(E element) {

        if(this.content.size() < this.capacity) {
            super.add(element);
        }
    }
    @Override
    public String toString() {
        return this.content.toString() + ". Capacity " + this.capacity;
    }
}