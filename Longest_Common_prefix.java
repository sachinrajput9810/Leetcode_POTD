 //TRIE QUESTION

public class Longest_Common_prefix {


    public class TrieNode {
        TrieNode[] children;
        boolean wordEnd;

        public TrieNode() {
            children = new TrieNode[10];
            wordEnd = false;
        }
    }

    private TrieNode root;

    public Longest_Common_prefix() {
        root = new TrieNode();
    }

    public void insert(int[] arr) {
        for (int val : arr) {
            TrieNode curr = root;
            String str = val + "";
            for (char ch : str.toCharArray()) {
                int idx = ch - '0';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new TrieNode();
                }
                curr = curr.children[idx];
            }
        }
        
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        insert(arr1);
        int max = 0;
        for (int val : arr2) {
            TrieNode curr = root;
            String str = val + "";
            int len = 0;
            for (char ch : str.toCharArray()) {
                int idx = ch - '0';
                if (curr.children[idx] == null ) {
                    break;
                }
                len++;
                curr = curr.children[idx];
            }
            max = Math.max(max, len);
        }
        return max;
    }
}
