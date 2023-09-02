/*
Write a program to remove all Strings of even length from a list of Strings.
Your program will need to be efficient to avoid timing out in HyperGrade.

Note: This program outputs a text file with evens removed, but the HyperGrade
version does not.
*/

/* 
Three methods to remove Strings of even length from an array of Strings using
Hamlet10Times.txt as input (file size ~ 2 MB):

Version 1: Arraylist using list.remove() - slow
Version 2: ArrayList witout list.remove() - fast
Version 3a: LinkedList using an iterator object - fast
Version 3b: LinkedList without an iterator object - extremely slow
*/

import java.io.*;
import java.util.*;
public class LinkedListRemoveEvens {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Removes strings of even length from an array.");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter filename for file containing strings: ");
        String fileName = console.nextLine();
        Scanner input = new Scanner(new File(fileName));    // Hamlet10Times.txt ~ 2MB

        System.out.println("Enter two indices for range of odd words to be printed out: ");
        int n1 = console.nextInt();
        int n2 = console.nextInt();

/*
Version 1: Arraylist takes about 7 seconds to process Hamlet10Times.txt
*/
//        // load Strings into an ArrayList
//        ArrayList<String> list = new ArrayList<String>();
//        while (input.hasNext()) {
//            String word = input.next();
//            list.add(word);
//        }
//        System.out.println("initial list.size(): " + list.size());
//
//        int i = 0;
//        while (i < list.size()) {
//            String element = list.get(i);
//            if (element.length() % 2 == 0) {
//                list.remove(i);             // even: remove element
//                } else {
//                i++;                        // odd: do not remove element
//            }
//        }
//
//        System.out.println("final   list.size(): " + list.size());
//        PrintStream output = new PrintStream(new File("EvensRemoved.txt"));
//        int j = 0;
//        while (j < list.size()) {
//            output.println(list.get(j));    // populate .txt file in program folder
//            j++;
//        }
//
//        System.out.println("odd words from index " + n1 + " to " + n2 + ":");
//        for (int k = n1; k <= n2; k++) {
//            System.out.println(list.get(k));
//        }
/*
end of Version 1
*/



// /*
// Version 2: Arraylist WITHOUT list.remove(). Instead, evens are replaced with an
// "even" flag.
// Takes less than 1 second.
// */
//         // load Strings into an ArrayList
//         ArrayList<String> list = new ArrayList<String>();
//         while (input.hasNext()) {
//             String word = input.next();
//             list.add(word);
//         }
//         System.out.println("initial list.size(): " + list.size());

//         int i = 0;
//         String flag = "even";           // all even strings will be replaced with "even"
//         while (i < list.size()) {
//             String element = list.get(i);
//             if (element.length() % 2 == 0) {
//                 list.set(i, flag);      // even: set element to flag
//                 i++;                    // skip to next element
//             } else {
//                 i++;                    // odd: do not change element
//             }
//         }

//         System.out.println("final   list.size(): " + list.size());
//         PrintStream output = new PrintStream(new File("EvensRemoved.txt"));
//         int j = 0;
//         while (j < list.size()) {
//             if (list.get(j) != flag) {       // skip over flags
//                 output.println(list.get(j)); // populate .txt file in program folder
//             }
//             j++;
//         }

//         // Print odd words from n1th to n2th indices
//         System.out.println("Odd words from index " + n1 + " to " + n2 + ":");
//         Scanner input2 = new Scanner(new File("EvensRemoved.txt")); // evens removed
//         for (int k = 0; k < n1; k++) {
//             String stepOver = input2.next();    // step to starting point
//         }
//         for (int k = 0; k <= (n2 - n1); k++) {
//             System.out.println(input2.next());
//         }

// /*
// end of Version 2
// */




 
 //Version 3: LinkedList using an iterator - takes less than 1 second.
 
         // load Strings into a LinkedList
         LinkedList<String> list = new LinkedList<String>();
         while (input.hasNext()) {
             String word = input.next();
             list.add(word);
         }
         System.out.println("initial list.size(): " + list.size());

         // get an iterator for list
         // Note: under the hood, Java makes iterator when compiling for-each loop
         Iterator<String> itr = list.iterator();
         while (itr.hasNext()) {
             String element = itr.next();
             if (element.length() % 2 == 0) {
                 itr.remove();               // does not change node count
             }
         }

         // Start by deleting "EvensRemoved.txt file" if it exists.
         System.out.println("final   list.size(): " + list.size());
         PrintStream output = new PrintStream(new File("EvensRemoved.txt"));

              // This loop takes a FEW MINUTES to complete! An "EvensRemoved.txt file"
              // is written to the program folder right away, but if you open it right
              // away you find it is incomplete. You can monitor progress by repeatedly
              // opening it and observing that the last word in the file has changed.
              // LinkedList is incredibly slow for sequential operations like this
              // which do not use an iterator.
              int j = 0;
              while (j < list.size()) {
                  output.println(list.get(j));    // populate .txt file in program folder
                  j++;
              }
              

             // Using an iterator, this loop takes about two seconds to complete.
             Iterator<String> itr2 = list.iterator();
             while (itr2.hasNext()) {
                 output.println(itr2.next());    // populate .txt file in program folder
             }

         // Print odd words from n1th to n2th indices
         System.out.println("odd words from index " + n1 + " to " + n2 + ":");
         Scanner input2 = new Scanner(new File("EvensRemoved.txt")); // evens removed
         for (int k = 0; k < n1; k++) {
             String stepOver = input2.next();    // step to starting point
         }
         for (int k = 0; k <= (n2 - n1); k++) {
             System.out.println(input2.next());
         }

 /*
 end of Version 3
 */

    }
}