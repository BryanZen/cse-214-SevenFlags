/**
 * @Author Bryan Zen 113252725
 * @version 1.0
 * @since 2021-10-20
 */

import java.util.ArrayList;
import java.util.List;

/**
 *Write a fully-documented class named Person which contains an integer id,
 * the max amount of lines they can be on, array or a list of the current
 * lines that they are on and the current status of the person (an enum).
 * This class must contain methods that allow the user to manipulate the
 * instance variables (getters, setters, etc.)
 */
public class Person {
    private int number;
    private int maxLines;
    private int objNum;
    private int rideNum = 0;
    List<Ride> lines = new ArrayList<Ride>();
    private Status status;

    /**
     * Preconditions
     * The number must be positive.
     * @param number The number of the visitor
     * @param maxLines The maximum number of lines the Person can be on.
     * @param objNum the instance of that visitor
     */
    public Person(int number, int maxLines, int  objNum){
        this.number = number;
        this.maxLines = maxLines;
        this.objNum = objNum;
        this.status = Status.Available;
    }

    /**
     *
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @return maxLines
     */
    public int getMaxLines() {
        return maxLines;
    }

    /**
     *
     * @return lines
     */
    public List<Ride> getLines(){
        return lines;
    }

    /**
     *
     * @return status
     */
    public Status getStatus(){
        return status;
    }

    /**
     *
     * @return object number
     */
    public int getObjNum(){
        return objNum;
    }

    /**
     *
     * @return ride number
     */
    public int getRideNum(){
        return rideNum;
    }

    /**
     *
     * @param number sets new number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @param maxLines sets max lines
     */
    public void setMaxLines(int maxLines) {
        this.maxLines = maxLines;
    }

    /**
     *
     * @param lines sets lines
     */
    public void setLines(List<Ride> lines){
        this.lines = lines;
    }

    /**
     *
     * @param status sets new status
     */
    public void setStatus(Status status){
        this.status = status;
    }

    /**
     *
     * @param objNum sets object number
     */
    public void setObjNum(int objNum){
        this.objNum = objNum;
    }

    /**
     *
     * @param rideNum sets ride counter
     */
    public void setRideNum(int rideNum){
        this.rideNum = rideNum;
    }
}
