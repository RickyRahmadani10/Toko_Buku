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
class Transaksi extends Pembeli{
    private static int jumlah;
    
    public Transaksi(int id_barang, String nama_barang, String merk_barang, int harga_barang, 
            int id_customer, String nama_customer, String alamat, String telp, int jumlah) {
        super(id_barang, nama_barang, merk_barang, harga_barang, id_customer, nama_customer, alamat, telp);
        this.jumlah = jumlah;
    }
    
    public void output(){
        super.output();
        System.out.println(" Jumlah barang = " +this.jumlah);
    }
    
    public static void main(String [] args) {
        Transaksi tr = new Transaksi(28,"Pensil","Steadler",9000,10,"Ricky","Jl.Sembilang","085123456789",7);
        tr.output();
        System.out.println(" Total harga = " +(harga_barang * jumlah));
        System.out.println(" ");
        System.out.println(" ================================");
    }
}
