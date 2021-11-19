/**
 * @Author Bryan Zen 113252725
 * @version 1.0
 * @since 2021-10-20
 */

/**
 *Write a fully-documented HoldingQueue class which models a Queue, and
 * extends VirtualLine. This class will serve as the group of people who are
 * up next for a ride. The difference between it and VirtualLine is that there
 * is a limit to how many People can be in the HoldingQueue (maxSize).
 * Your class should extend VirtualLine, which extends a class from the Java
 * API (preferably ArrayList or LinkedList but anything can be used as long as
 * it works). This class should contain the basic methods that allow you to
 * enqueue or dequeue onto the line. Also there should be some sort of peek
 * and isEmpty method that can tell other parts of the program if the queue
 * is empty and tell what the top element is. There must be getters and setters
 * for any instance variables that are required.
 */
public class HoldingQueue extends VirtualLine{
    private String name;
    private int maxSize = 0;

    /**
     *
     * @param name sets name
     */
    public HoldingQueue(String name){
        super(name);
    }

    /**
     *
     * @param p adds person p
     */
    public void enqueue(Person p){
        super.enqueue(p);
    }

    /**
     *
     * @return removes person p
     * @throws EmptyQueueException if the queue is empty
     */
    public Person dequeue() throws EmptyQueueException{
        return super.dequeue();
    }

    /**
     *
     * @return the first person
     * @throws EmptyQueueException if the queue is empty
     */
    public Person peek() throws EmptyQueueException{
        return super.peek();
    }

    /**
     *
     * @return true if the queue is empty
     */
    public boolean isEmpty(){
        return super.isEmpty();
    }

    /**
     *
     * @return the max size
     */
    public int getmaxSize(){
        return maxSize;
    }

    /**
     *
     * @param maxSize sets the max size
     */
    public void setmaxSize(int maxSize){
        this.maxSize = maxSize;
    }
}
