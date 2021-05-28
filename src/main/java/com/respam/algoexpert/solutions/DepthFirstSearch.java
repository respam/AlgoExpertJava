package com.respam.algoexpert.solutions;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            array.add(this.name);
            for (Node child : children) {
                child.depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

    public static void main(String[] args) {
        Node A = new Node("A");
        A.addChild("B");
        A.addChild("C");
        A.addChild("D");

        A.children.get(0).addChild("E");
        A.children.get(0).addChild("F");

        A.children.get(0).children.get(1).addChild("I");
        A.children.get(0).children.get(1).addChild("J");

        A.children.get(2).addChild("G");
        A.children.get(2).addChild("H");

        A.children.get(2).children.get(0).addChild("K");

        List<String> result = new ArrayList<>();
        result = A.depthFirstSearch(result);

        for (String each : result) {
            System.out.println(each);
        }

    }
}
