public class Tumbuhan implements MakhlukHidup {
    private boolean punyaBuah;

    /**
     * Getter
     */
    public Tumbuhan(){
        super();
    }

    public Tumbuhan(boolean punyaBuah){
        this.punyaBuah = punyaBuah;
    }
    public boolean getpunyaBuah(){
        return this.punyaBuah;
    }

    //setter
    public void setPunyaBuah (boolean punyaBuah){
        this.punyaBuah = punyaBuah;
    }

    public String makan(){
        return "tumbuhan : nutrisi tanah";
    }

    public String bernafas() {
        return "tumbuhan : karbondioksida";
    }

    public String bergerak(){
        return "tumbuhan : diam";
    }
}
