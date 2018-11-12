package com.qiyu.boot.ztest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author qiyu
 * @date 2018/10/23
 */
public class Main {
    /**
     * 将一个arry数组构建成一个完全二叉树
     * @param arr 需要构建的数组
     * @return 二叉树的根节点
     */
    public Node initBinTree(int[] arr) {
        if(arr.length == 1) {
            return new Node(arr[0]);
        }
        List<Node> nodeList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            nodeList.add(new Node(arr[i]));
        }
        int temp = 0;
        while(temp <= (arr.length - 2) / 2) {  //注意这里，数组的下标是从零开始的
            if(2 * temp + 1 < arr.length) {
                nodeList.get(temp).leftchild = nodeList.get(2 * temp + 1);
            }
            if(2 * temp + 2 < arr.length) {
                nodeList.get(temp).rightchild = nodeList.get(2 * temp + 2);
            }
            temp++;
        }
        return nodeList.get(0);
    }

    /**
     * 层序遍历二叉树，，并分层打印
     * @param root 二叉树根节点
     *
     */
    public void trivalBinTree(Node root) {
        Queue<Node> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);
        Node temp = null;
        int currentLevel = 1;    //记录当前层需要打印的节点的数量
        int nextLevel = 0;//记录下一层需要打印的节点的数量
        while ((temp = nodeQueue.poll()) != null) {
            if (temp.leftchild != null) {
                nodeQueue.add(temp.leftchild);
                nextLevel++;

            }
            if (temp.rightchild != null) {
                nodeQueue.add(temp.rightchild);
                nextLevel++;
            }
            System.out.print(temp.data + " ");
            currentLevel--;
            if(currentLevel == 0) {
                System.out.println();
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
    }

    public int ceng(Node root) {
        int data = 0;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int num = 1; //当前需要打印的个数
        int nextNum = 0; //下一层要打印的个数
        Node tmp;
        while ( (tmp = queue.poll()) != null) {
            if (tmp.leftchild != null) {
                queue.add(tmp.leftchild);
                data = tmp.leftchild.data;
                nextNum++;
            }
            if (tmp.rightchild != null) {
                queue.add(tmp.rightchild);
                data = tmp.rightchild.data;
                nextNum++;
            }
            num--;
            if (num == 0) {
                num = nextNum;
                nextNum = 0;
            }
        }
        return data;
    }


    /**
     * 先序遍历
     * @param root 二叉树根节点
     */
    public void preTrival(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preTrival(root.leftchild);
        preTrival(root.rightchild);
    }
    /**
     * 中序遍历
     * @param root 二叉树根节点
     */
    public void midTrival(Node root) {
        if(root == null) {
            return;
        }
        midTrival(root.leftchild);
        System.out.print(root.data + " ");
        midTrival(root.rightchild);
    }
    /**
     * 后序遍历
     * @param root 二叉树根节点
     */
    public void afterTrival(Node root) {
        if(root == null) {
            return;
        }
        afterTrival(root.leftchild);
        afterTrival(root.rightchild);
        System.out.print(root.data + " ");
    }


    public static void main(String[] args) {
        Main btree = new Main();
        int[] arr = new int[] {1,2,3,4,5,6,7};
        Node root = btree.initBinTree(arr);
        System.out.println("层序遍历(分层打印)：");
        btree.trivalBinTree(root);
        System.out.println("\n先序遍历：");
        btree.preTrival(root);
        System.out.println("\n中序遍历：");
        btree.midTrival(root);
        System.out.println("\n后序遍历：");
        btree.afterTrival(root);
        System.out.println("\n获取最后一个node：");
        int data = btree.ceng(root);
        System.out.println(data);

    }

}

class Node {
    public Node leftchild;
    public Node rightchild;
    public int data;

    public Node(int data) {
        this.data = data;
    }

}
