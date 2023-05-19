/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author ASUS
 */
public class kelas {
    private int kdKelas;
    private String namaKelas;
    private int nip;

    // Constructor
    public kelas(int kdKelas, String namaKelas, int nip) {
        this.kdKelas = kdKelas;
        this.namaKelas = namaKelas;
        this.nip = nip;
    }
    // Getter dan Setter
    public int kdKelas() {
        return kdKelas;
    }
    
    public void kdKelas(int kdKelas) {
        this.kdKelas = kdKelas;
    }
    
    
    public String namaKelas() {
        return namaKelas;
    }
    
    public void namaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    // Method
    public void tampilkannamaKelas() {
        System.out.println("kdKelas : " + kdKelas);
        System.out.println("namaKelas : " + namaKelas);
        
    }
}

