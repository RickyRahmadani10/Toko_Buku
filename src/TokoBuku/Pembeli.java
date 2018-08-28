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
class Pembeli extends Barang{
    private int id_customer;
    private String nama_customer, alamat, telp;
    
    public Pembeli(int id_barang, String nama_barang, String merk_barang, int harga_barang, 
            int id_customer, String nama_customer, String alamat, String telp) {
        super(id_barang, nama_barang, merk_barang, harga_barang);
        this.id_customer =id_customer;
        this.nama_customer = nama_customer;
        this.alamat = alamat;
        this.telp = telp;
    }
    
    public void output() {
        super.output();
        System.out.println(" Id customer =  " +this.id_customer);
        System.out.println(" Nama customer = " +this.nama_customer);
        System.out.println(" Alamat = " +this.alamat);
        System.out.println(" Telp = " +this.telp);
    }
}
