package Praktikum;

import java.util.Scanner;

public class p3SoalDua {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double totalBarang, inputBerat, laptop, buku, kotak, smartphone;
    laptop = 850.56;
    buku = 250.11;
    kotak = 25.31;
    smartphone = 200.00;
    System.out.println("Masukkan jumlah barang");
    System.out.print("Banyak Laptop : ");
    inputBerat = input.nextInt();
    laptop *= inputBerat;
    System.out.print("Banyak Buku Tulis : ");
    inputBerat = input.nextInt();
    buku *= inputBerat;
    System.out.print("Banyak Kotak Pensil : ");
    inputBerat = input.nextInt();
    kotak *= inputBerat;
    System.out.print("Banyak Smartphone : ");
    inputBerat = input.nextInt();
    smartphone *= inputBerat;
    totalBarang = laptop + buku + kotak + smartphone;
    System.out.println("=====================");
    if (totalBarang > 2000) {
      System.out.println("Indeks berat barang : " + 5);
    } else if (totalBarang >= 1500 && totalBarang < 2000) {
      System.out.println("Indeks berat barang : " + 4);
    } else if (totalBarang >= 1000 && totalBarang < 1500) {
      System.out.println("Indeks berat barang : " + 3);
    } else if (totalBarang >= 500 && totalBarang < 1000) {
      System.out.println("Indeks berat barang : " + 2);
    } else if (totalBarang >= 0  && totalBarang < 500) {
      System.out.println("Indeks berat barang : " + 1);
    } else if (totalBarang == 0) {
      System.out.println("Indeks berat barang : " + 0);
    }
    if (totalBarang >= 0) {
      if (totalBarang > 2000) {
        System.out.println("Berat barang melebihi ketentuan");
      } else {
        System.out.println("Berat barang tidak melebihi ketentuan, aman...");
      }
    } else {
      System.out.println("ERROR - Tidak diperkenankan bilangan negatif!");
    }

    input.close();
  }
}
