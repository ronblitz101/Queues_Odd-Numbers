/**
 * Create a queue program that will add 10 odd numbers in the list. 
 * Remove the first and last number in the list.
 */

import java.util.*;

public class Queue_OddNumbers {
    public static void main(String[] args) {
        Queue <Integer> queueIntegers = new LinkedList <Integer>();
        Scanner input = new Scanner(System.in);
        int intOddNumbers;
        boolean isInvalid;

        System.out.print("\n\n");
        for(int intIteration = 1; intIteration <= 10; intIteration++){
            do {
                isInvalid = false;
                System.out.print("Enter an odd number " + intIteration + ": ");
                intOddNumbers = input.nextInt();

                if (intOddNumbers % 2 == 1)
                    queueIntegers.add(intOddNumbers);
                else {
                    System.out.println("\n\t>> Not an odd number.\n");
                    isInvalid = true;
                }
            } while (isInvalid);
        }
        System.out.println("\nQueue: " + queueIntegers);
        queueIntegers.remove();     // Removal of first number

        Queue<Integer> reversedQueue = new LinkedList<Integer>(queueIntegers);
        Collections.reverse((List<?>) reversedQueue);       // Reversal of queue to remove the last number
        reversedQueue.remove();         // Removal of last number

        queueIntegers = new LinkedList<>(reversedQueue);
        Collections.reverse((List<?>) queueIntegers);       // Reversal of queue to bring back previous seqeuence

        System.out.println("\t\nThe first and last number removed: " + queueIntegers);

        input.close();
    }
}