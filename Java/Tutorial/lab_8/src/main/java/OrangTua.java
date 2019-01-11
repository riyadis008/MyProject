import java.util.ArrayList;
public class OrangTua extends Manusia {
    private String pekerjaan;
    private ArrayList<Anak> Anak = new ArrayList<Anak>();

    public OrangTua(){
        super();
    }
    public OrangTua(String nama, String tmpLahir, int usia, int tb, int bb, String pekerjaan, Anak a){
        super(nama,tmpLahir,usia,tb,bb);
        this.pekerjaan = pekerjaan;
        this.Anak.add(a);
    }

    /**
     * Getter
     */
    public String getPekerjaan(){
        return pekerjaan;
    }

    public ArrayList<Anak> getAnak() {
        return Anak;
    }

    /**
     * Setter
     */

    public void setPekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }

    public void setAnak(Anak a){
        Anak.add(a);
    }

    /**
     * override method
     */

    public String makan(){
        return "orang tua : tumbuhan";
    }

    public String bernafas() {
        return "orang tua : oksigen";
    }

    public String bergerak(){
        return "orang tua : lambat";
    }
}
