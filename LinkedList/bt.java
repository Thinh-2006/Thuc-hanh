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

public class bt {

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
        int tong = 0;
        while (p != null) {
            if (p.data % 2 == 0) {
                tong++;
            }
            p = p.next;
        }
        System.out.println("==> Tong so le trong danh sach la: " + tong);
    }

   void printfEnd() {
        Node p = head;
        if (head == null || head.next == null) {
            System.out.println("KHONG CO PHAN TU KE CUOI");
        }
        while (p != null) {
            if (p.next.next != null) {
                p = p.next;
                break;
            }
            System.out.println("PHAN TU KE CUOI LA" + p.data);
        }

    }

    void dao() {
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

    void sapxep() {
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
    void chendau (int x){
        head = new Node (x,head);
    }
    void chencuoi (int x){
        Node t = new Node (x);
        if (head == null)
        {
            head = t;
        }   
        Node p = head;
        while (p.next!=null){
            p=p.next;
        }
        p.next = t;
    }
    void chenk(int x,int k){
        if (k<1)System.out.println("KHONG CHEN DUOC");
        else{
            if (k==1){
                head = new Node (x,head);
            }else{
                Node p = head;
                int vt=1;}
                while (p!=null && vt <k-1){
                    p = p.next;vt++;
                }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        bt m = new bt();
        m.nhap();
        m.in();
        m.printfEnd();

        m.countOdd();
        m.sapxep();
        m.in();
        m.dao();
        m.in();
        m.chendau(100);
        m.chencuoi(33);
        m.in();
        System.out.println("XONG !!!");
    }
}
