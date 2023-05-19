/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author ASUS
 */
public class kelasSiswa {
    private int nis;
    private int kdKelas; 

 // Constructor
    public kelasSiswa(int nis, int kdKelas) {
        this.nis = nis;
        this.kdKelas = kdKelas;

    }
    // Getter dan Setter
    public int getnis() {
        return nis;
    }
    public void setnip(int nis) {
        this.nis = nis;
    }
    
    public int getkdKelas() {
        return kdKelas;
    }
    public void setkdKelas(int kdKelas) {
        this.kdKelas = kdKelas;
    }
    
  

// Method
    public void tampilkankelasSiswa() {
        System.out.println(" : nis" + nis);
        System.out.println("kdKelas : " + kdKelas);
    }
}


    

