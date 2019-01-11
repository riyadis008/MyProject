package character;

public class KucingPrajurit extends KucingRakyat {
    public KucingPrajurit (String name, int health, int power){
        super(name,health,power);
    }

    public void attack(Kucing kucing){
        if(isAlive()){
            if(kucing.isAlive()){
                kucing.setHealth(kucing.getHealth()-(this.getPower()*2));
                this.addVictim(kucing.getName(),Integer.toString(this.getPower()*2));
            }
        }
    }
}
