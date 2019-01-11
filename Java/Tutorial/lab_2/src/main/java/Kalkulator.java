<<<<<<< HEAD
// Nama : Riyadi Setiawan
// NPM : 1706106936

import java.lang.Math; //fungsi math
import java.util.Scanner; //fungsi untuk input

public class Kalkulator {


    //buat class hitung
    public static int hitung(int angka1, String operator, int angka2)
    {
        //fungsi tambah
        int hasil =0;
        if (operator.equals("+"))
        {
             hasil = angka1+angka2;
        }
        //fungsi kurang
        else if (operator.equals("-"))
        {
             hasil = angka1-angka2;
        }
        //fungsi kali
        else if (operator.equals("*"))
        {
             hasil = angka1*angka2;
        }
        //fungsi bagi
        else if (operator.equals("/"))
        {
             hasil = angka1/angka2;
        }
        //fungsi modulo
        else if (operator.equals("%"))
        {
             hasil = angka1%angka2;
        }
        //fungsi pangkat
        else if (operator.equals("^"))
        {
             hasil =(int)(Math.pow(angka1,angka2));
        }
        //fungsi akar
        else if (operator.equals("v"))
        {
            if (angka2 == 2)
            {
                hasil =(int) Math.sqrt(angka1);
            }

            else if(angka2 ==3)
            {
                hasil = (int) Math.cbrt(angka1);
            }

            else
            {
                System.out.println("Tidak boleh perpangkatan 2 atau 3");
            }
            }
=======
import java.util.Scanner;

public class Kalkulator {
    public static int hitung(int a, String operasi, int b){
        int hasil = 0;

        if(operasi.equals("+")){
            hasil = a + b;
        }

        if(operasi.equals("-")){
            hasil = a - b;
        }

        if(operasi.equals("*")){
            hasil = a * b;
        }

        if(operasi.equals("^")){
            hasil = (int) Math.pow(a,b);
        }

        if(operasi.equals("%")){
            hasil = a % b;
        }

        if(operasi.equals("/")){
            hasil = a / b;
        }

        if(operasi.equals("v")){
            if(b == 2){
                hasil = (int) Math.sqrt(a);
            }
            if(b == 3){
                hasil = (int) Math.cbrt(a);
            }
        }
>>>>>>> bd3811ccf040d020f034496dc35cceacb5c38914

        return hasil;
    }

<<<<<<< HEAD
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //design input
        System.out.println("KALKULATOR SYANTIK");
        System.out.println("--------------------");
        System.out.println("Masukkan Input : ");
        String input1 = input.nextLine();

        //split input berdasarkan spasi
        String[] masukan = input1.split(" ");

        //convert string menjadi int
        int angka1 = (Integer.parseInt(masukan[0])) ;
        int angka2 = (Integer.parseInt(masukan[2])) ;
        //menentukan simbol
        String aritmetik = masukan[1];
        //panggil method hitung untuk menghitung hasil
        int operasi = hitung(angka1,aritmetik,angka2);

        //tampilkan hasil perhitungan
        System.out.printf("Hasil Perhitungan : %d ",operasi);

    }

}

=======
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama : ");
        int a = in.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int b = in.nextInt();
        System.out.print("Masukkan simbol operasi : ");
        String op = in.next();

        System.out.println(hitung(a,op,b));
    }
}
>>>>>>> bd3811ccf040d020f034496dc35cceacb5c38914
