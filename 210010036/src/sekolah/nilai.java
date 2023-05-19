/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author ASUS
 */
public class nilai {
    private int nis;
    private int uts;
    private int uas;
    private int kdKelas;
    private int kdMapel;
    

    // Constructor
    public nilai(int nis, int uts, int uas, int kdKelas, int kdMapel) {
        this.nis = nis;
        this.uts = uts;
        this.uas = uas;
        this.kdKelas = kdKelas;
        this.kdMapel = kdMapel;
    }

    // Getter dan Setter
    public int getnis() {
        return nis;
    }

    public void setnis(int nis) {
        this.nis = nis;
    }
    

    public int  getuts() {
        return uts;
    }

    public void setuts(int uts) {
        this.uts = uts;
    }

    
    public int getuas() {
        return uas;
    }

    public void setuas(int uas) {
        this.uas = uas;
    }

    public int getkdKelas(int kdKelas) {
        return kdKelas;
    }

    public void setkdKelas(int kdKelas) {
        this.kdKelas = kdKelas;
    }

    
    public int getkdMapel(int kdMapel) {
        return kdMapel;
    }

    public void setkdMapel(int kdMapel) {
        this.kdMapel = kdMapel;
    }
    
    
    // Method
    public void tampilkanInfonilai() {
        System.out.println("nis : " + nis);
        System.out.println("uts : " + uts);
        System.out.println("uas : " + uas);
        System.out.println("kdKelas : " + kdKelas);
        System.out.println("kdMapel : " + kdMapel);
    }
}

    
