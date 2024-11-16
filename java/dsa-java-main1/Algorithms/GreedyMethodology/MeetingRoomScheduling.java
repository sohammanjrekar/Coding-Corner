package GreedyMethodology;

import java.util.Arrays;
import java.util.Comparator;

// Activity Selection Problem
public class MeetingRoomScheduling {
    
    // Define a Meeting class to store start and end times
    static class Meeting {
        int start, end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Meeting{start=" + start + ", end=" + end + "}";
        }
    }

    // Function to find the maximum number of meetings that can be scheduled
    public static int maxMeetings(int[] start, int[] end, int n) {
        Meeting[] meetings = new Meeting[n];
        
        // Create an array of Meeting objects
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
        }

        // Print initial meetings
        System.out.println("Initial meetings:");
        for (Meeting meeting : meetings) {
            System.out.println(meeting);
        }

        // Sort meetings by their end times
        Arrays.sort(meetings, Comparator.comparingInt(m -> m.end));

        // Print sorted meetings
        System.out.println("Sorted meetings by end time:");
        for (Meeting meeting : meetings) {
            System.out.println(meeting);
        }

        // Select meetings using the greedy approach
        int count = 1; // Count the first meeting
        int lastEnd = meetings[0].end; // Track the end time of the last selected meeting

        System.out.println("Selected meetings:");
        System.out.println(meetings[0]); // First meeting is always selected
        for (int i = 1; i < n; i++) {
            if (meetings[i].start > lastEnd) {
                count++;
                lastEnd = meetings[i].end;
                System.out.println(meetings[i]); // Print selected meeting
            }
        }

        return count; // Return the maximum number of non-overlapping meetings
    }

    // Main method to test the meeting room scheduling problem
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int n = start.length;

        System.out.println("Maximum number of meetings: " + maxMeetings(start, end, n));
    }
}
