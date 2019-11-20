/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.kambingg;

/**
 *
 * @author acer
 * Nama : Tanti Nurharomah 
 * Kelas : TI-B
 * NIM : A2.1900178
 * Deskripsi program : Program ini berisi tentang menampilkan tentang kambing
 */
public class Latihan4Kambingg {
    
    public void tambahKambing(){
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan4Kambingg  kambingJantan = new Latihan4Kambingg();
        kambingJantan.tambahKambing();
    }
    
}
