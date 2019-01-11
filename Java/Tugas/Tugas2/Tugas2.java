/**
 * Tugas Permrograman 2 DDP2 SI-Ekstensi
 * @author Riyadi Setiawan
 * 1706106936
 */

import java.util.Scanner;
import java.util.Random;

public class Tugas2 {

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in); //inisiasi scanner
        Random gen = new Random(); //inisiasi random
        int jumlahranjau; //menampung jumlah ranjau sesuai level
        int flagwin = 0; //menghitung win point
        int kotak=0; //menampung banyaknya field
        String[] ranjau; //inisiasi array untuk ranjau

        System.out.println("#############################################");
        System.out.println("Selamat datang di permainan ranjau tersembunyi");
        System.out.println("Dibuat oleh : Riyadi Setiawan");
        System.out.println("#############################################");


        do {
            System.out.print("Masukkan ukuran field : ");
            int field = inp.nextInt();
            if (field<3 || field >10){ //validasi field yang dimasukkan
                System.out.println("Input tidak valid");
            }
            else {
                kotak =field;
            }
        }while (kotak < 3); //selama kotak tidak melebihi 3

        //pilih level
        System.out.print("Pilih level permainan (1: Sulit; 2: Mudah) : ");
        int lvl = inp.nextInt();

        String [][] papan = new String[kotak][kotak]; //buat array2d sebanyak 'kotak' field

        int lives = kotak; //inisiasi lives sebanyak kotak

        //fungsi input value ke array 2d
        for (int i = 0; i < kotak; i++) {
            for (int j = 0; j < kotak; j++) {
                String vali = Integer.toString((i + 1)); //ubah int ke string sesuai indeks i+1
                String valj = Integer.toString((j + 1)); //ubah int ke string sesuai indeks j +1
                papan[i][j] = vali + valj; //input elemen kedalam array 2d
            }
        }

        //fungsi level untuk menentukan jumlah ranjau
        if (lvl == 1) { //jika sulit
            if((kotak*kotak)%2 == 0) {
                jumlahranjau = ((kotak * kotak) / 2);
                //ranjau = new String[jumlahranjau];
            }
            else{
                jumlahranjau = ((kotak * kotak) / 2) + 1; //+1 jika desimal
            }
        } else { //jika mudah
            if((kotak*kotak)%4 == 0) {
                jumlahranjau = ((kotak * kotak) / 4);

            }
            else {
                jumlahranjau = ((kotak * kotak) / 4) + 1; //+1 jika desimal
            }
        }

        ranjau = new String[jumlahranjau];
        //fungsi input value ranjau secara random

        int rj =0;
        while (rj < ranjau.length) {
            for (String ran : ranjau) {
                int irandom = gen.nextInt(kotak); //generate random untuk indeks i atau baris
                int jrandom = gen.nextInt(kotak);//generate random untuk indeks j atau kolom
                if( !papan[irandom][jrandom].equals(ran)){
                    ranjau[rj] = papan[irandom][jrandom]; //masukkan value ranjau
                    break;
                }

            }
            rj++;
        }
        //
        while(lives != 0) { //selama lives tidak = 0 yang siebabkan oleh ranjau atau menang

            //print board dengan value saat ini
            for (int i = 0; i < kotak; i++) {
                System.out.println();
                for (int j = 0; j < kotak; j++) {
                    System.out.print(papan[i][j] + " ");
                }
            }

            //buat test lihat flag
            /*
            System.out.println("ini flagwin:"+flagwin);
             */
            //buat test lihat ranjau
            /*
            for (String R : ranjau){

                System.out.print(R+" ");
            }
            */

            //fungsi input sel
            System.out.println();
            System.out.println("Jumlah Ranjau : " + jumlahranjau);
            System.out.print("Silahkan Masukkan posisi sel : ");
            String sel = inp.next();

            //cek input jika ada di dalam array 2d dan ada di ranjau
            for (int i = 0; i < kotak; i++) {
                for (int j = 0; j < kotak; j++) {
                    if (sel.equals(papan[i][j])) {
                        for (String s : ranjau) { //cek semua elemen dalam array ranjau
                            if (sel.equals(s)) { //jika input adalah ranjau
                                papan[i][j] = "X ";
                                lives = 0;
                                flagwin = 0;
                                break;
                            }
                            else { //jika bukan ranjau
                                papan[i][j] = "O ";
                                flagwin+=1;

                            }
                        }
                    }
                }

            }
            //jika angka benar sudah sama dengan jumlah field maka keluar loop while
            if (flagwin == (jumlahranjau*kotak)){
                lives = 0;
            }
        }

        //print board sesuai kondisi
        if (flagwin >= kotak ) { //jika menang
            for (int i = 0; i < kotak; i++) {
                System.out.println();
                for (int j = 0; j < kotak; j++) {
                    for(String R : ranjau){
                        if(papan[i][j].equals(R)){ //mengganti semua elemen ranjau dengan X
                            papan[i][j]="X ";
                        }
                    }
                    System.out.print(papan[i][j] + " ");
                }
            }
            System.out.println("\nSelamat, Anda menang !");
        }
        else { //jika kalah
            for (int i = 0; i < kotak; i++) {
                System.out.println();
                for (int j = 0; j < kotak; j++) {
                    for(String R : ranjau){
                        if(papan[i][j].equals(R)){ //mengganti semua elemen ranjau dengan X
                            papan[i][j]="X ";
                        }
                    }
                    System.out.print(papan[i][j] + " ");
                }
            }
            System.out.print("\nMaaf, Anda kalah !");
        }

    }
}
