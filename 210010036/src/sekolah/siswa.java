/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sekolah;

/**
 *
 * @author ASUS
 */
public class siswa {
    private int nis;
    private String namaSiswa;
    
    // Constructor
    public siswa(int nis, String namaSiswa) {
        this.nis = nis;
        this.namaSiswa = namaSiswa;
        
       
    }

    // Getter dan Setter
    public int getnis() {
        return nis;
    }

    public void setnamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

    

    // Method
    public void tampilkannamaSiswa() {
        System.out.println("nis : " + nis);
        System.out.println("namaSiswa : " + namaSiswa);
        
    }

}
