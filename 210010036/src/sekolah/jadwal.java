/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author ASUS
 */
public class jadwal {
    private int nip;
    private int kdKelas;
    private int kdMapel ; 

 // Constructor
    public jadwal(int nip, int kdKelas, int kdMapel) {
        this.nip = nip;
        this.kdKelas = kdKelas;
        this.kdMapel = kdMapel;
    }
    // Getter dan Setter
    public int getnip() {
        return nip;
    }
    public void setnip(int nip) {
        this.nip = nip;
    }
    
    public int getkdKelas() {
        return kdKelas;
    }
    public void setkdKelas(int kdKelas) {
        this.kdKelas = kdKelas;
    }
    
    public int getkdMpapel() {
        return kdMapel;
    }
    public void setkdMapel(int kdMapel) {
        this.kdMapel = kdMapel;
    }


// Method
    public void tampilkanjadwal() {
        System.out.println(" : nip" + nip);
        System.out.println("kdKelas : " + kdKelas);
        System.out.println("kdMapel : " + kdMapel);
    }
}


