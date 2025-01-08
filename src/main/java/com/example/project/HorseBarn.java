package com.example.project;


public class HorseBarn {
    /** The stalls in the barn. Each array element holds a reference to the Horse
     *  that is currently occupying the stall. A null value indicates an empty stall.
     */
    private Horse[] stalls;


    /** Initializes stalls to an array with a length equal to numStalls
     *  (all elements remain null initially)
     *
     *  @param numStalls  the number of stalls in the barn
     */
    public HorseBarn(int numStalls) {
        stalls = new Horse[numStalls];
    }


    public Horse[] getStalls() {
        return stalls;
    }


    /** Assigns stalls to reference sampleHorses
     */
    public HorseBarn(Horse[] sampleStalls) {
        stalls = sampleStalls;
    }


    /** Getter/accessor method for stalls
     *
     *  @return  a references to the stalls array
     */
    // to be added in part (a)


    /** Returns a string that shows which horses are in which stalls
     */
    public String horseBarnInfo() {
        String barnInfo = "";
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] == (null)) {
                barnInfo += "Stall " + i + ": empty";
                barnInfo += "\n";
            } else {
                barnInfo += "Stall " + i + ": name: " + stalls[i].getName() + ", weight: " + stalls[i].getWeight();
                barnInfo += "\n";
            }
        }
        return barnInfo;
    }


    /** Places a Horse into stalls at the index indicated by stall
     *
     *  PRECONDITION: stall is a valid index of stalls
     *
     *  @param horse  the Horse object to place into stalls
     *  @param stall  the index of stalls to place the Horse
     */
    public void placeHorse(Horse horse, int stall) {
        stalls[stall] = horse;
    }


    /** Returns the index of the stall that contains the horse with the specified name.
     *
     * Precondition: No two horses in the barn have the same name.
     *
     * @param  name the name of the horse to find
     * @return  the index of the stall containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseStall(String name) {
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null && name.equals(stalls[i].getName())) {
                return i;
            }
        }
        return -1;
    }


    /** Consolidates the barn by moving horses so that the horses are in adjacent
     *  stalls, starting at index 0, with no empty stall between any two horses.
     *
     *  POSTCONDITION: The order of the horses is the same as before the consolidation.
     */
    public void consolidate() {
        Horse[] tempArray = new Horse[stalls.length];
        int index = 0;
        for (Horse horse : stalls) {
            if (horse != null) {
                tempArray[index] = horse;
                index++;
            }
        }
        stalls = tempArray;
    }
}

