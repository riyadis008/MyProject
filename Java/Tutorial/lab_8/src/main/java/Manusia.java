public class Manusia implements MakhlukHidup {
    protected String nama, tmpLahir;
    protected int usia, tb, bb ;

    public Manusia(){

    }


    public Manusia(String nama, String tmpLahir, int usia, int tb, int bb){
        this.nama = nama;
        this.tmpLahir = tmpLahir;
        this.usia = usia;
        this.tb = tb;
        this.bb = bb;
    }

    /**
     *Getter
     */
    public String getNama(){
        return this.nama;
    }

    public String getTmpLahir(){
        return this.tmpLahir;
    }

    public int getUsia(){
        return this.usia;
    }

    public int getTb(){
        return this.tb;
    }

    public  int getBb(){
        return this.bb;
    }

    /**
     * Setter attribut
     */

    public void setNama( String nama){
        this.nama = nama;
    }

    public void setTmpLahir(String tmpLahir){
        this.tmpLahir = tmpLahir;
    }

    public void setUsia (int usia){
        this.usia = usia;
    }

    public void setTb(int tb){
        this.tb = tb;
    }

    public  void setBb(int bb){
        this.bb = bb;
    }

    /**
     * Method manusia
     */

    public String makan(){
        return "manusia : hewan dan tumbuhan";
    }

    public String bernafas() {
        return "manusia : oksigen";
    }

    public String bergerak(){
        return "manusia : sedang";
    }


}
