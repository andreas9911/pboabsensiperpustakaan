package com.company;

class Absensi{
    String nama;
    int npm;
    int lamaPeminjaman; //hari
    String statusPeminjaman;
    String email;
    Buku namaBuku;

    //Constructor
    Absensi(String nama, int npm, String email, String statusPeminjaman){
        this.nama = nama;
        this.npm = npm;
        this.email = email;
        this.statusPeminjaman = statusPeminjaman;
    }

    //method
    void pinjamBuku(Buku namaBuku, int lamaPeminjaman){
        this.namaBuku = namaBuku;
        this.lamaPeminjaman = lamaPeminjaman;
        this.statusPeminjaman = "Meminjam Buku";
        System.out.println(nama+" meminjam buku");
        namaBuku.peminjamanBuku();
        System.out.println();
    }

    //method
    void detailAbsensi(){
        System.out.println("Detail Absensi");
        System.out.println("Nama  : "+nama);
        System.out.println("NPM   : "+npm);
        System.out.println("Email : "+email);
        System.out.println("Status: "+statusPeminjaman);
        System.out.println();
    }

    //method
    void detailPeminjaman(){
        System.out.println("Detail Peminjaman");
        System.out.println("Nama : "+nama);
        namaBuku.peminjamanBuku();
        System.out.println("Waktu Peminjaman : "+lamaPeminjaman+" hari");
        System.out.println();
    }

    //method
    void pengembaliaanBuku(Buku namaBuku){
        this.namaBuku = namaBuku;
        this.statusPeminjaman = "Tidak Meminjam Buku";
        System.out.println(nama+" mengembalikan buku");
        namaBuku.peminjamanBuku();
        System.out.println();
    }
}

class Buku{
    String namaBuku;
    int idBuku;
    int totalPeminjaman;
    String statusBuku;

    //Constructor
    Buku(String namaBuku, int idBuku, int totalPeminjaman){
        this.namaBuku = namaBuku;
        this.idBuku = idBuku;
        this.totalPeminjaman = totalPeminjaman;
    }

    //method
    void peminjamanBuku(){
        System.out.println("Buku : "+namaBuku);
    }
    //method
    void detailBuku(){
        System.out.println("Detail Buku");
        System.out.println("Buku : "+namaBuku);
        System.out.println("ID   : "+idBuku);
        System.out.println("Total Peminjaman : "+totalPeminjaman+" kali");
        System.out.println();
    }

}

public class Main {

    public static void main(String[] args) {
        System.out.println("Absensi Perpustakaan");
        System.out.println();

        //input
        Absensi bejo = new Absensi("Bejo Andronikus",666, "bejoandro@gmail.com", "Meminjam Buku");
        Absensi andi = new Absensi("Andi Parahiyangan", 667, "andibaikbaiksaja@gmail.com", "Meminjam Buku");
        Absensi anton = new Absensi("Brader Anton", 668, "antonyaudalahya@gmail.com", "Meminjam Buku");
        Buku naruto = new Buku("Naruto Vol 45", 1001, 99);
        Buku bleach = new Buku("Bleach Vol 76", 2001, 150);
        Buku ipamudah = new Buku("IPA Mudah Edisi 2022", 3001, 5);
        Buku mudahcplusplus = new Buku("Mudah C++ Edisi 2022", 3002, 59);

        //olahdata
        bejo.pinjamBuku(bleach, 2);
        andi.pinjamBuku(ipamudah, 21);
        anton.pinjamBuku(mudahcplusplus, 10);
        bleach.detailBuku();
        ipamudah.detailBuku();
        mudahcplusplus.detailBuku();
        bejo.detailAbsensi();
        anton.detailAbsensi();
        anton.pengembaliaanBuku(mudahcplusplus);
        bejo.pengembaliaanBuku(bleach);
        andi.detailPeminjaman();
        anton.detailAbsensi();
    }
}
