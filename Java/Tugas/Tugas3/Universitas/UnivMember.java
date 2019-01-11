package Universitas;
import java.util.*;

public class UnivMember {
    protected String nama;
    protected int umur;
    protected HashMap <String, HashMap<String,String>> alamat = new HashMap<>();

    /**
     * Constructor Member Universitas
     * @param nama Nama member Universitas
     * @param umur Umur member Universitas
     */
    public UnivMember(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    /**
     * Set Nama
     * @param nama Nama Member Universitas
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Get Nama
     * @return Nama Member Universitas
     */
    public String getNama() {
        return nama;
    }

    /**
     * Set Umur
     * @param umur Umur member universitas
     */
    public void setUmur(int umur){
        this.umur = umur;
    }

    /**
     * Get Umur
     * @return umur dari member mahasiswa
     */
    public int getUmur(){
        return this.umur;
    }

    /**
     * get alamat member universitas
     * @return seluruh alamat yang dimiliki member universitas
     */
    public HashMap<String, HashMap<String, String>> getAlamat() {
        return alamat;
    }

    /**
     * Membuat suatu alamat yang memiliki berbagai info
     * @param jalan Nama jalan dari alamat
     * @param nomor Nomor dari alamat
     * @return mengembalikan sebuah alamat beserta info nya berupa hashmap
     */
    public HashMap<String,String> addAlamat (String jalan, String nomor){
        HashMap<String,String> info  = new HashMap<>();
        info.put("Nama Jalan", jalan);
        info.put("Nomor Rumah", nomor);
        return  info;
    }
    /**
     * Memasukkan suatu kategori alamat kedalam data alamat
     * @param jenisAlamat Kategori alamat yang ingin dimasukkan
     * @param almt info alamat berupa hashmap
     */
    public void setAlamat(String jenisAlamat, HashMap<String,String> almt){
      this.alamat.put(jenisAlamat,almt);
    }

    /**
     * Mendapatkan info alamat orang tua
     * @return  info alamat orang tua
     */
    public HashMap<String,String> getOrtu (){
        return this.getAlamat().get("orangtua");

    }

    /**
     * Mendapatkan info alamat kost
     * @return  info alamat kost
     */
    public HashMap<String,String> getKost (){
        return this.getAlamat().get("kost");

    }

    /**
     * Mendapatkan info alamat asrama
     * @return  info alamat asrama
     */
    public HashMap<String,String> getAsrama (){
        return this.getAlamat().get("asrama");

    }

    /**
     * Set alamat orang tua
     * @param jalan Nama jalan
     * @param nomor Nomor Rumah
     * @param kodepos Kode pos
     * @param pjwab Nama Penanggung jawab
     */
    public void setOrtu(String jalan, String nomor, String kodepos, String pjwab){
        HashMap<String,String> info = this.addAlamat(jalan, nomor);
        info.put("Kode Pos", kodepos);
        info.put("PenanggungJawab", pjwab);
        this.setAlamat("orangtua",info);
    }

    /**
     * Set alamat kost
     * @param jalan Nama jalan
     * @param nomor nomor rumah
     * @param nokamar nomor kamar kos
     * @param kodepos kode pos tempat kos
     * @param pemilik nama pemilik kos
     */
    public void setKost(String jalan, String nomor,String nokamar, String kodepos, String pemilik ){
        HashMap<String,String> info = this.addAlamat(jalan, nomor);
        info.put("Nomor Kamar", nokamar);
        info.put("Kode Pos", kodepos);
        info.put("Nama Pemilik Kos", pemilik);
        this.setAlamat("kost",info);
    }

    /**
     * Set alamat asrama
     * @param jalan Nama jalan Asrama
     * @param nomor Nomor jalan Asrama
     * @param nasrama Nama Asrama
     * @param nokamar Nomor kamar asrama
     * @param mstinggal masa tinggal asrama dalam bulan
     */
    public void setAsrama(String jalan, String nomor,String nasrama, String nokamar, String mstinggal ){
        HashMap<String,String> info = this.addAlamat(jalan, nomor);
        info.put("Nama Asrama",nasrama);
        info.put("Nomor Kamar", nokamar);
        info.put("Masa Tinggal",mstinggal);
        this.setAlamat("asrama",info);
    }



}
