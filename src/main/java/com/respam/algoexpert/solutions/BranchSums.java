package com.respam.algoexpert.solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<>();
        BranchSums bs = new BranchSums();
        sums = bs.calculateBranchSum(root, 0, sums);
        return sums;
    }

    public List<Integer> calculateBranchSum(BinaryTree node, int runningSum, List<Integer> sums) {
        int newRunningSum = node.value + runningSum;

        if(node.left == null && node.right == null) {
            sums.add(newRunningSum);
        }

        if(node.left != null) {
            calculateBranchSum(node.left, newRunningSum, sums);
        }

        if(node.right != null) {
            calculateBranchSum(node.right, newRunningSum, sums);
        }

        return sums;
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

        List<Integer> sumsList = new ArrayList<>();
        sumsList = branchSums(node1);

        Iterator alitr = sumsList.listIterator();
        while(alitr.hasNext()) {
            System.out.println(alitr.next());
        }
    }
}
