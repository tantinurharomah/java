/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5.kambingglobal;

/**
 *
 * @author acer
 */
public class Latihan5Kambingglobal {

    //variabel jumlah kambing menjadi variabel instance
    int jumlahKambing = 88;
    
public void getJumlahKambing(){
    System.out.println("Jumlah Kambing: "+ jumlahKambing);
}
public void tambahKambing(){
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
}
    

    public static void main(String[] args) {
        Latihan5Kambingglobal kambingsusu = new Latihan5Kambingglobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingsusu.getJumlahKambing();
        //menambah satu kambing
        kambingsusu.tambahKambing();
        //menampilkan jumlah kambing yang ada
        kambingsusu.getJumlahKambing();
    }
    
}
