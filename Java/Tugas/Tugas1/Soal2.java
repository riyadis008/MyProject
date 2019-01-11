/**
 * Nama : Riyadi Setiawan
 * NPM : 1706106936
 * Kelas : SI - Ekstensi
 */

import java.util.Scanner; //import scanner

public class Soal2 {
    public void cetak(int n){ //buat fungsi cetak

        int i = 1, j, spasi = n; //buat variable untuk  sebelah kanan kiri, lalu jumlah spasi

        if (n%2 == 0){ //jika n genap
        while (i <= n/2) {

            System.out.println(); //baris baru
            j = 1;

            while (j <= i) { //print "*" kiri
                System.out.print("*");
                j++;
            }
            j = 2;
            while (j < spasi) { //print spasi
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i) { //print "*" kanan
                System.out.print("*");
                j++;
            }
            i++;
            spasi = spasi - 2; //menghilangkan spasi kiri +kanan

        }
    }

    else { //jika ganjil
        while (i <= n/2) {

            System.out.println();
            j = 1;

            while (j <= i) {
                System.out.print("*");
                j++;
            }
            j = 2;
            while ( j < spasi){
                System.out.print(" ");
                j++;
            }
            j= 1;
            while(j <= i ){
                System.out.print("*");
                j++;
            }
            i++;
            spasi=spasi-2;
        }
        if (i == (n/2)+1){
            i = 1;
            System.out.println(); //baris baru
            //untuk print * sesuai jumlah n
            while(i <= n){
                System.out.print("*");
                i++;
            }
        }
    }

    }
    public static void main(String[] args)
    {
        Soal2 obj = new Soal2();//buat objek Soal2
        Scanner inp = new Scanner(System.in); //buat objek scanner input

        int nilai = 0;
        int angka= 0;


        //lakukan loop selama tidak memenuhi kondisi (1-19)
        do {
            System.out.println("Masukkan nilai n (1-19) :");
            angka = inp.nextInt();
            if (angka < 20 && angka > 0) {
                nilai = angka;
                obj.cetak(nilai);
            } else {
                System.out.println("Nilai n yang dimasukkan tidak valid !");
            }
        }while(angka >19 || angka <1);

    }
}
