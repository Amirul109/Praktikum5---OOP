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
 public class  Programer extends Pegawai {
    double bonus;
    
    //Menggunakan Method setter
 public  Programer(String nama, double gajiPokok,double bonus){
        super(nama, gajiPokok);
        this.bonus = bonus;
    }
    //Menggunakan Method getter
    public double getBonus(){
        return this.bonus;
    }
    //Menampilkan
    public void cetakInfo(){
        System.out.println("Programer");
        super.cetakInfo();
        System.out.println("Bonus      : "+ getBonus() + "\n");
    }
    
}
  