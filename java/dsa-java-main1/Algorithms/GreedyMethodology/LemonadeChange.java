package GreedyMethodology;

public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20}; // Array representing the bills given by customers.
        int c5 = 0, c10 = 0; // Counters for $5 and $10 bills. $20 bills are not tracked as they are not given as change.

        for (int bill : bills) {
            if (bill == 5) {
                c5++; // Customer pays with a $5 bill, increase count of $5 bills.
            } else if (bill == 10) {
                if (c5 == 0) { // Check if change is available.
                    System.out.println("fail");
                    return; // Not enough $5 bills to give change.
                }
                c10++; // Customer pays with a $10 bill.
                c5--; // Give one $5 bill as change.
            } else { // bill == 20
                if (c10 > 0 && c5 > 0) { // Prefer to give one $10 bill and one $5 bill as change.
                    c10--;
                    c5--;
                } else if (c5 >= 3) { // Otherwise, give three $5 bills as change.
                    c5 -= 3;
                } else { // Not enough change available.
                    System.out.println("fail");
                    return;
                }
            }
            // Print the status of the cash register after each transaction.
            System.out.println("Bill received: $" + bill);
            System.out.println("$5 bills: " + c5);
            System.out.println("$10 bills: " + c10);
        }
        // If we successfully provided change for all customers.
        System.out.println("complete");
    }
}

/*
Time Complexity: O(n)
- The algorithm processes each bill in the array exactly once.

Space Complexity: O(1)
- The algorithm uses a constant amount of extra space regardless of the input size.
*/
