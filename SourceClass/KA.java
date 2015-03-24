/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceClass;

/**
 *
 * @author heavydude
 */
public class KA {
    private String nama ;
    private int jumlahGerbong;
    private Gerbong [] gerbong = new Gerbong [12];
    private RuteKA rute;
    
    public KA (String nama){
        this.nama = nama;
    }
    public KA (String nama , int jumlahGerbong){
        this.nama=nama;
        this.jumlahGerbong=jumlahGerbong;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJumlahGerbong(int jumlahGerbong) {
        this.jumlahGerbong = jumlahGerbong;
    }
    public void setGerbong(Gerbong[] gerbong) {
        this.gerbong = gerbong;
    }
    public void setRute(RuteKA rute) {
        this.rute = rute;
    }
    public String getNama() {
        return nama;
    }
    public int getJumlahGerbong() {
        return jumlahGerbong;
    }
    public Gerbong[] getGerbong() {
        return gerbong;
    }
    public RuteKA getRute() {
        return rute;
    }
    public void buatGerbong(Gerbong gerbong){
        if (jumlahGerbong >12) {
            System.out.println("Kereta sudah penuh");
        }else{
           this.gerbong[jumlahGerbong]=gerbong;
           jumlahGerbong++;
        }
    }
    
}
