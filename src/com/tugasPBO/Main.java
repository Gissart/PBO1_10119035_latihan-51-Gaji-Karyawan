package com.tugasPBO;
import java.util.Scanner;

/*Nama      : Argya Aulia Fauzandika
  NIM       : 10119035
  Kelas     : PBO1/ IF1
  Deskripsi : Program hitung gaji menerapkan inheritence parent class ke child
* */


public class Main { 
    public static void main(String[] args){
        Manager manajer = new Manager();
        Scanner scan = new Scanner(System.in);

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        manajer.setNik(scan.next());
        System.out.print("Masukkan Nama : ");
        manajer.setNama(scan.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manajer.setGolongan(scan.nextInt());
        System.out.print("Masukkan Jabatan (Manajer/Kabag) :");
        manajer.setJabatan(scan.next().toLowerCase());
        System.out.print("Masukkan jumlah kehadiran :");
        manajer.setKehadiran(scan.nextInt());
        System.out.println("\n ====Hasil Perhitungan====");
        System.out.println("NIK : "+manajer.getNik());
        System.out.println("Nama : "+manajer.getNama());
        System.out.println("Golongan : "+ manajer.getGolongan());
        System.out.println("Jabatan : "+manajer.getJabatan()+"\n");
        System.out.println("Tunjangan Golongan : "+manajer.tunjanganGolongan(manajer.getGolongan()));
        System.out.println("Tunjangan Jabatan : "+manajer.tunjanganJabatan(manajer.getJabatan()));
        System.out.println("Tunjangan Kehadiran : "+manajer.tunjanganKehadiran(manajer.getKehadiran())+"\n");
        System.out.println("Gaji Total : "+manajer.gajiTotal());




    }

}
