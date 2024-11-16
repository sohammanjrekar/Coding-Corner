package Trie;

class Node1 {
    Node1[] links = new Node1[26];
    boolean flag = false;
    int prefixCount = 0; // To count the prefixes
    int endCount = 0; // To count the words ending at this node

    boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    Node1 get(char ch) {
        return links[ch - 'a'];
    }

    void put(char ch, Node1 node) {
        links[ch - 'a'] = node;
    }

    void setEnd() {
        flag = true;
        endCount++;
    }

    boolean isEnd() {
        return flag;
    }
    
    void increasePrefixCount() {
        prefixCount++;
    }

    void decreasePrefixCount() {
        prefixCount--;
    }

    int getPrefixCount() {
        return prefixCount;
    }

    int getEndCount() {
        return endCount;
    }

    void unsetEnd() {
        if (flag) {
            flag = false;
            endCount--;
        }
    }

    boolean erase(String word, int index) {
        if (index == word.length()) {
            if (flag) {
                unsetEnd();
                decreasePrefixCount();
                return prefixCount == 0;
            }
            return false;
        }

        char currentChar = word.charAt(index);
        Node1 nextNode = get(currentChar);
        if (nextNode == null || !nextNode.erase(word, index + 1)) {
            return false;
        }

        put(currentChar, null);
        decreasePrefixCount();
        return prefixCount == 0 && !flag;
    }
}

public class Trie2 {
    private Node1 root;

    public Trie2() {
        root = new Node1();
    }

    public void insert(String word) {
        Node1 node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new Node1());
            }
            node = node.get(currentChar);
            node.increasePrefixCount(); // Increase prefix count for each node
        }
        node.setEnd();
    }

    public boolean search(String word) {
        Node1 node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startsWith(String prefix) {
        Node1 node = searchPrefix(prefix);
        return node != null;
    }

    private Node1 searchPrefix(String word) {
        Node1 node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (node.containsKey(currentChar)) {
                node = node.get(currentChar);
            } else {
                return null;
            }
        }
        return node;
    }

    public int countPrefix(String prefix) {
        Node1 node = searchPrefix(prefix);
        return node != null ? node.getPrefixCount() : 0;
    }

    public int endWith(String suffix) {
        return endWithHelper(root, suffix, 0);
    }

    private int endWithHelper(Node1 node, String suffix, int index) {
        if (node == null) {
            return 0;
        }
        if (index == suffix.length()) {
            return node.getEndCount();
        }
        char currentChar = suffix.charAt(index);
        if (node.containsKey(currentChar)) {
            return endWithHelper(node.get(currentChar), suffix, index + 1);
        }
        return 0;
    }

    public boolean erase(String word) {
        return root.erase(word, 0);
    }

    public void printTrie() {
        printTrieHelper(root, new StringBuilder());
    }

    private void printTrieHelper(Node1 node, StringBuilder prefix) {
        if (node == null) {
            return;
        }
        if (node.isEnd()) {
            System.out.println(prefix.toString());
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (node.containsKey(ch)) {
                prefix.append(ch);
                printTrieHelper(node.get(ch), prefix);
                prefix.deleteCharAt(prefix.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Trie2 trie = new Trie2();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("banana");
        trie.insert("band");
        trie.insert("bandana");

        System.out.println("Trie contains 'apple': " + trie.search("apple")); // true
        System.out.println("Trie contains 'app': " + trie.search("app"));     // true
        System.out.println("Trie contains 'banana': " + trie.search("banana")); // true
        System.out.println("Trie starts with 'ban': " + trie.startsWith("ban")); // true

        System.out.println("Number of words starting with 'app': " + trie.countPrefix("app")); // 2
        System.out.println("Number of words ending with 'apple': " + trie.endWith("apple"));   // 1
        System.out.println("Number of words ending with 'app': " + trie.endWith("app"));   // 1
        System.out.println("Number of words ending with 'band': " + trie.endWith("band"));   // 1
        System.out.println("Number of words ending with 'banana': " + trie.endWith("banana"));   // 1

        System.out.println("\nAll words in Trie:");
        trie.printTrie();

        System.out.println("\nErasing 'app': " + trie.erase("app")); // true
        System.out.println("Trie contains 'app' after erasing: " + trie.search("app")); // false
        System.out.println("Number of words starting with 'app' after erasing: " + trie.countPrefix("app")); // 1
        System.out.println("Number of words ending with 'app' after erasing: " + trie.endWith("app")); // 0

        System.out.println("\nAll words in Trie after erasing 'app':");
        trie.printTrie();
    }
}
