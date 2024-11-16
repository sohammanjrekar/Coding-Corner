package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import String.sort_string;

public class binaryt {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node buildtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            if (currNode == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
    }

    static int countofnodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = countofnodes(root.left);
        int rightnodes = countofnodes(root.right);
        return leftnodes + rightnodes + 1;
    }

    static int sumofnodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = sumofnodes(root.left);
        int rightnodes = sumofnodes(root.right);

        return leftnodes + rightnodes + root.data;
    }

    static int hightoftree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnodes = hightoftree(root.left);
        int rightnodes = hightoftree(root.right);
        int mytree = Math.max(leftnodes, rightnodes) + 1;
        return mytree;
    }

    /* Diameter of tree : Number of nodes in longest path betwee any two nodes */
    static int diameteroftree(Node root) {
        if (root == null) {
            return 0;
        } // time complexity:o(n2)
        int leftnodes = diameteroftree(root.left);
        int rightnodes = diameteroftree(root.right);
        int diameterroot = hightoftree(root.left) + hightoftree(root.right) + 1;
        int mytree = Math.max(diameterroot, Math.max(leftnodes, rightnodes));
        return mytree;
    }

    public static Treeinfo diameteroftree2(Node root) {
        if (root == null) {
            return new Treeinfo(0, 0);
        } // time complexity:o(n)

        Treeinfo left = diameteroftree2(root.left);
        Treeinfo right = diameteroftree2(root.right);
        int myheight = Math.max(left.height, right.height) + 1;

        int diameter1 = left.diameter;
        int diameter2 = right.diameter;
        int diameter3 = left.height + right.height + 1;
        int mydiameter = Math.max(Math.max(diameter1, diameter3), diameter2);
        Treeinfo myinfo = new Treeinfo(myheight, mydiameter);
        return myinfo;
    }

    public static class Treeinfo {
        int height;
        int diameter;

        Treeinfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println();
        System.out.println("Counts of node:  " + countofnodes(root));
        System.out.println("Sums of node:  " + sumofnodes(root));
        System.out.println("height of tree:  " + hightoftree(root));
        System.out.println("diameter of tree:  " + diameteroftree2(root).diameter + "  " + diameteroftree2(root).height);
    }
}
