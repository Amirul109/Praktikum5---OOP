/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawaian;

/**
 *
 * @author Amir
 */
public class Pegawai {
    String nama;
    double gajiPokok;
    
    //menggunakan Method setter
    public Pegawai (String nama,double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    //Menggunakan Method getter
    public String getNama(){
        return this.nama;
    }
    public double getGajiPokok(){
        return this.gajiPokok;
    }
    //Menampilkan
    public void cetakInfo(){
        System.out.println("Nama       : "+getNama());
        System.out.println("Gaji Pokok : "+getGajiPokok());
    }
    
}
    
