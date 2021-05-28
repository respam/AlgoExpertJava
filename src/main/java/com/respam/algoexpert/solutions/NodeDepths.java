package com.respam.algoexpert.solutions;

public class NodeDepths {
    public static int nodeDepths(BinaryTree root) {
        NodeDepths nd = new NodeDepths();
        int depthSum = nd.calculateDepth(root, 0, 0);
        return depthSum;
    }

    private int calculateDepth(BinaryTree node, int level, int depth) {

        depth = depth + level;

        if(node.left != null) {
            depth = calculateDepth(node.left, level+1, depth);
        }
        if(node.right != null) {
            depth = calculateDepth(node.right, level+1, depth);
        }

        return depth;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        BinaryTree node1 = new BinaryTree(1);
        node1.left = new BinaryTree(2);
        node1.right = new BinaryTree(3);
        node1.left.left = new BinaryTree(4);
        node1.left.right = new BinaryTree(5);
        node1.left.left.left = new BinaryTree(8);
        node1.left.left.right = new BinaryTree(9);
        node1.right.left = new BinaryTree(6);
        node1.right.right = new BinaryTree(7);

        int depth = nodeDepths(node1);
        System.out.println(depth);


    }

}
