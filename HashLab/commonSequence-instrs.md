# Most common base pair problem: instructions

## Guiding questions

1. Give a high-level description in English of an algorithm to solve the
   problem.  For example, your algorithm might start with "Scan through
   the sequence, and for each substring of length n..." etc.
   A: Scan through the sequence, and for each substring of length n
(i.e. each `n-gram`), increment a count of how many times it's occurred.
At the end of the process, return the most frequently occurring n-gram .   
2. Now think about implementing your algorithm.  What data structure
seems most straightforward to use to implement the algorithm?  Are there
any issues with using that structure?
   A: An array seems best as we could directly store/look up counts of
each n-gram.  However, there are two issues with using an array:    
      * It could take a prohibitive amount of space, as we'd need one
        slot for each possible n-gram.
      * We'd need to figure out how to map n-grams to array indices.

3. How would you use hash tables instead to implement the algorithm?
Would the table implement a Set or a Map?  If a Set, what would the keys
be, and if a Map, what would the keys
and values be?
   A:  A hash-table Map would work well, with n-grams as keys and counts
for each n-gram as values. 

4. How would using a hash table address the issues you raised in #2?   
   A: A hash table (with hashing scheme) would be able to translate an
n-gram to a valid table index, and because of this translation the table could
be as small as necessary (as long as it could store a count for all
n-grams).

## Instructions

Implement your proposed algorithm using your own hash table as the
supporting data structure.  

* Write test cases similar to those given in the example `main` class to
  verify that your solution returns correct results.  Can you give any
  inputs that will "break" your code by causing it to return incorrect
  results?   
