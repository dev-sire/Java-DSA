package Medium;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
      if (root == null)
        return false;
      return isContinuousSubPath(head, root) || isSubPath(head, root.left) ||
        isSubPath(head, root.right);
    }
  
    private boolean isContinuousSubPath(ListNode head, TreeNode root) {
      if (head == null)
        return true;
      if (root == null)
        return false;
      return head.val == root.val &&
        (isContinuousSubPath(head.next, root.left) || isContinuousSubPath(head.next, root.right));
    }
}