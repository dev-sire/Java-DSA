import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfWord;

    public TrieNode(){
        children = new HashMap<>();
        isEndOfWord = false;
    }
}

public class Trie {
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }
    public void insert(String word){
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            current.children.putIfAbsent(c, new TrieNode());
            current = current.children.get(c);       
        }
        current.isEndOfWord = true;
    }
    public boolean search(String word){
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if(!current.children.containsKey(c)){
                return false;
            }
            current = current.children.get(c); 
        }
        return current.isEndOfWord;
    }
}