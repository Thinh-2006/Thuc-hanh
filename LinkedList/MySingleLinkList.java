package FC2.LinkedList;

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

    Node(int x, Node t) {
        data = x;
        next = t;
    }

    public String toString() {
        String t = " " + data + " -> ";
        return t;
    }
}

public class MySingleLinkList {

    Node head = null;

    void add(int x) {
        head = new Node(x, head);
    }

    void in() {
        System.out.println("\n Noi dung danh sach: \n ==>> ");
        Node p = head;
        while (p != null) {
            System.out.println(p);
            p = p.next;
        }
        System.out.println("null \n");
    }

    int dem() {
        int k = 0;
        Node p = head;
        while (p != null) {
            k++;
            p = p.next;

        }
        return k;
    }

    int demle() {
        int k = 0;
        Node p = head;
        while (p != null) {
            if (p.data % 2 != 0) {
                k++;
            }
            p = p.next;
        }
        return k;
    }

    int max() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        int m = head.data;
        Node p = head.next;
        while (p != null) {
            if (p.data > m) {
                m = p.data;
            }
            p = p.next;
        }
        return m;
    }

    boolean timx(int x) {
        Node p = head;
        while (p != null) {
            if (p.data == x) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    int tong() {
        int tong = 0;
        Node p = head;
        while (p != null) {

            tong += p.data;
            p = p.next;

        }
        return tong;
    }

    public static void main(String[] args) {
        MySingleLinkList l = new MySingleLinkList();
        l.add(3);
        l.add(2);
        l.add(7);
        l.add(6);
        l.add(5);
        l.add(9);
        l.in();
        System.out.println("\n XONG !!!");
    }
}
