package com.respam.algoexpert.solutions;

public class BSTConstruction {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if(value < this.value){
                if(this.left == null){
                    this.left = new BST(value);
                } else{
                    this.left.insert(value);
                }
            }

            if(value >= this.value){
                if(this.right == null){
                    this.right = new BST(value);
                } else{
                    this.right.insert(value);
                }
            }

            return this;
        }

        public boolean contains(int value) {
            BST currentNode = this;
            while(currentNode != null) {
                if(value < currentNode.value) {
                    currentNode = currentNode.left;
                } else if(value > currentNode.value) {
                    currentNode = currentNode.right;
                } else {
                    return true;
                }
            }
            return false;
        }

        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        public void remove(int value, BST parentNode) {
            BST currentNode = this;
            while(currentNode != null){
                if(value < currentNode.value){
                    parentNode = currentNode;
                    currentNode = currentNode.left;
                } else if (value > currentNode.value){
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                } else {
                    if(currentNode.left != null && currentNode.right != null){
                        currentNode.value = currentNode.right.getMinValue();
                        // currentNode.value = smallest value of right subtree
                        currentNode.right.remove(currentNode.value, currentNode);
                    } else if(parentNode == null) {
                        if(currentNode.left != null) {
                            currentNode.value = currentNode.left.value;
                            currentNode.right = currentNode.left.right;
                            currentNode.left = currentNode.left.left;
                        } else if(currentNode.right != null) {
                            currentNode.value = currentNode.right.value;
                            currentNode.left = currentNode.right.left;
                            currentNode.right = currentNode.right.right;
                        } else {
                            currentNode = null;
                        }
                    } else if(parentNode.left == currentNode){
                        if(currentNode.left != null){
                            parentNode.left = currentNode.left;
                        } else {
                            parentNode.left= currentNode.right;
                        }
                    } else if(parentNode.right == currentNode){
                        if(currentNode.left != null){
                            parentNode.right = currentNode.left;
                        } else {
                            parentNode.right = currentNode.right;
                        }
                    }
                    break;
                }
            }
        }

        private int getMinValue() {
            if(left == null){
                return value;
            } else {
                return left.getMinValue();
            }
        }
    }

    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(5);
        bst.insert(13);
        bst.insert(22);
        bst.insert(1);
        bst.insert(14);
        bst.contains(22);
        bst.contains(9);
        bst.remove(22);

    }
}
