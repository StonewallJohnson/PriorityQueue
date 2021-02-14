public class PriorityQueue<E extends Comparable<E>>{
    DoublyLinkedList<E> container;
    
    public PriorityQueue(){
        container = new DoublyLinkedList<E>();
    } 
    
    public void pushIn(E item){
        container.insert(item);
    }

    /**
     * Removes the item at the front of the queue
     * @return Item at front of queue
     */
    public E pop(){
        return container.removeTail();
    }

    /**
     * 
     * @return the size of the queue
     */
    public int size(){
        return container.size();
    }

    /**
     * 
     * @return whether or not the queue is empty
     */
    public boolean isEmpty(){
        return size() == 0;
    }
}