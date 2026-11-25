package ru.otus.java.homework;

import java.util.ArrayList;
import java.util.List;

public class MyTree implements SearchTree<Integer> {
    private ArrayList<Integer> nums = new ArrayList<>();
    private Node root = null;

    MyTree(){}

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public int getValue() {
            return value;
        }
    }

    public void addNode(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            while (true) {
                if (currentNode.getValue() <= newNode.getValue()) {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(newNode);
                        return;
                    } else {currentNode = currentNode.getLeft();}
                } else {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(newNode);
                        return;
                    } else {currentNode = currentNode.getRight();}
                }
            }
        }
    }

    public void makeTree() {
        ArrayList<Integer> temp = nums;
        int numOfNode;
        Node addedNode;
        while (!(temp.isEmpty())) {
            numOfNode = (int) (Math.random() * temp.size());
            addedNode = new Node(temp.get(numOfNode));
            this.addNode(addedNode);
            temp.remove(numOfNode);
        }
    }

    @Override
    public Integer find(Integer n) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getValue() < n) {
                currentNode = currentNode.getLeft();
            } else if (currentNode.getValue() > n){
                currentNode = currentNode.getRight();
            } else {
                System.out.println("Число найдено");
                return currentNode.getValue();
            }
        }
        System.out.println("Число не найдено");
        return -n;
    }

    //Functions for making list
    //Randomizes the list
    public void randomNums() {
        int count = (int) (Math.random() * 10) + 5;
        for(int i = 0; i < count; i++) {
            nums.add((int) (Math.random() * 200 - 100));
        }
    }

    //Sorts the list
    @Override
    public List<Integer> getSortedList() {
        int theMin = 99999999;
        int indexMin = 0;
        int numSwitch;
        for(int i = 0; i < nums.size() - 1; i++) {
            for(int k = i; k < nums.size(); k++) {
                if(theMin >= nums.get(k)) {
                    theMin = nums.get(k);
                    indexMin = k;
                }
            }
            numSwitch = nums.get(i);
            nums.set(i, theMin);
            nums.set(indexMin, numSwitch);
            theMin = 99999999;
        }
        return nums;
    }

    //Prints list
    public void printList() {
        for (int num: nums) {
            System.out.print(num + ", ");
        }
        System.out.print("\n");
    }
}