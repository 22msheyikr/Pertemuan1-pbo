/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author My Comp
 */
public class Nilai {
    String nim;
    String nama;
    double absen;
    double tugas;
    double uts;
    double uas;
    double na;
    
    Nilai (String nim, String nama, double absen, double tugas, double uts, double uas){
         this.nim=nim;
         this.nama=nama;
         this.absen=absen;
         this.tugas=tugas;
         this.uts=uts; 
         this.uas=uas;
         na=(absen*0.10)+(tugas*0.20)+(uts*0.30)+(uas*0.40);
    }
    
    void cetaknilai(){
        System.out.println("NIM: " +nim);
        System.out.println("Nama: " +nama);
        System.out.println("Nilai Absen: " +absen);
        System.out.println("Nilai Tugas: " +tugas);
        System.out.println("Nilai UTS: " +uts);
        System.out.println("Nilai UAS: " +uas);
        System.out.println("Nilai Akhir: " +na);
    }
}
