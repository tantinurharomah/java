/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

/**
 *
 * @author acer
 * Nama : Tanti Nurharomah 
 * Kelas : TI-B
 * NIM : A2.1900178
 * Deskripsi program : Program ini berisi tentang mamalia
 */
public class mamalia {
    // variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;    
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args){
        mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak" + mamalia.jumlahKambing);
    }
    
    
}