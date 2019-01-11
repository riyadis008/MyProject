public class Anak extends Manusia    {
    private String derajatSekolah;

    public Anak(){
        super();
    }

    public Anak(String nama, String tmpLahir, int usia, int tb, int bb, String derajatSekolah){
        super(nama,tmpLahir,usia,tb,bb);
        this.derajatSekolah = derajatSekolah;
    }

    /**
     * getter
     */

    public String getDerajatSekolah() {
        return derajatSekolah;
    }

    /**
     * setter
     */

    public void setDerajatSekolah(String derajatSekolah){
        this.derajatSekolah = derajatSekolah;
    }

    /**
     * overrie method
     */
    public String makan(){
        return "anak : hewan";
    }

    public String bernafas() {
        return "anak : oksigen";
    }

    public String bergerak(){
        return "anak : cepat";
    }
}
