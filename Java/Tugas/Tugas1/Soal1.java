/**
 * Nama : Riyadi Setiawan
 * Kelas : SI - Ekstensi
 * NPM : 1706106936
 */

import java.util.Scanner; //import scanner

//buat class Soal1
public class Soal1
{

    public static void main(String[] args)
    {
        //variable penampung
        int bulan, periode = 0, jmlmngr = 0, jmlstaf = 0, jmlhnor = 0 ;
        double gajimngr = 0, gajistaf = 0, gajihnor = 0;

        //objek scanner untuk input
        Scanner masukkan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------");

        //validasi input periode kerja
        do {
            System.out.println("Masukkan Bulan (1-12) : ");
            bulan = masukkan.nextInt();
            if (bulan > 12) {
                System.out.println("Kode bulan yang dimasukan tidak valid !");
            }
            else {
                periode = bulan;
            }

        }
        while(bulan > 12 || bulan <1) ; //akan terus berulang jika input masih salah

        boolean sentinel = false; //fungsi exit

        while(!sentinel) {
            System.out.println("Masukkan Jenis Pegawai (M,S,H) (X untuk selesai) :");
            String jenis = masukkan.next();

            //perhitungan gaji manager
            if (jenis.equals("M")) {
                jmlmngr++; //menambahkan 1 manager jika melakukan operasi "M"
                System.out.println("Jenis Pegawai Manager !");
                System.out.println("Masukkan Gajinya (juta) :");
                double gajimgr = masukkan.nextDouble();
                if (periode == 12){ //jika bulan ini adalah bulan 12
                    gajimngr += gajimgr * 2;
                }
                else {
                    gajimngr += gajimgr;
                }

            //perhitungan gaji staff
            } else if (jenis.equals("S")) {
                jmlstaf++; //menambahkan 1 staff jika melakukan operasi "S"
                System.out.println("Jenis Pegawai Staf !");
                System.out.println("Masukkan masa kerjanya (tahun) :");
                int thnstaf = masukkan.nextInt();
                System.out.println("Jumlah jam lembur : ");
                int lembur = masukkan.nextInt();
                if (periode == 12) { //jika bulan ini adalah bulan 12
                    if (thnstaf <= 3) {  //fungsi gaji staff dengan masa kerja 0-3 tahun
                        gajistaf += (1.5 + (1.5*0.75))+(lembur*0.125) ;
                    } else if (thnstaf <= 5) { //fungsi gaji staff dengan masa kerja 4-5 tahun
                        gajistaf += (2+(2*0.75))+(lembur*0.125);
                    } else { //fungsi gaji staff dengan masa kerja diatas 5 tahun
                        gajistaf += ((1.5 + 0.2) * thnstaf)+(0.75*((1.5 + 0.2) * thnstaf))+(lembur*0.125);
                    }
                }
                else {
                    if (thnstaf <= 3) { //fungsi gaji staff dengan masa kerja 0-3 tahun
                        gajistaf += 1.5+(lembur*0.125);
                    } else if (thnstaf <= 5) { //fungsi gaji staff dengan masa kerja 4-5 tahun
                        gajistaf += 2+(lembur*0.125);
                    } else { //fungsi gaji staff dengan masa kerja diatas 5 tahun
                        gajistaf += ((1.5 + 0.2) * thnstaf)+(lembur*0.125);
                    }
                }

            //perhitungan gaji honorer
            } else if (jenis.equals("H")) {
                jmlhnor++; //menambahkan 1 honorer jika melakukan operasi "H"
                System.out.println("Jenis Pegawai Honorer !");
                System.out.println("Jumlah Jam : ");
                int jmljam = masukkan.nextInt();
                gajihnor += (0.1*jmljam);

                //fungsi keluar loop
            } else if (jenis.equals("X")) {
                sentinel = true; //exit dari while

               //jika input tidak valid
            } else {
                System.out.println("Kode pegawai yang dimasukkan tidak valid");

            }
        }

        //menampung total gaji
        double totalgaji = gajimngr + gajistaf + gajihnor ;

        //menampilkan rincian biaya
        System.out.println("Jumlah Manager : "+jmlmngr+", Total Gaji : "+gajimngr+ " juta ");
        System.out.println("Jumlah Staff : "+jmlstaf+", Total Gaji : "+gajistaf+" juta ");
        System.out.println("Jumlah Honorer : "+jmlhnor+", Total Gaji : "+gajihnor+"juta");
        System.out.println("TOTAL YANG HARUS DIBAYARKAN PT. ABC : "+totalgaji+" juta ");

        System.out.println("-----------------------------------------------------------------");

        masukkan.close(); //close scanner
    }
}
