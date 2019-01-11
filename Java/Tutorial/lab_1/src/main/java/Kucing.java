//copyright : Riyadi Setiawan
// NPM : 1706106936
// SI - Ekstensi

//membuat class
public class Kucing
{
    String nama,ras;
    int umur;

    //overload untuk parameter class
    public  Kucing(String name, String jenis, int usia)
    {
        nama = name;
        ras = jenis;
        umur = usia;
    }
    // method mengeong
    public String mengeong()
    {
        return "Meooooooonnnnnng";
    }
    //method berjalan
    public String berjalan(int langkah)
    {
        return "Kucingku, " +nama+ " telah berjalan sejauh "+ langkah +" langkah";
    }
    //method menambahkan umur 1 hari untuk setiap method tidur ditambahkan
    public int  tidur()
    {
        return umur++;
    }


    public static void main (String[] args)
    {
        Kucing kucingku = new Kucing("Royya", "Angora", 18);
        System.out.println(kucingku.mengeong());
        System.out.println(kucingku.berjalan(100));
        kucingku.tidur();
        int kcumur = kucingku.umur;

        System.out.printf("\n Kucingku berumur %d hari",kcumur);
    }


}
