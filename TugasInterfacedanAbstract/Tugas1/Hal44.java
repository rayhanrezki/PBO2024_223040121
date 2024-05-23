package Tugas1;

import Tugas1.Hal44.Penjumlahan;

public class Hal44 {

    /*
     * 
     * @author ade sukendar
     * @version 1.0
     * @since 27-01-2020
     * ini adalah contoh program penjumlahan dua bilangan
     * dengan menggunakan komentar program
     * 
     */

    public static void main(String[] args) {
        Penjumlahan penjumlahan = new Penjumlahan();
        penjumlahan.jumlahkan();
    }

    static class Penjumlahan {
        public void jumlahkan() {
            int a = 4;
            int b = 3;
            int c = a + b;

            System.out.println("Hasil Penjumlahan : " + c);
        }
    }
}