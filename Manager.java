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
 public class Manager extends Pegawai {
    double tunjangan;
    
    //Menggunakan Method setter
    public  Manager(String nama,double gajiPokok,double tunjangan){
        super(nama,gajiPokok);
        this.tunjangan = tunjangan;
    }
    //Menggunakan Method getter
    public double getTunjangan(){
        return this.tunjangan;
    }
    //Menampilkan
    public void cetakInfo(){
        System.out.println("Manager");
        super.cetakInfo();
        System.out.println("Tunjangan : "+ getTunjangan() + "\n");
    }
    
}   

