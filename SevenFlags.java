/**
 * @Author Bryan Zen 113252725
 * @version 1.0
 * @since 2021-10-20
 */

import java.util.Scanner;

/**
 *Write a fully-documented driver class called SevenFlags which runs the
 * simulation. You will need to have four rides: Blue Scream of Death (BSOD),
 * i386 Tower of Terror (ToT), GeForce (GF) and Kingda Knuth (KK). After
 * getting input from the user, the simulation should print a minute-by minute
 * breakdown as in the sample I/O. There is no need to sleep after each minute,
 * the simulation may all be printed at once.
 */
public class SevenFlags {
    /**
     * Runs the simulations using user inputs
     * @param args .
     * @throws EmptyQueueException if a queue is empty
     */
    public static void main(String[] args) throws EmptyQueueException{
        Scanner sc = new Scanner(System.in);
        int currentTime = 0;
        System.out.println("Welcome to Seven Flags!");
        int regCus = 0;
        boolean regCusB = false;
        while(!regCusB){
            System.out.println("Please enter the number of regular customers: ");
            regCus = sc.nextInt();
            try{
                if (regCus < 0){
                    throw new Exception();
                } else {
                    regCusB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int silCus = 0;
        boolean silCusB = false;
        while(!silCusB){
            System.out.println("Please enter the number of silver customers: ");
            silCus = sc.nextInt();
            try{
                if (silCus < 0){
                    throw new Exception();
                } else {
                    silCusB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int golCus = 0;
        boolean golCusB = false;
        while(!golCusB){
            System.out.println("Please enter the number of gold customers: ");
            golCus = sc.nextInt();
            try{
                if (golCus < 0){
                    throw new Exception();
                } else {
                    golCusB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int simLen = 0;
        boolean simLenB = false;
        while(!simLenB){
            System.out.println("Please enter simulation length: ");
            simLen = sc.nextInt();
            try{
                if (simLen < 0){
                    throw new Exception();
                } else {
                    simLenB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        /**
         * double[] probabilities = new double[4];
         *         double prob1 = probabilities[0];
         *         double prob2 = probabilities[1];
         *         double prob3 = probabilities[2];
         *         double prob4 = probabilities[3];
         *         boolean probB = false;
         *         while(!probB){
         *             System.out.println("Please Enter probability of Blue Scream of Death: ");
         *             prob1 = sc.nextDouble();
         *             System.out.println("Please Enter probability of Kingda Knuth: ");
         *             prob2 = sc.nextDouble();
         *             System.out.println("Please Enter probability of i386 Tower of Terror: ");
         *             prob3 = sc.nextDouble();
         *             System.out.println("Please Enter probability of GeForce: ");
         *             prob4 = sc.nextDouble();
         *             double prob = (prob1 + prob2 + prob3 + prob4);
         *             int probI = 0;
         *             if (prob > 0.9999){
         *                 probI = (int) Math.round(prob);
         *             }
         *             try{
         *                 if (probI != 1){
         *                     throw new Exception();
         *                 } else {
         *                     probB = true;
         *                 }
         *             } catch (Exception e) {
         *                 System.out.println("Bad Input!");
         *             }
         *         }
         */
        System.out.println();
        int bsodDur = 0;
        boolean bsodDurB = false;
        while(!bsodDurB){
            System.out.println("Please enter the duration of Blue Scream of Death (minutes): ");
            bsodDur = sc.nextInt();
            try{
                if (bsodDur < 1){
                    throw new Exception();
                } else {
                    bsodDurB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int bsodCap = 0;
        boolean bsodCapB = false;
        while(!bsodCapB){
            System.out.println("Please enter the capacity of Blue Scream of Death: ");
            bsodCap = sc.nextInt();
            try{
                if (bsodCap < 1){
                    throw new Exception();
                } else {
                    bsodCapB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int bsodHod = 0;
        boolean bsodHodB = false;
        while(!bsodHodB){
            System.out.println("Please enter the holding queue size for Blue Scream of Death: ");
            bsodHod = sc.nextInt();
            try{
                if (bsodHod < 1){
                    throw new Exception();
                } else {
                    bsodHodB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        System.out.println();
        int kkDur = 0;
        boolean kkDurB = false;
        while(!kkDurB){
            System.out.println("Please enter the duration of Kingda Knuth (minutes): ");
            kkDur = sc.nextInt();
            try{
                if (kkDur < 1){
                    throw new Exception();
                } else {
                    kkDurB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int kkCap = 0;
        boolean kkCapB = false;
        while(!kkCapB){
            System.out.println("Please enter the capacity of Kingda Knuth: ");
            kkCap = sc.nextInt();
            try{
                if (kkCap < 1){
                    throw new Exception();
                } else {
                    kkCapB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int kkHod = 0;
        boolean kkHodB = false;
        while(!kkHodB){
            System.out.println("Please enter the holding queue size for Kingda Knuth: ");
            kkHod = sc.nextInt();
            try{
                if (kkHod < 1){
                    throw new Exception();
                } else {
                    kkHodB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        System.out.println();
        int totDur = 0;
        boolean totDurB = false;
        while(!totDurB){
            System.out.println("Please enter the duration of i386 Tower of Terror (minutes): ");
            totDur = sc.nextInt();
            try{
                if (totDur < 1){
                    throw new Exception();
                } else {
                    totDurB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int totCap = 0;
        boolean totCapB = false;
        while(!totCapB){
            System.out.println("Please enter the capacity of i386 Tower of Terror: ");
            totCap = sc.nextInt();
            try{
                if (totCap < 1){
                    throw new Exception();
                } else {
                    totCapB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int totHod = 0;
        boolean totHodB = false;
        while(!totHodB){
            System.out.println("Please enter the holding queue size for i386 Tower of Terror: ");
            totHod = sc.nextInt();
            try{
                if (totHod < 1){
                    throw new Exception();
                } else {
                    totHodB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        System.out.println();
        int gfDur = 0;
        boolean gfDurB = false;
        while(!gfDurB){
            System.out.println("Please enter the duration of GeForce (minutes): ");
            gfDur = sc.nextInt();
            try{
                if (gfDur < 1){
                    throw new Exception();
                } else {
                    gfDurB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int gfCap = 0;
        boolean gfCapB = false;
        while(!gfCapB){
            System.out.println("Please enter the capacity of GeForce: ");
            gfCap = sc.nextInt();
            try{
                if (gfCap < 1){
                    throw new Exception();
                } else {
                    gfCapB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        int gfHod = 0;
        boolean gfHodB = false;
        while(!gfHodB){
            System.out.println("Please enter the holding queue size for GeForce: ");
            gfHod = sc.nextInt();
            try{
                if (gfHod < 1){
                    throw new Exception();
                } else {
                    gfHodB = true;
                }
            } catch (Exception e) {
                System.out.println("Bad Input!");
            }
        }
        System.out.println();

        Ride[] sevenFlags = new Ride[4];
        sevenFlags[0] = new Ride("Blue Scream of Death", bsodDur, bsodCap, bsodHod);
        sevenFlags[1] = new Ride("Kingda Knuth", kkDur, kkCap, kkHod);
        sevenFlags[2] = new Ride("i386 Tower of Terror", totDur, totCap, totHod);
        sevenFlags[3] = new Ride("GeForce", gfDur, gfCap, gfHod);

        int visCount = 0;
        int totalVisitors = regCus + (silCus * 2) + (golCus * 3);

        Person[] allCus = new Person[totalVisitors];

        for (int i = 0; i < golCus; i++){
            Person customerV1 = new Person(i + 1, 3, 1);
            allCus[visCount] = customerV1;
            visCount++;
            Person customerV2 = new Person(i + 1, 3, 2);
            allCus[visCount] = customerV2;
            visCount++;
            Person customerV3 = new Person(i + 1, 3, 3);
            allCus[visCount] = customerV3;
            visCount++;
        }
        for (int i = 0; i < silCus; i++){
            Person customerV1 = new Person(i + 1, 2, 1);
            allCus[visCount] = customerV1;
            visCount++;
            Person customerV2 = new Person(i + 1, 2, 2);
            allCus[visCount] = customerV2;
            visCount++;
        }
        for (int i = 0; i < regCus; i++){
            Person customerV1 = new Person(i + 1, 1, 1);
            allCus[visCount] = customerV1;
            visCount++;
        }
        for (Person cus : allCus) {
            if (cus.getObjNum() == 1) {
                Ride ride = RandomGenerator.selectRide(sevenFlags);
                ride.getVirtualLine().enqueue(cus);
                cus.getLines().add(ride);
            }
        }
        for (Person cus : allCus) {
            if (cus.getObjNum() == 2) {
                Ride ride = RandomGenerator.selectRide(sevenFlags);
                ride.getVirtualLine().enqueue(cus);
                cus.getLines().add(ride);
            }
        }
        for (Person cus : allCus) {
            if (cus.getObjNum() == 3) {
                Ride ride = RandomGenerator.selectRide(sevenFlags);
                ride.getVirtualLine().enqueue(cus);
                cus.getLines().add(ride);
            }
        }
        for (int i = 0; i < 4; i++){
            int cap = sevenFlags[i].getCapacity();
            int in = 0;
            for (int j = 0; j < sevenFlags[i].getVirtualLine().size(); j++){
                if (in == cap){
                    break;
                }
                if (sevenFlags[i].getVirtualLine().peek().getStatus() == Status.Available){
                    Person person = sevenFlags[i].getVirtualLine().dequeue();
                    statusChange(person, Status.OnRide, allCus);
                    sevenFlags[i].getPeopleOnRide().add(person);
                    in++;
                } else {
                    Person person = sevenFlags[i].getVirtualLine().dequeue();
                    sevenFlags[i].getVirtualLine().enqueue(person);
                }
            }
        }
        for (int i = 0; i < 4; i++){
            int hold = sevenFlags[i].getHoldingQueue().getmaxSize();
            int virLine = 0;
            for (int j = 0; j < sevenFlags[i].getVirtualLine().size(); j++){
                if (sevenFlags[i].getVirtualLine().get(j).getStatus() == Status.Available){
                    virLine++;
                }
            }
            if (virLine >= hold){
                int in = 0;
                for (int j = 0; j < sevenFlags[i].getVirtualLine().size(); j++){
                    if (in == hold){
                        break;
                    }
                    if (sevenFlags[i].getVirtualLine().peek().getStatus() == Status.Available){
                        Person person = sevenFlags[i].getVirtualLine().dequeue();
                        statusChange(person, Status.Holding, allCus);
                        sevenFlags[i].getHoldingQueue().add(person);
                        in++;
                    } else {
                        Person person = sevenFlags[i].getVirtualLine().dequeue();
                        sevenFlags[i].getVirtualLine().enqueue(person);
                    }
                }
            } else{
                for (int j = 0; j < sevenFlags[i].getVirtualLine().size(); j++){
                    if (sevenFlags[i].getVirtualLine().peek().getStatus() == Status.Available){
                        Person person = sevenFlags[i].getVirtualLine().dequeue();
                        statusChange(person, Status.Holding, allCus);
                        sevenFlags[i].getHoldingQueue().enqueue(person);
                    } else {
                        Person person = sevenFlags[i].getVirtualLine().dequeue();
                        sevenFlags[i].getVirtualLine().enqueue(person);
                    }
                }
            }
        }
        while (currentTime <= simLen){
            print(currentTime, sevenFlags, allCus);
            currentTime++;
            for (int i = 0; i < 4; i++){
                int rideTime = sevenFlags[i].getDuration();
                if (currentTime != 0 && currentTime % rideTime == 0){
                    int offRide = sevenFlags[i].getPeopleOnRide().size();
                    for (int j = 0; j < offRide; j++){
                        Person person = sevenFlags[i].getPeopleOnRide().remove(0);
                        person.getLines().remove(0);
                        person.setRideNum(person.getRideNum() + 1);
                        sevenFlags[i].setRidden(sevenFlags[i].getRidden() + 1);
                        statusChange(person, Status.Available, allCus);
                        Ride ride = RandomGenerator.selectRide(sevenFlags);
                        ride.getVirtualLine().enqueue(person);
                        person.getLines().add(ride);
                    }
                    int onRide = sevenFlags[i].getHoldingQueue().size();
                    for (int j = 0; j < onRide; j++){
                        Person person = sevenFlags[i].getHoldingQueue().remove(0);
                        statusChange(person, Status.OnRide, allCus);
                        sevenFlags[i].getPeopleOnRide().add(person);
                    }
                    int hold = sevenFlags[i].getHoldingQueue().getmaxSize();
                    int virLine = 0;
                    for (int j = 0; j < sevenFlags[i].getVirtualLine().size(); j++){
                        if (sevenFlags[i].getVirtualLine().get(j).getStatus() == Status.Available){
                            virLine++;
                        }
                    }
                    if (virLine >= hold){
                        int in = 0;
                        for (int j = 0; j < sevenFlags[i].getVirtualLine().size(); j++){
                            if (in == hold){
                                break;
                            }
                            if (sevenFlags[i].getVirtualLine().peek().getStatus() == Status.Available){
                                Person person = sevenFlags[i].getVirtualLine().dequeue();
                                statusChange(person, Status.Holding, allCus);
                                sevenFlags[i].getHoldingQueue().enqueue(person);
                                in++;
                            } else {
                                Person person = sevenFlags[i].getVirtualLine().dequeue();
                                sevenFlags[i].getVirtualLine().enqueue(person);
                            }
                        }
                    } else{
                        for (int j = 0; j < sevenFlags[i].getVirtualLine().size(); j++){
                            if (sevenFlags[i].getVirtualLine().peek().getStatus() == Status.Available){
                                Person person = sevenFlags[i].getVirtualLine().dequeue();
                                statusChange(person, Status.Holding, allCus);
                                sevenFlags[i].getHoldingQueue().enqueue(person);
                            } else {
                                Person person = sevenFlags[i].getVirtualLine().dequeue();
                                sevenFlags[i].getVirtualLine().enqueue(person);
                            }
                        }
                    }
                }
            }
        }
        double goldRidden = 0;
        double silverRidden = 0;
        double regularRidden = 0;
        for (Person cus : allCus){
            if (cus.getMaxLines() == 3){
                goldRidden += cus.getRideNum();
            }
            if (cus.getMaxLines() == 2){
                silverRidden += cus.getRideNum();
            }
            if (cus.getMaxLines() == 1){
                regularRidden += cus.getRideNum();
            }
        }
        goldRidden = goldRidden/golCus;
        silverRidden = silverRidden/silCus;
        regularRidden = regularRidden/regCus;

        System.out.println();
        System.out.printf("""
                On average, Gold customers have taken %.2f rides.
                On average, Silver customers have taken %.2f rides.
                On average, regular customers have taken %.2f rides.
                """, goldRidden, silverRidden, regularRidden);
        System.out.println();
        System.out.printf("""
                BSOD has completed rides for %d people.
                KK has completed rides for %d people.
                ToT has completed rides for %d people.
                GF has completed rides for %d people.""",
                sevenFlags[0].getRidden(), sevenFlags[1].getRidden(),
                sevenFlags[2].getRidden(), sevenFlags[3].getRidden());
    }

    /**
     * Changes the status of every instance of a visitor
     * @param person person that must be changed
     * @param status status that we are changing to
     * @param allCus the Array that we find the person in
     */
    public static void statusChange(Person person, Status status, Person[] allCus){
        int max = person.getMaxLines();
        int num = person.getNumber();
        for (Person cus : allCus) {
            if (cus.getMaxLines() == max && cus.getNumber() == num) {
                cus.setStatus(status);
            }
        }
    }

    /**
     * Returns the abbreviated name of the line a person is in
     * @param person the person that we are finding
     * @param sevenFlags the Array of rides that we look through
     * @return A string of abbreviated letters
     */
    public static String currentLine(Person person, Ride[] sevenFlags){
        Ride ride = person.getLines().get(0);
        String str = "";
        if (ride == sevenFlags[0]){
            str = "BSOD";
        }
        if (ride == sevenFlags[1]){
            str = "KK";
        }
        if (ride == sevenFlags[2]){
            str = "ToT";
        }
        if (ride == sevenFlags[3]){
            str = "GF";
        }
        return str;
    }

    /**
     * Prints the simulation at a given time
     * @param currentTime The current time
     * @param sevenFlags the array of rides to print from
     * @param allCus the array of visitors to search from
     */
    public static void print(int currentTime, Ride[] sevenFlags, Person[] allCus){
        int bsodRem = (sevenFlags[0].getDuration()) - (currentTime % (sevenFlags[0].getDuration()));
        int kkRem = (sevenFlags[1].getDuration()) - (currentTime % (sevenFlags[1].getDuration()));
        int totRem = (sevenFlags[2].getDuration()) - (currentTime % (sevenFlags[2].getDuration()));
        int gfRem = (sevenFlags[3].getDuration()) - (currentTime % (sevenFlags[3].getDuration()));
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("At Time %d \n", currentTime);
        System.out.println();

        for (int n = 0; n < 4; n++){
            if (n == 0){
                System.out.printf("Blue Scream of Death - Time remaining: %d min \n", bsodRem);
            }
            if (n == 1){
                System.out.printf("Kingda Knuth - Time remaining: %d min \n", kkRem);
            }
            if (n == 2){
                System.out.printf("i386 Tower of Terror - Time remaining: %d min \n", totRem);
            }
            if (n == 3){
                System.out.printf("GeForce - Time remaining: %d min \n", gfRem);
            }
            System.out.print("On Ride:");
            for (int i = 0; i < sevenFlags[n].getPeopleOnRide().size(); i++){
                Person person = sevenFlags[n].getPeopleOnRide().get(i);
                if (person.getMaxLines() == 3){
                    System.out.printf(" Gold %d", person.getNumber());
                }
                if (person.getMaxLines() == 2){
                    System.out.printf(" Silver %d", person.getNumber());
                }
                if (person.getMaxLines() == 1){
                    System.out.printf(" Regular %d", person.getNumber());
                }
                if (i != (sevenFlags[n].getPeopleOnRide().size()) - 1){
                    System.out.print(",");
                }
            }
            System.out.println();
            System.out.print("Holding Queue:");
            for (int i = 0; i < sevenFlags[n].getHoldingQueue().size(); i++){
                Person person = sevenFlags[n].getHoldingQueue().get(i);
                if (person.getMaxLines() == 3){
                    System.out.printf(" Gold %d", person.getNumber());
                }
                if (person.getMaxLines() == 2){
                    System.out.printf(" Silver %d", person.getNumber());
                }
                if (person.getMaxLines() == 1){
                    System.out.printf(" Regular %d", person.getNumber());
                }
                if (i != (sevenFlags[n].getHoldingQueue().size()) - 1){
                    System.out.print(",");
                }
            }
            System.out.println();
            System.out.print("Virtual Queue:");
            for (int i = 0; i < sevenFlags[n].getVirtualLine().size(); i++){
                Person person = sevenFlags[n].getVirtualLine().get(i);
                if (person.getMaxLines() == 3){
                    System.out.printf(" Gold %d", person.getNumber());
                }
                if (person.getMaxLines() == 2){
                    System.out.printf(" Silver %d", person.getNumber());
                }
                if (person.getMaxLines() == 1){
                    System.out.printf(" Regular %d", person.getNumber());
                }
                if (i != (sevenFlags[n].getVirtualLine().size()) - 1){
                    System.out.print(",");
                }
            }
            System.out.println();
            System.out.println("----------------");
        }
        System.out.println("Regular Customers: ");
        System.out.println();
        System.out.println("Num Line Status");
        System.out.println("----------------");
        int regCount = 0;
        for (Person cus : allCus) {
            if (cus.getMaxLines() == 1) {
                regCount++;
                String ride = currentLine(cus, sevenFlags);
                System.out.printf("%d. %s %s \n", regCount, ride, cus.getStatus());
            }
        }
        System.out.println();
        System.out.println("Silver Customers: ");
        System.out.println();
        System.out.println("Num Line 1 Line 2 Status");
        System.out.println("------------------------");
        int silCount = 0;
        for (Person cus1 : allCus) {
            String line1s = "";
            String line2s = "";
            if (cus1.getMaxLines() == 2 && cus1.getObjNum() == 1 && cus1.getNumber() == silCount + 1){
                silCount++;
                line1s = currentLine(cus1, sevenFlags);
                for (Person cus2 : allCus){
                    if (cus2.getMaxLines() == 2 && cus2.getObjNum() == 2 && cus2.getNumber() == cus1.getNumber()){
                        line2s = currentLine(cus2, sevenFlags);
                        System.out.printf("%d. %s %s %s \n", silCount, line1s, line2s, cus1.getStatus());
                        break;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Gold Customers: ");
        System.out.println();
        System.out.println("Num Line 1 Line 2 Line 3 Status");
        System.out.println("-------------------------------");
        int golCount = 0;
        for (Person cus1 : allCus) {
            String line1g = "";
            String line2g = "";
            String line3g = "";
            if (cus1.getMaxLines() == 3 && cus1.getObjNum() == 1 && cus1.getNumber() == golCount + 1) {
                golCount++;
                line1g = currentLine(cus1, sevenFlags);
                for (Person cus2 : allCus) {
                    if (cus2.getMaxLines() == 3 && cus2.getObjNum() == 2 && cus2.getNumber() == cus1.getNumber()) {
                        line2g = currentLine(cus2, sevenFlags);
                        for (Person cus3 : allCus) {
                            if (cus3.getMaxLines() == 3 && cus3.getObjNum() == 3 && cus3.getNumber() == cus1.getNumber()) {
                                line3g = currentLine(cus3, sevenFlags);
                                System.out.printf("%d. %s %s %s %s \n", golCount, line1g, line2g, line3g, cus1.getStatus());
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
