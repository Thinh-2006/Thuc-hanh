package FC2.Bai1;

import java.util.*;

public class array {

    int[] a;

    void sinh(int n) {
        Random rd = new Random();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(1, 100);
        }
    }

    void in(String t) {
        System.out.print(t);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            System.out.print("aloo");
        }
    }

    void dao() {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }

        a = b;
    }

    void sapxep() {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    int timx(int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        array m = new array();
        m.sinh(10);
        m.in("-> Noi dung mang: ");
        m.dao();
        m.in("\n-> Mang sau khi dao: ");
        m.sapxep();
        m.in("\n-> Mang sau khi sap xep: ");
        int x = 5;
        if (m.timx(x)>=0) {
            System.out.println("\n-> Co " + x + " trong mang.");
        } else {
            System.out.println("\n-> Khong co " + x + " trong mang.");
        }
        System.out.println("\n XONG !!!");
    }

}
