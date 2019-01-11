public class Herbivora extends Hewan {

    public Herbivora(){
        super();
    }

    public Herbivora(int j){
        super(j);
    }
    /**
     * method
     */
    public String makan(){
        return "herbivora : tumbuhan";
    }

    public String bernafas() {
        return "herbivora : oksigen";
    }

    public String bergerak(){
        return "herbivora : cepat";
    }
}
