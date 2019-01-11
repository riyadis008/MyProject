/**
 * Tugas Pemrograman 3 DDP2  SI - Ekstensi
 * Nama : Riyadi Setiawan (1706106936), Evi Septiana (1706106715)
 * Universitas Indonesia
 */

import Universitas.*;
import java.util.*;
import java.io.*;

public class University {
    public static HashMap<Integer, Mahasiswa> dataMahasiswa = new HashMap<>();


    /**
     * Menyimpan Objek mahasiswa ke dalam hashmap data mahasiswa yang berperan sebagai database
     * @param npm key NPM untuk identifikasi mahasiswa
     * @param mhs objek mahasiswa yang dimasukkan
     */
    public static void  simpanMahasiswa(int npm, Mahasiswa mhs){
        dataMahasiswa.put(npm,mhs);

    }

    /**
     * Mengambil data mahasiswa menurut NPM
     * @param npm NPM mahasiswa yang ingin di ambil datanya
     * @return data mahasiswa menurut NPM
     */
    public static Mahasiswa getMahasiswa(Integer npm){
        Mahasiswa mhs;
        mhs = dataMahasiswa.get(npm);
        return mhs;
    }

    /**
     * Menghapus data mahasiswa sesuai NPM
     * @param npm adalah NPM mahasiswa yang ingin di hapus
     */
    public static void deleteMahasiswa (Integer npm){
        if(dataMahasiswa.containsKey(npm)){
            dataMahasiswa.remove(npm);
            System.out.println("Data berhasil dihapus !");
        }
        else {
            System.out.println("NPM tidak ditemukan");
        }
    }

    /**
     * menampilkan semua info mahasiswa dalam database
     */
    public static void tampilInfo(){
        for(Mahasiswa mhs : dataMahasiswa.values()){
            showInfoMahasiswa(mhs);
            System.out.println();
        }
    }

    /**
     * Memanggil form isi alamat orang tua
     * @param mhs objek mahasiswa yang ingin di input data nya
     */
    public static void setAlamatOrtu(Mahasiswa mhs){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nama Jalan              :");
        String jalan = inp.nextLine();
        System.out.print("Masukkan Nomor Rumah             :");
        String nomor = inp.nextLine();
        System.out.print("Masukkan Kode Pos                :");
        String kodepos = inp.nextLine();
        System.out.print("Masukkan Nama Penanggungjawab    :");
        String pjawab = inp.nextLine();

        mhs.setOrtu(jalan,nomor,kodepos,pjawab);

    }

    /**
     * Memanggil form isi alamat kos
     * @param mhs objek mahasiswa yang ingin di input data nya
     */
    public static void setAlamatKost(Mahasiswa mhs){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nama Jalan              :");
        String jalan = inp.nextLine();
        System.out.print("Masukkan Nomor Rumah             :");
        String nomor = inp.nextLine();
        System.out.print("Masukkan Nomor Kamar             :");
        String nokamar = inp.nextLine();
        System.out.print("Masukkan Kode Pos                :");
        String kodepos = inp.nextLine();
        System.out.print("Masukkan Nama Pemilik Kos        :");
        String pkos = inp.nextLine();

        mhs.setKost(jalan,nomor,nokamar,kodepos,pkos);
    }

    /**
     * Memanggil form isi alamat asrama
     * @param mhs objek mahasiswa yang ingin di input data nya
     */
    public static void setAlamatAsrama(Mahasiswa mhs) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nama Jalan              :");
        String jalan = inp.nextLine();
        System.out.print("Masukkan Nomor Jalan             :");
        String nomor = inp.nextLine();
        System.out.print("Masukkan Nama Asrama             :");
        String nasrama = inp.nextLine();
        System.out.print("Masukkan Nomor Kamar             :");
        String nokamar = inp.nextLine();
        System.out.print("Masa tinggal di asrama           :");
        String mtinggal = inp.nextLine();

        mhs.setAsrama(jalan,nomor,nasrama,nokamar,mtinggal);

    }

    /**
     * Menampilkan info alamat orang tua dari mahasiswa mhs
     * @param mhs objek mahasiswa yang ingin ditampilkan infonya
     */
    public static void showOrtu(Mahasiswa mhs){
        if(mhs.getAlamat().containsKey("orangtua")){
            HashMap<String,String> aorangtua = mhs.getOrtu();
            System.out.println("Alamat orangtua\t\t:");
            System.out.println("Nama Jalan\t\t: "+aorangtua.get("Nama Jalan"));
            System.out.println("Nomor Rumah\t\t: "+aorangtua.get("Nomor Rumah"));
            System.out.println("Kode Pos\t\t: "+aorangtua.get("Kode Pos"));
            System.out.println("Nama Penanggung Jawab\t: "+aorangtua.get("PenanggungJawab"));
        }
        else {
            System.out.println("Alamat orangtua\t\t: - ");
        }
    }

    /**
     * Menampilkan info alamat kost dari mahasiswa mhs
     * @param mhs objek mahasiswa yang ingin ditampilkan infonya
     */
    public static void showKost(Mahasiswa mhs){
        if(mhs.getAlamat().containsKey("kost")){
            HashMap<String,String> akost = mhs.getKost();
            System.out.println("Alamat kost\t\t: ");
            System.out.println("Nama Jalan\t\t: "+akost.get("Nama Jalan"));
            System.out.println("Nomor Rumah\t\t: "+akost.get("Nomor Rumah"));
            System.out.println("Nomor Kamar\t\t: "+akost.get("Nomor Kamar"));
            System.out.println("Kode Pos\t\t: "+akost.get("Kode Pos"));
            System.out.println("Nama Pemilik Kos\t: "+akost.get("Nama Pemilik Kos"));
        }
        else {
            System.out.println("Alamat kost\t\t: - ");
        }
    }

    /**
     * Menampilkan info alamat asrama dari mahasiswa mhs
     * @param mhs objek mahasiswa yang ingin ditampilkan infonya
     */
    public static void showAsrama(Mahasiswa mhs){
        if(mhs.getAlamat().containsKey("asrama")){
            HashMap<String,String> aasrama = mhs.getAsrama();
            System.out.println("Alamat asrama\t: ");
            System.out.println("Nama jalan\t\t: "+aasrama.get("Nama Jalan"));
            System.out.println("Nomor jalan\t\t: "+aasrama.get("Nomor Rumah"));
            System.out.println("Nama asrama\t\t: "+aasrama.get("Nama Asrama"));
            System.out.println("Nomor kamar\t\t: "+aasrama.get("Nomor Kamar"));
            System.out.println("Masa tinggal di asrama \t: "+aasrama.get("Masa Tinggal"));
        }
        else {
            System.out.println("Alamat asrama\t\t: - ");
        }
    }

    /**
     * Menampilkan keseluruhan info mahasiswa
     * @param mhs objek mahasiswa yang ingin ditampilkan infonya
     */
    public static void showInfoMahasiswa (Mahasiswa mhs){
        System.out.println("Nama\t\t\t: "+mhs.getNama());
        System.out.println("NPM\t\t\t: "+mhs.getNpm());
        System.out.println("Umur\t\t\t: "+mhs.getUmur());
        showOrtu(mhs);
        showKost(mhs);
        showAsrama(mhs);
    }

    /**
     * Melakukan input data dari file
     * @param namafile nama file yang menjadi input
     */
    public static void UploadInfo(String namafile){
        try {
            FileReader reader = new FileReader(namafile);
            Scanner unggah = new Scanner(reader);

            while (unggah.hasNextLine()){
                String rawdata = unggah.nextLine();
                String[] datainput = rawdata.split(";");
                Mahasiswa mhs = new Mahasiswa(datainput[0],Integer.parseInt(datainput[1]),Integer.parseInt(datainput[2]));
                //Jika ada alamat orang tua
                if(datainput[3].equals("Y")){
                    mhs.setOrtu(datainput[4],datainput[5],datainput[6],datainput[7]);
                }
                //Jika ada alamat kost
                if(datainput[8].equals("Y")){
                    mhs.setKost(datainput[9],datainput[10],datainput[11],datainput[12],datainput[13]);
                }
                //Jika ada alamat asrama
                if(datainput[14].equals("Y")){
                    mhs.setAsrama(datainput[15],datainput[16],datainput[17],datainput[18],datainput[19]);
                }
                simpanMahasiswa(Integer.parseInt(datainput[2]),mhs);
            }
            reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File tidak Ditemukan");
        }
        catch (NumberFormatException n){
            System.out.println("Kesalahan Format Input");
        }
        catch (IndexOutOfBoundsException i){
            System.out.println("Terdapat kesalahan dalam format input data");
        }
        catch (IOException io){
            System.out.println("Ada Error");
        }
    }

    /**
     * Mencetak data ke txt
     * @param namafile nama file output yang diinginkan
     */
    public static void cetakData(String namafile){
        File file = new File(namafile);
        try {
            file.createNewFile();

            PrintWriter cetak = new PrintWriter(file);

            for(Mahasiswa mhs : dataMahasiswa.values()){
                cetak.write("Nama\t\t\t: "+mhs.getNama()+"\r\n");
                cetak.write("NPM\t\t\t: "+mhs.getNpm()+"\r\n");
                cetak.write("Umur\t\t\t: "+mhs.getUmur()+"\r\n");
                //cek ada alamat orangtua atau tidak
                if (mhs.getAlamat().containsKey("orangtua")){
                    cetak.write("Alamat orangtua\t\t:"+"\r\n");
                    cetak.write("Nama Jalan\t\t: "+mhs.getOrtu().get("Nama Jalan")+"\r\n");
                    cetak.write("Nomor Rumah\t\t: "+mhs.getOrtu().get("Nomor Rumah")+"\r\n");
                    cetak.write("Kode Pos\t\t: "+mhs.getOrtu().get("Kode Pos")+"\r\n");
                    cetak.write("Nama Penanggung Jawab\t: "+mhs.getOrtu().get("PenanggungJawab")+"\r\n");
                }
                else {
                    cetak.write("Alamat orangtua\t\t: - "+"\r\n");
                }
                //cek ada alamat kost atau tidak
                if (mhs.getAlamat().containsKey("kost")){
                    cetak.write("Alamat kost\t\t:"+"\r\n");
                    cetak.write("Nama Jalan\t\t: "+mhs.getKost().get("Nama Jalan")+"\r\n");
                    cetak.write("Nomor Rumah\t\t: "+mhs.getKost().get("Nomor Rumah")+"\r\n");
                    cetak.write("Nomor Kamar\t\t: "+mhs.getKost().get("Nomor Kamar")+"\r\n");
                    cetak.write("Kode Pos\t\t: "+mhs.getKost().get("Kode Pos")+"\r\n");
                    cetak.write("Nama Pemilik Kost\t: "+mhs.getKost().get("Nama Pemilik Kos")+"\r\n");
                }
                else {
                    cetak.write("Alamat kost\t\t: - "+"\r\n");
                }
                //cek ada alamat asrama atau tidak
                if (mhs.getAlamat().containsKey("asrama")){
                    cetak.write("Alamat asrama\t\t:"+"\r\n");
                    cetak.write("Nama Jalan\t\t: "+mhs.getAsrama().get("Nama Jalan")+"\r\n");
                    cetak.write("Nomor Jalan\t\t: "+mhs.getAsrama().get("Nomor Rumah")+"\r\n");
                    cetak.write("Nama Asrama\t\t: "+mhs.getAsrama().get("Nama Asrama")+"\r\n");
                    cetak.write("Nomor Kamar\t\t: "+mhs.getAsrama().get("Nomor Kamar")+"\r\n");
                    cetak.write("Masa Tinggal di Asrama\t: "+mhs.getAsrama().get("Masa Tinggal")+"\r\n");
                }
                else{
                    cetak.write("Alamat asrama\t\t: - "+"\r\n");
                }
                cetak.write("\r\n");
            }
            System.out.println("Data Berhasil dicetak");
            cetak.flush();
            cetak.close();
        }
        catch (IOException io){
            System.out.println("Gagal membuat file");
        }
    }
    //-----------------------------------------------------------------------------------
    //Main page
    //-----------------------------------------------------------------------------------
    public static  void main(String[]args) {
        Scanner input = new Scanner(System.in);
        boolean sentinel = true;

        while (sentinel){
            System.out.println("-------------------------------------------------------------");
            System.out.println("PILIHAN ANDA:");
            System.out.println("1. Tambahkan data mahasiswa");
            System.out.println("2. Hapus data mahaiswa");
            System.out.println("3. Cetak semua data ke layar");
            System.out.println("4. Ambil data dari file");
            System.out.println("5. Simpan data ke file");
            System.out.println("6. Selesai");
            System.out.println();
            int masukkan = input.nextInt();

            if(masukkan == 1){
                System.out.print("Masukkan Nama    :");
                String nama = input.next();
                System.out.print("Masukkan NPM     :");
                int npm = input.nextInt();
                System.out.print("Masukkan Umur    :");
                int umur = input.nextInt();
                System.out.print("Isi alamat orangtua (Y/N) ?");
                String konfirmortu = input.next();
                Mahasiswa mhs = new Mahasiswa(nama,umur,npm);
                //Jika ingin memasukkan alamat orangtua
                if (konfirmortu.equals("Y") || konfirmortu.equals("y")) {
                    setAlamatOrtu(mhs);
                }
                System.out.print("Isi alamat kost (Y/N) ?");
                String konfirmkost= input.next();
                //Jika ingin memasukkan alamat kost
                if (konfirmkost.equals("Y") || konfirmkost.equals("y")) {
                    setAlamatKost(mhs);
                }
                System.out.print("Isi alamat asrama (Y/N) ?");
                String konfirmasrama= input.next();
                //Jika ingin memasukkan alamat asrama
                if(konfirmasrama.equals("Y") || konfirmasrama.equals("y")){
                    setAlamatAsrama(mhs);
                }
                simpanMahasiswa(npm,mhs);
            }
            else if(masukkan==2){
                System.out.print("Masukkan NPM Mahasiswa yang akan dihapus : ");
                int konfirmhapus = input.nextInt();
                deleteMahasiswa(konfirmhapus);
            }
            else if(masukkan==3){
                System.out.println("Jumlah Mahasiswa\t: "+dataMahasiswa.size());
                tampilInfo();

            }
            else if(masukkan==4){
                System.out.print("Masukkan Nama File Beserta Extension nya\t: ");
                String masukanfile = input.next();
                UploadInfo(masukanfile);
            }
            else if(masukkan==5){
                System.out.print("Masukkan Nama File Hasil Cetak Beserta Extension nya : ");
                String masukanfile2 = input.next();
                cetakData(masukanfile2);

            }
            else if(masukkan==6){
				System.out.println("Anda Telah Keluar Dari Program !");
                sentinel = false;
                input.close();
            }

        }


    }
}
