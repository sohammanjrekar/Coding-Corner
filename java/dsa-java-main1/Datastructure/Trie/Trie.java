package Trie;

class Node {
    Node[] links = new Node[26];
    boolean flag = false;

    boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    Node get(char ch) {
        return links[ch - 'a'];
    }

    void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }
}

public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new Node());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    public boolean search(String word) {
        Node node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startsWith(String prefix) {
        Node node = searchPrefix(prefix);
        return node != null;
    }

    private Node searchPrefix(String word) {
        Node node = root;
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

    public void printTrie() {
        printTrieHelper(root, new StringBuilder());
    }

    private void printTrieHelper(Node node, StringBuilder prefix) {
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
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("banana");
        trie.insert("band");
        trie.insert("bandana");

        System.out.println("Trie contains 'apple': " + trie.search("apple")); // true
        System.out.println("Trie contains 'app': " + trie.search("app"));     // true
        System.out.println("Trie contains 'banana': " + trie.search("banana")); // true
        System.out.println("Trie starts with 'ban': " + trie.startsWith("ban")); // true

        System.out.println("\nAll words in Trie:");
        trie.printTrie();
    }
}
