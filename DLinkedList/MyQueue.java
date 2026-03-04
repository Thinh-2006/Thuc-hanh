package FC2.DLinkedList;

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

    /*public String toString() {
        String t = " " + data + " -> ";
        return t;
    }*/
}

public class MyQueue {

    Node head, tail;

    MyQueue() {
        head = tail = null;
    }

    boolean Empty() {
        return head == null;
    }

    void nhap() {
        /* Node t = new Node(x);
        if (head == null) {
            head = tail = t;
        } else {
            tail.next = t;
            tail = t;
        }*/
        Scanner s = new Scanner(System.in);
        int x;
        Node cuoi = null;
        head = null;
        while (true) {
            System.out.print("- Nhap X: ");
            x = s.nextInt();
            if (x == 0) {
                break;
            }
            Node t = new Node(x);
            if (head == null) {
                head = cuoi = t;

            } else {
                cuoi.next = t;
                cuoi = t;
            }
        }
    }

    void in() {
        System.out.println("\n Noi dung danh sach: ==>> ");
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
       
    }

    int remove() {
        int x = 0;
        if (head == null) {
            System.out.println("Hang doi rong");
        } else {
            x = head.data;
            if (head.next == null) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }
        return x;
    }
     int tinhTong() {
        int sum = 0;
        for (Node p = head; p != null; p = p.next)
            sum += p.data;
        return sum;
    }
    int demSoLe() {
        int dem = 0;
        for (Node p = head; p != null; p = p.next)
            if (p.data % 2 != 0)
                dem++;
        return dem;
    }
      int maxQueue() {
        if (head == null)
            return -1;

        int max = head.data;
        for (Node p = head.next; p != null; p = p.next)
            if (p.data > max)
                max = p.data;
        return max;
    }
    public static void main(String[] args) {
        MyQueue Q = new MyQueue();
        /* Q.add(3);
        Q.add(2);
        Q.add(7);
        Q.add(6);
        Q.add(9);
        Q.add(8);
        while (!Q.Empty()) {
            int x = Q.remove();
            System.out.println(x + " ");
        }*/
        Q.nhap();
        Q.in();
        System.out.println("\nXONG !!!");
    }
}
