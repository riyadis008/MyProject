<<<<<<< HEAD
import java.util.Scanner;

public class NamaAnakTB {



    public boolean isPal(String nama){
        //base case
        if(nama.length() <= 1){
            return true;
        }
        //recursion case
        else{
            char char1 = nama.charAt(0);
            char char2 = nama.charAt(nama.length()-1);
            //cek apakah karakter huruf atau bukan
            if(Character.isLetter(char1) && Character.isLetter(char2)){
                if (char1 == char2){ //jika char awal sama dengan char akhir
                    //potong karakter awal dan akhir
                    return isPal(nama.substring(1,nama.length()-1));
                }
                else{
                    return false;
                }
            }
            //jika karakter  terakhir bukan huruf
            else if(!Character.isLetter(char2)){

                //potok karakter akhir
                return isPal(nama.substring(0,nama.length()-1));
            }
            //jika karakter awal bukan huruf
            else{
                //potong karakter awal
                return isPal(nama.substring(1));
            }
        }
    }


    public static void main(String[] args){
        String nnama;

        do {
            Scanner input = new Scanner(System.in);
            nnama = input.nextLine();
        }while (nnama == null || nnama.equals(""));

        NamaAnakTB namaAnakTB = new NamaAnakTB();
        System.out.println(namaAnakTB.isPal(nnama));

    }
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faculty
 */
public class NamaAnakTB {

    public boolean isPal(String kata){ 
        int left  = 0;                 
        int right = kata.length()-1;  

        while (left < right) {
            if (kata.charAt(left) != kata.charAt(right)) {
                return false;         
            }
            left++;                  
            right--;              
        }

        return true; 
    } 
    
>>>>>>> bd3811ccf040d020f034496dc35cceacb5c38914
}
