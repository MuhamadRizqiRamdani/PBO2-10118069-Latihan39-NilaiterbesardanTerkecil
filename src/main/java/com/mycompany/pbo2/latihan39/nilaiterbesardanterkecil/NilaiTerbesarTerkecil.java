/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author asus
 * Nama     : Muhamad Rizqi Ramdani
 * Kelas    : PBO2
 * Nim      : 10118069
 * Deskripsi Tugas : Nilai Terkecil dan Terbesar
 */
public class NilaiTerbesarTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NilaiMahasiswa nilaimahasiswa = new NilaiMahasiswa();
        Petugas petugas = new Petugas();
        
        System.out.println("===== Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa =====");
  
        // input petugas
        System.out.print("Masukkan Nama Petugas : ");
        petugas.setNama(scanner.nextLine());
        
        // input banyak mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nilaimahasiswa.setJumlahMahasiswa(scanner.nextInt());
        
        // input nilai per mahasiswa
        for(int i = 0; i < nilaimahasiswa.getJumlahMahasiswa(); i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            nilaimahasiswa.setNilai(scanner.nextInt());
        }
        
        nilaimahasiswa.tampilNilai();
        System.out.println("\nPetugas : " + petugas.getNama());
    }
}
