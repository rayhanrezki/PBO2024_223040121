package Tugas2;

import java.util.Scanner;

public class TotalBilangan {
//Latihan 4
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
        } else {
            int total = 0;
            for (int i = 0; i < N; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                int bilangan = scanner.nextInt();
                total += bilangan;
            }
            System.out.println("Total: " + total);
        }

        scanner.close();
    }
	
}
