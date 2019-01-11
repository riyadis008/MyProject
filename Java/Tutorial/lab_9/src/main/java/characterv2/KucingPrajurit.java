package characterv2;

public class KucingPrajurit extends KucingRakyat {
    public KucingPrajurit (String name, String health, String power){
        super(name,health,power);
    }

    public void attack(Kucing kucing){
        if(isAlive()){
            if(kucing.isAlive()){
                kucing.health = kucing.health.subtract(this.power.add(this.power));
                if(kucing.health.compareTo(zerohealth)<= 0){
                    kucing.health = zerohealth;
                    alive = false;
                }
                //this.addVictim(kucing.getName(),Integer.toString(this.getPower()*2));
            }
        }
    }
}
