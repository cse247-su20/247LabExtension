import java.util.*;

public class commonSequence{

    public static void main(String[] args){
        System.out.println("commonSequence problem");

        // should return "aaa"
        System.out.println(common_n_BP("acgtcaaaagtcaggctaaataaacttaaaatattcaaatcgatcgaaaagatcgatcgggctagctaaa", 3));
    }

    /*
        common_n_BP()
        purpose: in a given DNA sequence, find the most commonly-occuring contiguous
                sequence of length n. You can assume overlapping sequences can be considered
                separately.
        parameters: String 'sequence' represents the DNA sequence to scan
                    int 'n' represents the length of the sequence to be scanning for
        return type: a String that represents the most commonly occuring DNA
                    sequence of length n
        target runtime: O(n)
        questions: with so many calls to HashMap.get(), why are we still in amortized linear time?
        answer: assuming Simple Uniform Hashing, each .get() call is a constant time
    */

    public static String common_n_BP(String sequence, int n){
        // Solution code
        // Note: We could make this even faster if we used a "rolling hash"
        
        HashMap<String, Integer> counter = new HashMap<String, Integer>(); // to be replaced by students' HashMaps

        if(sequence.length() < n) return ""; // edge case

        String mostCommonSequenceSoFar = "";
        int maxOccurences = 0;

        for(int i = 0; i < sequence.length()-n; i++){
            int start = i;
            int end = i + n;
            String seq = sequence.substring(start, end); // get the n-base pair sequence

            if(!counter.containsKey(seq)){ // insert it into the HashMap
                counter.put(seq, 1);
            } else {
                counter.put(seq, counter.get(seq)+1);
            }

            if(counter.get(seq) > maxOccurences){ // check if it's the new most commonly occuring sequence
                // if so, update values
                mostCommonSequenceSoFar = seq;
                maxOccurences = counter.get(seq);
            }
        }

        return mostCommonSequenceSoFar;

    }

}