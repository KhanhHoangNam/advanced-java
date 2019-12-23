package practise;

import java.util.Scanner;

public class Main {
    public static void enterArray(int[] M, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            M[i] = scanner.nextInt();
        }
    }

    public static void exportArray(int[] M, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(M[i] + "\t");
        }
    }
    public static int firstFunction(int[] M, int n) {
        int average = 0;
        for (int i = 0; i < n; i++)
            average += M[i];
        return average / n;
    }
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] M;
        M = new int[n];
        enterArray(M, n);
        System.out.println("\nMang sau khi nhap: ");
        exportArray(M, n);

        int result = firstFunction(M, n);
        System.out.println("Gia tri trung binh cua mang la: " + result);
    }
}
