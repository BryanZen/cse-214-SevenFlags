/**
 * @Author Bryan Zen 113252725
 * @version 1.0
 * @since 2021-10-20
 */

/**
 *You must write a fully documented class that randomly selects a ride.
 */
public class RandomGenerator {
    public RandomGenerator(){
    }

    /**
     * Returns a uniformly distributed probability
     * @param rides the ride array that we choose from
     * @return the ride that is randomly chosen
     */
    public static Ride selectRide(Ride[] rides){
        int rng = (int) (Math.random() * 4);
        return rides[rng];
    }

    /**
     * Uses user input to generate a ride
     * @param rides the array that we search for rides in
     * @param probabilities the array of probabilities
     * @return the ride that was randomly chosen
     */
    public static Ride selectRide(Ride[] rides, double[] probabilities){
        int x = -1;
        double ride0 = probabilities[0];
        double ride1 = probabilities[1];
        double ride2 = probabilities[2];
        double ride3 = probabilities[3];
        double range1 = ride0 + ride1;
        double range2 = range1 + ride2;
        double rng = Math.random();
        if (rng < ride0){
            x = 0;
        }
        if (rng >= ride0 && rng < range1){
            x = 1;
        }
        if (rng >= range1 && rng < range2){
            x = 2;
        }
        if (rng >= range2){
            x = 3;
        }
        return rides[x];
    }
}