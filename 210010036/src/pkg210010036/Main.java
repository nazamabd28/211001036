/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg210010036;
import sekolah.guru;
import sekolah.jadwal;
import sekolah.kelas;
import sekolah.kelasSiswa;
import sekolah.mapel;
import sekolah.nilai;
import sekolah.siswa;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


       
        siswa Siswa = new siswa(1,"Hatmi");

        
        guru Guru = new guru(1,1,"Mikel");

        
        jadwal Jadwal = new jadwal(1, 100, 1);

        
        kelas Kelas = new kelas(1,"pbo",1);

        
        kelasSiswa kelassiswa = new kelasSiswa(1,1);

       
        mapel Mapel = new mapel(1,"pbo");

   
        nilai Nilai = new nilai(20,100,100,1,1);

       
        Siswa.tampilkannamaSiswa();
        Guru.tampilkannamaGuru();
        Jadwal.tampilkanjadwal();
        Kelas.tampilkannamaKelas();
        kelassiswa.tampilkankelasSiswa();
        Mapel.tampilkannamaMapel();
        Nilai.tampilkanInfonilai();
        
    }
}
   
    

