package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    public static class TrieNode {
        private final Map<Character, TrieNode> map = new HashMap<>();

        public boolean isEmpty() {
            return map.isEmpty();
        }

        public void insert(String[] strings) {
            //
        }
    }
}
