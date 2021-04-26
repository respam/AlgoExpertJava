package com.respam.algoexpert.solutions;

public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        int difference = Math.abs(target - tree.value);
        int currentClosest = tree.value;
        BST selectedNode = tree;

        while(selectedNode != null) {
            if(target == selectedNode.value) {
                return selectedNode.value;
            } else if(target > selectedNode.value) {
                selectedNode = selectedNode.right;
                if (selectedNode != null && Math.abs(target - selectedNode.value) < difference) {
                    difference = Math.abs(target - selectedNode.value);
                    currentClosest = selectedNode.value;
                }
            } else if(target < selectedNode.value){
                selectedNode = selectedNode.left;
                if (selectedNode != null && Math.abs(target - selectedNode.value) < difference) {
                    difference = Math.abs(target - selectedNode.value);
                    currentClosest = selectedNode.value;
                }
            }
        }

        return currentClosest;
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

        int nearest = findClosestValueInBst(node1, 12);
        System.out.println(nearest);


    }
}
