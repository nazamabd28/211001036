/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author ASUS
 */
public class guru {
    private int nip;
    private int kdMapel;
    private String namaGuru;
    
    // Constructor
    public guru(int nip, int kdMapel, String namaGuru) {
        this.nip = nip;
        this.kdMapel = kdMapel;
        this.namaGuru= namaGuru;
          
    }
    // Getter dan Setter
    public int getnip() {
        return nip;
    }

    public void setnip(int nip) {
        this.nip = nip;
    }

    public int getkdMapel() {
        return kdMapel;
    }
     public void setkdMapel(int kdMapel) {
        this.kdMapel = kdMapel;
    }

    public void setnamaGuru(String namaGuru) {
        this.namaGuru = namaGuru;
    }
    public String namaGuru() {
        return namaGuru;
    }
   
    // Method
    public void tampilkannamaGuru() {
        System.out.println("nip : " + nip);
        System.out.println("kdMapel : " + kdMapel);
        System.out.println("namaGuru : " + namaGuru);
        
    }
}
