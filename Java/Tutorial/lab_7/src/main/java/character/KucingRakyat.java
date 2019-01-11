package character;

public class KucingRakyat extends Kucing {
    public KucingRakyat(String name, int health, int power){
        super(name,health,power);
    }

    public void payTax(){
        if(isAlive()){
            this.setHealth(this.getHealth()-20);
        }
    }
}
