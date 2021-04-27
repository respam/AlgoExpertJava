package com.respam.algoexpert.solutions;

public class FindClosestValueInBSTRecursive {


    public static int findClosestValueInBstRecursive(BST tree, int target) {

        return findClosestValueInBSTRecursiveHelper(tree, target, tree.value);
    }

    public static int findClosestValueInBSTRecursiveHelper(BST tree, int target, int closest) {
        if(tree == null) {
            return closest;
        }
        if(Math.abs(target - closest) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }
        if(target > tree.value) {
            return findClosestValueInBSTRecursiveHelper(tree.right, target, closest);
        }
        if(target < tree.value) {
            return findClosestValueInBSTRecursiveHelper(tree.left, target, closest);
        }

        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BST node1 = new BST(10);
        node1.left = new BST(5);
        node1.right = new BST(15);
        node1.left.left = new BST(2);
        node1.left.right = new BST(5);
        node1.left.left.left = new BST(1);
        node1.right.left = new BST(13);
        node1.right.right = new BST(22);
        node1.right.left.right = new BST(14);

        int nearest = findClosestValueInBstRecursive(node1, 12);
        System.out.println(nearest);


    }
}
