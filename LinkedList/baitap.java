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

public class baitap {

    Scanner sc = new Scanner(System.in);
    Node head = null;

    void nhap() {
        head = null;
        Node cuoi = null;
        Random rd = new Random();
        int x;
        int dem = 20;
        int i = 1;
        while (i <= dem) {
            x = rd.nextInt(10);
            Node t = new Node(x);
            if (head == null) {
                head = cuoi = t;
            } else {
                cuoi.next = t;
                cuoi = t;
            }
            i++;
        }
    }

    void in() {
        System.out.print("\n -> Noi dung danh sach la:  \n===> ");
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println(" Null \n");
    }

    void tongLe() {
        Node p = head;
        int tong = 0;
        while (p != null) {
            if (p.data % 2 == 0) {
                tong += p.data;
            }
            p = p.next;
        }
        System.out.println("==> Tong so le trong danh sach la: " + tong);
    }

    void xoaKeCuoi() {
        if (head == null || head.next == null) {
            return;
        }
        if (head.next.next == null) {
            head = head.next;
            return;
        }
        Node p = head;
        while (p.next.next.next != null) {
            p = p.next;
        }
        p.next = p.next.next;
    }

    void demTangDan() {
        if (head == null) {
            return;
        }
        int dem = 1;
        Node p = head;

        while (p.next != null) {
            if (p.next.data <= p.data) {
                dem++;
            }
            p = p.next;
        }
        System.out.println("So doan tang dan: " + dem);
    }

    void xoaLe() {
        while (head != null && head.data % 2 != 0) {
            head = head.next;
        }
        Node p = head;

        while (p != null && p.next != null) {
            if (p.next.data % 2 != 0) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
    }

    void sapXepTang() {
        Node p = head;
        while (p != null) {
            Node q = p.next;
            while (q != null) {
                if (p.data > q.data) {
                    int t = p.data;
                    p.data = q.data;
                    q.data = t;
                }
                q = q.next;
            }
            p = p.next;
        }
    }

    void daoDanhSach() {
        Node t = null;
        Node p = head;
        while (p != null) {
            Node q = p.next;
            p.next = t;
            t = p;
            p = q;
        }
        head = t;
    }

    public static void main(String[] args) {
        baitap m = new baitap();
        m.nhap();
        m.in();
        m.tongLe();
        m.xoaKeCuoi();
        System.out.println("----- SAU KHI XOA KE CUOI -----");
        m.in();
        m.demTangDan();
        m.xoaLe();
        System.out.println("----- SAU KHI XOA CAC SO LE -----");
        m.in();
        m.sapXepTang();
        System.out.println("----- SAU KHI SAP XEP TANG DAN -----");
        m.in();
        m.daoDanhSach();
        System.out.println("-----SAU KHI DAO DANH SACH -----");
        m.in();
    }
}
