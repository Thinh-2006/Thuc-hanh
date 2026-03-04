package FC2.DLinkedList;

import java.util.*;

class DNode {

    int data;
    DNode prev, next;

    DNode(int x) {
        data = x;
    }

    DNode(int x, DNode t, DNode s) {
        data = x;
        next = s;
        prev = t;
        if (t != null) {
            t.next = this;
        }
        if (s != null) {
            s.prev = this;
        }
    }

    public String toString() {
        String t = " " + data + " <-> ";
        return t;
    }
}

public class MyDLL {

    DNode head = null, tail = null;

    void nhap() {
        int x;
        Scanner s = new Scanner(System.in);
        head = tail = null;
        while (true) {
            System.out.print("- Nhap so x: ");
            x = s.nextInt();
            if (x == 0) {
                break;
            }
            DNode t = new DNode(x);
            if (head == null) {
                head = tail = t;
            } else {
                tail.next = t;
                t.prev = tail;
                tail = t;
            }
        }
    }

    void in() {
        System.out.print("-> Noi dung danh sach: ");
        DNode p = head;
        while (p != null) {
            System.out.print(p);
            p = p.next;
        }
        System.out.println("");
    }

    void dem() {
        int dem = 0;
        DNode p = head;
        while (p != null) {
            if (p.data % 2 != 0) {
                dem++;

            }
            p = p.next;
        }
        System.out.println("-> So not le trong danh sach la: " + dem);
    }

    void tong() {
        int tong = 0;
        DNode p = head;
        while (p != null) {
            tong += p.data;
            p = p.next;
        }
        System.out.println("-> Tong cac not trong danh sach la: " + tong);
    }

    void timx(int x) {
        DNode p = tail;
        while (p != null && p.data != x) {
            p = p.prev;
        }
        if (p == null) {
            System.out.println("-> Danh sach khong co gia tri");
        }
        if (p.prev == null) {
            System.out.println("-> Danh sach khong co not dung truoc " + x);
        } else {
            System.out.println("-> Not dung truoc " + x + " la: " + p.prev.data);
        }
    }

    void xoad() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void xoac() {
        if (tail == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void xoak(int k) {
        if (head == null && k <= 0) {
            return;
        }
        if (k == 1) {
            xoad();
            return;
        }
        DNode p = head;
        int i = 1;
        while (p != null && i < k) {
            p = p.next;
            i++;
        }
        if (p == null) {
            return;
        }
        if (p == tail) {
            xoac();
            return;
        }

        p.prev.next = p.next;
        p.next.prev = p.prev;
    }

    public static void main(String[] args) {
        MyDLL m = new MyDLL();
        m.nhap();
        m.in();
        m.dem();
        m.tong();
        System.out.println("XONG !!!");
    }

}
