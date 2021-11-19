/**
 * @Author Bryan Zen 113252725
 * @version 1.0
 * @since 2021-10-20
 */

import java.util.ArrayList;

/**
 *Write a fully-documented VirtualLine class which models a Queue. You may
 * use your own implementation or use a Java API class (preferably ArrayList
 * or LinkedList but anything can be used as long as it works). In this case,
 * it must extend the class from the Java API. This class should contain the
 * basic methods that allow you to enqueue or dequeue onto the line. Also there
 * should be some sort of peek and isEmpty method that can tell other parts of
 * the program if the queue is empty and tell what the top element is. You may
 * use other java api methods as well if you find them advantageous.
 */
public class VirtualLine extends ArrayList<Person>{
    public String name;
    public VirtualLine(String name){
        this.name = name;
    }

    /**
     *
     * @param p person to add
     */
    public void enqueue(Person p){
        this.add(p);
    }

    /**
     *
     * @return removed person
     * @throws EmptyQueueException if the queue is empty
     */
    public Person dequeue() throws EmptyQueueException{
        if (this.isEmpty()){
            throw new EmptyQueueException("Queue is empty!");
        }
        return this.remove(0);
    }

    /**
     *
     * @return first person on queue
     * @throws EmptyQueueException if the queue is empty
     */
    public Person peek() throws EmptyQueueException{
        if (this.isEmpty()){
            throw new EmptyQueueException("Queue is empty!");
        }
        return this.get(0);
    }

    /**
     *
     * @return true if it is empty
     */
    public boolean isEmpty(){
        return super.isEmpty();
    }
}