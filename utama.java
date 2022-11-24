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
  public class utama {
  public static void main(String[]args) {
      Manager amir    = new Manager  ("Amir",5_000_000 ,9_000_000);
      Programer surya = new Programer("Surya",7_000_000,3_000_000);
      
      //Set Pegawai
      amir.cetakInfo();
      surya.cetakInfo();
  }
}  
