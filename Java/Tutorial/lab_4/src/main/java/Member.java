/**
 * @author Riyadi Setiawan - 1706106936
 */
public class Member {

    //variable attribut member
    int nomor;
    String nama;
    int umur;
    int saldo ;
    boolean memberTutup; //cek member aktif atau tidak

    //variable hitung berapa banyak objek
    static int totalmember;

   public Member(int n, String nm,int age){ //override tanpa inisialisasi saldo
    nomor = n;
    nama = nm;
    umur = age;
    saldo = 50000;
    memberTutup = false ;
    totalmember ++;
   }

    public Member(int n, String nm,int age, int balance ){ //override jika saldo di inisialisasi
     nomor = n;
     nama = nm;
     umur = age;
     saldo = balance;
     memberTutup = false;
     totalmember++;
    }

    public boolean isMemberTutup(){
       return this.memberTutup;
    }

    public  int getUmur(){
       return this.umur;
    }
    public int getSaldo(){
        return saldo;
    }

    public String getNama(){
        return nama;
    }

    public int getNomorMember(){
        return nomor;
    }

    public void setUmur(int age){
       if ( age <50){
           this.umur = age;
       }
       else {
           System.out.println(getNama() +" terlalu tua untuk menjadi member");
           tutupMember(); //otomatis nonaktif member keitka diatas 50 tahun
       }
    }

    public void topUpSaldo (int nominal){
        if(isMemberTutup() == false) {
            this.saldo += nominal;
            System.out.println(getNama() + " berhasil top up saldo");
            System.out.println("Saldo " + getNama() + " saat ini " + getSaldo());
        }
        else {
            System.out.println("Member atas nama "+ getNama()+ " telah ditutup");
        }

    }
    //method kirim saldo
    public void kirimSaldo(Member a, int uang){
       if(a.memberTutup == false) {
           if(this.saldo >= uang) { //jika saldo lebih besar atau sama dengan nominal yang dikirim
               a.saldo += uang;
               this.saldo -= uang;
               System.out.println(getNama() + " telah berhasil mengirim saldo ke " + a.getNama() + " sebesar " + uang);
               System.out.println("Saldo " + getNama() + " saat ini " + getSaldo());
               System.out.println("Saldo " + a.getNama() + " saat ini " + a.getSaldo());
           }
           else { //jika saldo kurang
               System.out.println("Saldo kurang, gagal mengirimkan saldo");
           }
       }
       else {
           System.out.println("Member atas nama "+ getNama()+ " telah ditutup");
       }

    }
    //method tutup member
    public void tutupMember() {
       this.memberTutup = true;
       totalmember -=1;
       System.out.println("Member atas nama "+ getNama()+ " telah resmi ditutup");
       System.out.println("Banyak member sekarang\t: "+totalmember);

    }
    //mengembalikan info objek berupa string
     public String toString(){
       if(isMemberTutup() == false) {
           return "Nomor Member\t: " + getNomorMember() + "\nNama\t\t\t: " + getNama() + "\nUmur\t\t\t: " + getUmur() + "\nSaldo\t\t\t: " + getSaldo();
       }
       else {
           return "Member atas nama "+getNama()+" telah ditutup";
       }
     }
}

