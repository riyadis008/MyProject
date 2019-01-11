import java.util.Scanner;

/**
 * @author Riyadi
 * NPM 1706106936
 */
public class Rak {
    String[] rak;


    public boolean cekBarang(String namaBarang){
        boolean cekbarang = false ;

        int i = 0;
        while (i < rak.length){
            if (namaBarang.equals(rak[i])){ //cek jika ada nama barang yg sama
                cekbarang = true;
                break; //break jika ada barang yang sama
            }
            else {
                cekbarang = false;
            }
        i++;
        }
        return cekbarang;

    }

    public int cariBarang(String namaBarang){
        int i = -1;

        for (int j = 0; j < rak.length; j++){
            if (namaBarang.equals(rak[j])){ //cek jika ada barang yang sama
                i = j;
                break; //break loop jika barang ditemukan
            }
            else{
                i = -1;
            }
        }
        return i;

    }

    public boolean simpanBarang(String namaBarang, int nomorRak){
        boolean ceksimpan;

        if (!cekBarang(namaBarang)){
            if (rak[nomorRak] == null){ //barang tersimpan jika null atau tidak ada barang lain
                rak[nomorRak] = namaBarang;
                ceksimpan = true;
            }
            else {
                ceksimpan = false;
            }
        }
        else {
            ceksimpan = false;

        }
        return ceksimpan;

    }

    public String ambilBarang(int nomorRak){
        String cekbrg="";
        String a = rak[nomorRak];

        for (int i = 0; i < rak.length ; i++){
            if (rak[nomorRak] == null){ //cek jika rak tidak ada barang nya
             cekbrg = "Rak kosong";
             break;
            }
            else if(a.equals(rak[i])) { //cek jika ada barang yg diambil ada atau tidak
                cekbrg = rak[nomorRak];
                rak[nomorRak] = null; //rak dikosongkan setelah diambil
                break;
            }

        }
        return cekbrg;
    }

    public void pindahBarang(String namaBarang, int tempatAwal, int tempatPindah){

        if (cekBarang(namaBarang)){
            if(rak[tempatPindah] != null) { //jika tempat pindah tidak kosong
                String temp = rak[tempatAwal]; //ambil item dari rak awal ke temporary variable
                String temp2 = rak[tempatPindah]; //ambil item dari rak awal ke temporary variable
                rak[tempatPindah] = temp; //memindahkan barang ke rak tujuan
                rak[tempatAwal] = temp2; //masukkan barang yang ada dari rak tujuan
            }
            else{
                String temp = rak[tempatAwal]; //ambil item dari rak awal ke temporary variable
                rak[tempatPindah] = temp; //memindahkan barang ke rak tujuan
                rak[tempatAwal] = null; //kosong kan rak
            }
        }
        else {
            System.out.println("Barang tidak ditemukan");
        }


    }

    public static void main(String []args){
        Rak iniRak = new Rak();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while(!exit){
            String[] input = scanner.nextLine().split(" ");
            String namaBarang;
            int letak;
            switch(input[0]){
                case "INISIASI_RAK":
                    int n = Integer.parseInt(input[1]);
                    iniRak.rak = new String[n];
                    break;
                case "CEK_BARANG":
                    namaBarang = input[1];
                    if (iniRak.cekBarang(namaBarang)){
                        System.out.println("Barang tersedia");
                    } else{
                        System.out.println("Barang tidak tersedia");
                    }
                    break;
                case "CARI_BARANG":
                    namaBarang = input[1];
                    letak = iniRak.cariBarang(namaBarang);
                    if (letak == -1) System.out.println("Barang tidak ditemukan");
                    else System.out.printf("Barang terletak pada %s\n", letak);
                    break;
                case "SIMPAN_BARANG":
                    namaBarang = input[1];
                    letak = Integer.parseInt(input[2]);
                    String coba = iniRak.rak[0];
                    if (iniRak.simpanBarang(namaBarang, letak))
                        System.out.printf("%s berhasil disimpan di %s\n", namaBarang, letak);
                    else System.out.printf("Gagal menyimpan %s\n", namaBarang);
                    break;
                case "AMBIL_BARANG":
                    letak = Integer.parseInt(input[1]);
                    namaBarang = iniRak.ambilBarang(letak);
                    if (namaBarang.equals("Rak kosong")) System.out.println(namaBarang);
                    else System.out.printf("Berhasil mengambil %s\n", namaBarang);
                    break;
                case "PINDAH_BARANG":
                    namaBarang = input[1];
                    int tempatAwal = Integer.parseInt(input[2]);
                    int tempatAkhir = Integer.parseInt(input[3]);
                    iniRak.pindahBarang(namaBarang, tempatAwal, tempatAkhir);
                    System.out.printf("Pemindahan Berhasil, rak nomor %s berisi %s dan rak nomor %s berisi %s\n", tempatAkhir, namaBarang, tempatAwal, iniRak.rak[tempatAwal] );
                    break;
                case "EXIT":
                    exit = true;
                    break;
            }
        }
    }
}
