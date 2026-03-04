package FC2.Bai1;

import java.util.*;

public class bt {

    static boolean checkTang(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) {
                return false; // 
            }
        }
        return true;
    }

    static int chanDong(int[] a) {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[i + 1]) {
                dem++;
            }
            while (i < a.length - 1 && a[i] < a[i + 1]) {
                i++;
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("- Nhap so luong phan tu cua mang: ");
        n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("+ Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = s.nextInt();
        }
        if (checkTang(a)) {
            System.out.println("-> Mang tang dan");
        } else {
            System.out.println("-> Mang khong tang dan");
        }
        int kq = chanDong (a);
        System.out.println("-> So lan chan dong la: " + kq);
    }
}
