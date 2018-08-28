/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBuku;

/**
 *
 * @author WINDOWS 10
 */
public class Barang {
    private int id_barang;
    private String nama_barang, merk_barang;
    public static int harga_barang;
    
    public Barang(int id_barang, String nama_barang, String merk_barang, int harga_barang){
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.merk_barang = merk_barang;
        this.harga_barang = harga_barang;
    }
    
    public void output(){
        System.out.println(" Nama Kasir = Doni");
        System.out.println(" Tanggal = 15-6-2018");
        System.out.println(" ");
        System.out.println(" ================================");
        System.out.println(" Id_Barang = " +this.id_barang);
        System.out.println(" Nama Barang = " +this.nama_barang);
        System.out.println(" Merk Barang = " +this.merk_barang);
        System.out.println(" Harga Barang = " +this.harga_barang);
    }
    
}
