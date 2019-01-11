import java.io.*;
import java.util.*;

public class CatAdopt {

    static String waktu="";
    String nama;
    int perawatan;
    static ArrayList<CatAdopt> kucing = new ArrayList<CatAdopt>(); //menampung semua jenis kucing
    ArrayList<Integer> logs = new ArrayList<Integer>(); //menampung data harga

    //constructor
    public CatAdopt(String nama, int perawatan ){
        this.nama = nama;
        this.perawatan = perawatan;
    }
    //cek duplikat
    public static boolean checkCat(String name){
        boolean a = false;
        for(CatAdopt s : kucing){
            if(s.nama.equals(name)){
                a = true;
            }
        }
        return a;
    }
    //cari biaya
    public static int cariBayar(String s){
        int harga=0;
        try {
            String jenisbayar = s.substring(0, 1);
            harga = Integer.parseInt(s.substring(1));
            if (jenisbayar.equals("A")) {
                harga += 1;
            } else {
                harga += 0;
            }
        }catch (NumberFormatException n){
            System.out.println("Terdapat kesalahan penulisan nominal");
            System.exit(1);
        }


        return harga;
    }
    //tampilkan semua data harga perawatan
    public String detilHarga(){
        String s="";
        try {
            if (logs.size() > 1) {
                for (int i = 0; i < logs.size() - 1; i++) {
                    s +=  logs.get(i)+" + ";
                }
                s += Integer.toString(logs.get(logs.size()-1));
            } else {
                s += Integer.toString(logs.get(0));
            }
        }
        catch (IndexOutOfBoundsException in){
            System.out.println("Size Array Tidak Memenuhi");
        }

        return s;
    }

    //cek input untuk date
    public static String getDate(String a){
        String ddate="";
        try {
            String[] lel = a.split("/");
            int day = Integer.parseInt(lel[0]);
            int month = Integer.parseInt(lel[1]);
            int year = Integer.parseInt(lel[2]);
            ddate = day+"/"+month+"/"+year;
        }
        catch (NumberFormatException e){
            System.out.println("Terdapat kesalahan penulisan tanggal");
            System.exit(1);
        }
        return ddate;
    }
    public static void main (String[] args){

        try{
            FileReader reader = new FileReader("input.txt");
            Scanner inp = new Scanner(reader);
            String gdate = inp.nextLine();
            waktu = getDate(gdate);

            while (inp.hasNext()){
                String nama = inp.next();
                String biaya = inp.next();
                int harga = cariBayar(biaya);

                CatAdopt kc = new CatAdopt(nama,harga);

                /**
                 * jika ada kucing yang namanya sama , maka data harga nya ditambah saja,
                 * Jika tidak ada, objek ditambahkan ke arraylist yang menampung kucing
                 */
                if(!checkCat(nama)){
                    kc.logs.add(harga);
                    kucing.add(kc);
                }
                else {
                    for(CatAdopt s : kucing){
                        if (nama.equals(s.nama)){
                            s.perawatan+=harga;
                            s.logs.add(harga);
                            break;
                        }
                    }
                }
            }
            inp.close();
            reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File Tidak Ditemukan");
        }
        catch (IOException io){
            System.out.println("Ada error");
        }
        //cetak semua data
        for (CatAdopt ct : kucing){
            System.out.print(ct.nama+"\n"+waktu+" Total Biaya Perawatan = "+ct.perawatan+",000,000 "+"("+ct.detilHarga()+")\n");
        }

    }
}


