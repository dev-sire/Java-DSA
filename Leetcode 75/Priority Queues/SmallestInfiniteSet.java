import java.util.TreeSet;

public class SmallestInfiniteSet {
    public SmallestInfiniteSet() {}
    public int popSmallest() {
        if (added.isEmpty())
            return curr++;
        final int mn = added.first();
        added.remove(mn);
        return mn;
    }
    public void addBack(int num) {
        if (num < curr)
            added.add(num);
    }
    private int curr = 1;
    private TreeSet<Integer> added = new TreeSet<>();
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */