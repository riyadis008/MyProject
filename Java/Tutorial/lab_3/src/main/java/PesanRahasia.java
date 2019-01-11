import java.util.Scanner;

public class PesanRahasia {

    /**
     *
     * @param iniPesan merupakan satu baris pesan rahasia
     * @return kalimat X
     */
    public static String constructX(String iniPesan){
        String ilang = "";

        for (int i = 0; i < iniPesan.length(); i++) //iterasi sampai total huruf dalam kalimat
        {
            if (i%2 == 0) //jika hasil modulo 0 maka genap
            {
                char idx = iniPesan.charAt(i);
                ilang = ilang + idx;
            }
        }

        return ilang;
    }

    /**
     *
     * @param kalimatX hasil dari constructX
     * @return kalimat Y
     */
    public static String constructY(String kalimatX) {
        String y ="";
        int cheka= 0;

        for (int i = 0; i < kalimatX.length(); i++) //iterasi sampai total huruf dalam kalimat
        {
            char idx = kalimatX.charAt(i); //mengambil huruf tiap index
            if (idx == 'A') //cek char A
            {
                if (cheka < 3 ) //cek counter A
                {
                    y = y + idx;
                    cheka++;
                }
                if (cheka == 3) { //cek jika A sudah 3

                    break;
                }
            }
            else
            {
                y = y + idx;

            }
        }
        return y;
    }

    /**
     *
     * @param kalimatY hasil dari construct Y
     * @return hasil terjemahan pesan
     */
    public static String constructIsiPesanSebenarnya(String kalimatY) {
        String hasil = "";

        for (int i = 0; i < kalimatY.length(); i++) //iterasi sampai total huruf dalam kalimat
        {
            if (i%2 == 1) //jika hasil modulo 1 maka ganjil
            {
                char idx = kalimatY.charAt(i);
                hasil = hasil + idx;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sentinel= false; //variable untuk Exit

        while(!sentinel) {
            System.out.print("Masukkan Pesan      : ");
            String pesan = scanner.nextLine();
            if (pesan.equals("EXIT")){ //fungsi exit
                sentinel = true;
            }
            else {
                System.out.printf("Isi Sebenarnya      : %s\n", constructIsiPesanSebenarnya(constructY(constructX(pesan))));
            }
        }
        scanner.close();
    }
}
