import java.util.*;

public class sumPairs{
    public static void main(String[] args){

        // should print "2 3"
        findPair(new int[]{1,2,4,3,9}, 7);

        // should print "-1"
        findPair(new int[]{1,2,4,3,9}, 293874);

        // should print the earliest pair, "0 1"
        findPair(new int[]{10,3,4,3,9}, 13);

    }

    public static void findPair(int array[], int target){
        // Solution code
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < array.length; i++){
            int c = array[i];

            if(map.containsKey(target - c)){ // win condition
                // found solution
                System.out.println(map.get(target - c) + " "+i);
                return;
            }

            if(!map.containsKey(c)){
                map.put(c, i);
            }

        }

        System.out.println("-1");

    }
}