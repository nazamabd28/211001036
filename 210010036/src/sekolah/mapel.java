/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author ASUS
 */
public class mapel {
    private int kdMapel;
    private String namaMapel;
    
    
    // Constructor
    public mapel(int kdMapel, String namaMapel) {
        this.kdMapel = kdMapel;
        this.namaMapel = namaMapel;
    }
    
     // Getter dan Setter
    public int kdMapel() {
        return kdMapel;
    }
        public void setkdMapel(int kdMapel) {
        this.kdMapel = kdMapel;
    }
        
       public String namaMapel() {
        return namaMapel;
    }
        public void setnamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }
        // Method
        public void tampilkannamaMapel() {
        System.out.println("kdMapel : " + kdMapel);
        System.out.println("namaMapel : " + namaMapel);
       
        
    }
}
