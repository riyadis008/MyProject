public class Hewan implements MakhlukHidup {
    protected int jumlahkaki;

    public Hewan(){
    }

    public Hewan(int jumlahkaki){
        this.jumlahkaki = jumlahkaki;
    }

    /**
     * getter
     */

    public int getJumlahKaki(){
        return this.jumlahkaki;
    }
    /*
    setter
     */
    public void setJumlahkaki(int jumlahkaki){
        this.jumlahkaki = jumlahkaki;
    }
    /*
    method
     */

    public String makan(){
        return "hewan : hewan dan tumbuhan";
    }

    public String bernafas() {
        return "hewan : oksigen";
    }

    public String bergerak(){
        return "hewan : cepat";
    }
}
