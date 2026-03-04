package FC2.LinkedList;

import java.util.Scanner;

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
        String t = "" + data + "";
        return t;
    }
}

public class DanhSachLienKetDon {

    Scanner sc = new Scanner(System.in);
    Node head = null;

    void add(int x) {
        head = new Node(x, head);
    }

    void nhap() {
        int x;
        Node cuoi = null;
        head = null;
        while (true) {
            System.out.print("\n - Nhap X: ");
            x = sc.nextInt();
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
        System.out.print("\n -> Noi dung danh sach la:  \n===> ");
        Node p = head;
        while (p != null) {
            System.out.print(p + " -> ");
            p = p.next;
        }
        System.out.println(" Null \n");
    }

    void countOdd() {
        Node p = head;
        int count = 0;
        while (p != null) {
            if (p.data % 2 != 0) {
                count++;
            }
            p = p.next;
        }
        System.out.println("==> So not le trong danh sach la: " + count);
    }

    void sumEven() {
        int sum = 0;
        Node p = head;
        while (p != null) {
            if (p.data % 2 == 0) {
                sum += p.data;
            }
            p = p.next;
        }
        System.out.println("===> The Even sum of the list: " + sum);
    }

    void findMax() {
        int max = 0;
        Node p = head;
        while (p != null) {
            if (p.data > max) {
                max = p.data;
            }
            p = p.next;
        }
        System.out.println("===> Max of the list: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachLienKetDon L = new DanhSachLienKetDon();
        L.nhap();
        L.in();
        L.countOdd();
        L.sumEven();
        L.findMax();
        System.out.println("\n === XONG!!! === \n ");

    }
}
