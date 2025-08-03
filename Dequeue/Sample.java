package Dequeue;

import java.util.*;
public class Sample {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- Deque Operations ----");
            System.out.println("1. Add to front");
            System.out.println("2. Add to rear");
            System.out.println("3. Remove from front");
            System.out.println("4. Remove from rear");
            System.out.println("5. Peek front");
            System.out.println("6. Peek rear");
            System.out.println("7. Print deque");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to add at front: ");
                    int frontVal = sc.nextInt();
                    deque.addFirst(frontVal);
                    break;
                case 2:
                    System.out.print("Enter number to add at rear: ");
                    int rearVal = sc.nextInt();
                    deque.addLast(rearVal);
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        System.out.println("Removed from front: " + deque.removeFirst());
                    } else {
                        System.out.println("Deque is empty!");
                    }
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        System.out.println("Removed from rear: " + deque.removeLast());
                    } else {
                        System.out.println("Deque is empty!");
                    }
                    break;
                case 5:
                    if (!deque.isEmpty()) {
                        System.out.println("Front element: " + deque.peekFirst());
                    } else {
                        System.out.println("Deque is empty!");
                    }
                    break;
                case 6:
                    if (!deque.isEmpty()) {
                        System.out.println("Rear element: " + deque.peekLast());
                    } else {
                        System.out.println("Deque is empty!");
                    }
                    break;
                case 7:
                    System.out.println("Current Deque: " + deque);
                    break;
                case 0:
                    System.out.println("Exiting... 👋");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        
        sc.close();
    }
}


//
// Method	Description
// addFirst(e)	Adds e to the front
// addLast(e)	Adds e to the back
// offerFirst(e)	Same as addFirst, but returns false if fails
// offerLast(e)	Same as addLast, but returns false if fails
// removeFirst()	Removes and returns the first element
// removeLast()	Removes and returns the last element
// pollFirst()	Same as removeFirst, but returns null if empty
// pollLast()	Same as removeLast, but returns null if empty
// peekFirst()	Returns front element without removing
// peekLast()	Returns back element without removing
// isEmpty()	Checks if deque is empty
// size()	Returns number of elements