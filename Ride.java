/**
 * @Author Bryan Zen 113252725
 * @version 1.0
 * @since 2021-10-20
 */

import java.util.ArrayList;
import java.util.List;

/**
 *Write a fully-documented Ride object which will contain the duration of the
 * ride in minutes, an instance of the VirtualLine Object, an instance of the
 * HoldingQueue Object, a list or an array of all the people on the ride and
 * methods to manipulate these methods (getters, setters, enqueue, dequeue)
 */
public class Ride {
    private int capacity;
    private int duration;
    private int timeLeft;
    private int ridden;
    private String Name;
    private VirtualLine virtualLine;
    private HoldingQueue holdingQueue;
    private List<Person> peopleOnRide = new ArrayList<Person>();

    /**
     *
     * @param name Sets name
     * @param dur Sets duration
     * @param cap Sets capacity
     * @param hold Sets holding line capacity
     */
    public Ride(String name, int dur, int cap, int hold){
        this.Name = name;
        this.duration = dur;
        this.capacity = cap;
        virtualLine = new VirtualLine(Name);
        holdingQueue = new HoldingQueue(Name);
        holdingQueue.setmaxSize(hold);
    }

    /**
     *
     * @return the duration
     */
    public int getDuration(){
        return duration;
    }

    /**
     *
     * @return time left
     */
    public int getTimeLeft(){
        return timeLeft;
    }

    /**
     *
     * @return name
     */
    public String getName(){
        return Name;
    }

    /**
     *
     * @return the virtual line list
     */
    public VirtualLine getVirtualLine(){
        return virtualLine;
    }

    /**
     *
     * @return the holding queue list
     */
    public HoldingQueue getHoldingQueue(){
        return holdingQueue;
    }

    /**
     *
     * @return the people on ride list
     */
    public List<Person> getPeopleOnRide(){
        return peopleOnRide;
    }

    /**
     *
     * @return the capacity
     */
    public int getCapacity(){
        return capacity;
    }

    /**
     *
     * @return how many times it was ridden
     */
    public int getRidden(){
        return ridden;
    }

    /**
     *
     * @param duration sets duration
     */
    public void setDuration(int duration){
        this.duration = duration;
    }

    /**
     *
     * @param timeLeft sets time left
     */
    public void setTimeLeft(int timeLeft){
        this.timeLeft = timeLeft;
    }

    /**
     *
     * @param name sets the name
     */
    public void setName(String name){
        this.Name = name;
    }

    /**
     *
     * @param virtualLine sets the new virtual line
     */
    public void setVirtualLine(VirtualLine virtualLine){
        this.virtualLine = virtualLine;
    }

    /**
     *
     * @param holdingQueue sets the new holding queue
     */
    public void setHoldingQueue(HoldingQueue holdingQueue){
        this.holdingQueue = holdingQueue;
    }

    /**
     *
     * @param people sets the new ride list
     */
    public void setPeopleOnRide(List<Person> people){
        this.peopleOnRide = people;
    }

    /**
     *
     * @param cap sets the new capacity
     */
    public void setCapacity(int cap){
        this.capacity = cap;
    }

    /**
     *
     * @param ridden sets new amount of riders ridden
     */
    public void setRidden(int ridden){
        this.ridden = ridden;
    }
}
