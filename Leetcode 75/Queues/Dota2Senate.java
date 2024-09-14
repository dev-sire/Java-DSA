package Queues;
import java.util.Deque;
import java.util.ArrayDeque;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        int totalSenators = senate.length();
        Deque<Integer> radiantQueue = new ArrayDeque<>();
        Deque<Integer> direQueue = new ArrayDeque<>();

        // Populate queues with the indices of 'R' and 'D' senators
        for (int i = 0; i < totalSenators; ++i) {
            if (senate.charAt(i) == 'R') {
                radiantQueue.offer(i);
            } else {
                direQueue.offer(i);
            }
        }
      
        // Process the queues until one of them is empty
        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int radiantIndex = radiantQueue.peek();
            int direIndex = direQueue.peek();
          
            // The senator with the lower index bans the opposing senator
            if (radiantIndex < direIndex) {
                // The radiant senator bans a dire senator and gets back in line
                radiantQueue.offer(radiantIndex + totalSenators);
            } else {
                // The dire senator bans a radiant senator and gets back in line
                direQueue.offer(direIndex + totalSenators);
            }

            // Remove the senators that have already made a ban
            radiantQueue.poll();
            direQueue.poll();
        }

        // Declare the winner depending on which queue is not empty
        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
    }
}