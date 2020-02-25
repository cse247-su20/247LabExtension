import java.util.*;

public class TrainGraph1D{

    // Initialize instance variable
    static HashMap<String, ArrayList<String>> track = new HashMap<String, ArrayList<String>>();

    public static void main(String[] args){
        System.out.println("Train track problem");

        // we make sure that there is no cycle in this graph

        // initialize empty
        track.put("alpha", new ArrayList<String>());
        track.put("beta", new ArrayList<String>());
        track.put("delta", new ArrayList<String>());
        track.put("gamma", new ArrayList<String>());
        track.put("epsilon", new ArrayList<String>());
        track.put("phi", new ArrayList<String>());
        track.put("eta", new ArrayList<String>());

        // station --> next station(s)
        track.get("alpha").add("beta");
        track.get("beta").add("gamma");
        track.get("alpha").add("delta");
        track.get("delta").add("gamma");
        track.get("eta").add("beta");
        track.get("gamma").add("phi");
        track.get("epsilon").add("gamma");

        System.out.println("can we visit phi starting at alpha?: " + willVisitStation("alpha", "phi"));

    }

    public static boolean willVisitStation(String start, String targetDestination){
        // see if we can visit targetDestination from start
        // this can be iterative, or it can be recursive

        // end condition
        if(start.equals(targetDestination)){
            return true;
        }

        // edge case, end condition 2
        if(track.get(start).isEmpty()){
            // no more tracks to travel
            return false;
        }

        boolean canVisit = false;

        for(String route : track.get(start)){
            canVisit = canVisit || willVisitStation(route, targetDestination);
        }

        return canVisit;

    }

}