package Medium;

public class NodesBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDistance = Integer.MAX_VALUE;
        int firstMaxIndex = -1;
        int prevMaxIndex = -1;
        int index = 1;
        ListNode prev = head;
        ListNode curr = head.next;

        while(curr.next != null){
            if(curr.val > prev.val && curr.val > curr.next.val ||
                curr.val < prev.val && curr.val < curr.next.val    
            ){
                if(firstMaxIndex == -1){
                    firstMaxIndex = index;
                }
                if(prevMaxIndex != -1){
                    minDistance = Math.min(minDistance, index - prevMaxIndex);
                }
                prevMaxIndex = index;
            }
            prev = curr;
            curr = curr.next;
            ++index;
        }
        if(minDistance == Integer.MAX_VALUE)
            return new int[] {-1,-1};

        return new int[] {minDistance, prevMaxIndex - firstMaxIndex};
    }
}