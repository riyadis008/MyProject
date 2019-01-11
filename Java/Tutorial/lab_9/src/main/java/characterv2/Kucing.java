package characterv2;
import java.math.BigInteger;
//import java.util.*;

public class Kucing {
    protected String name;
    protected BigInteger health;
    protected BigInteger power;
    protected boolean alive = true; //status hidup
    final public BigInteger zerohealth = new BigInteger("0");
    //protected ArrayList<String[]> victim = new ArrayList<String[]>(); //buat simpan history

    public Kucing(String name, String health, String power){
    this.name = name;
    this.health = new BigInteger(health);
    this.power = new BigInteger(power);

	//jika di construct dengan health 0 atau dibawahnya langsung modar
    if(this.health.compareTo(zerohealth)<= 0){
        this.health = zerohealth;
        setAlive(false);
     }
    else {
        this.health = new BigInteger(health);
    }
    }

    /*public void addVictim(String nama, String dmg){
       String[] korban = {nama,dmg};
       victim.add(korban);

    } */

    public String getName() {
        return name;
    }

    public boolean isAlive(){
        return alive;
    }

    public void setAlive(boolean a){
        alive = a ;
    }

    public void setName(String name) {
        if(isAlive()) {
            this.name = name;
        }
    }

    public BigInteger getHealth() {

        return health;
    }

    public void setHealth(String health) {
        BigInteger darah = new BigInteger(health);
        if(isAlive()) {
            if (darah.compareTo(zerohealth) <= 0) {
                this.health = zerohealth;
                setAlive(false);
            } else {
                this.health = new BigInteger(health);
            }
        }
        else {
            this.health=zerohealth;
        }
    }

    public BigInteger getPower() {
        return power;
    }

    public void setPower(String power) {
        if(isAlive()) {
            this.power = new BigInteger(power);
        }
    }

    public void attack(Kucing kucing) {
        if(isAlive()){
            if(kucing.isAlive()){
                //this.addVictim(kucing.getName(),Integer.toString(this.getPower()));
                kucing.health = kucing.health.subtract(this.getPower());
                if(kucing.health.compareTo(zerohealth)<= 0){
                    kucing.health = zerohealth;
                    alive = false;
                }
            }
        }
    }

    public void sleep(){
        final BigInteger forhealth = new BigInteger("200000000000000000000000000000000000");
        if(isAlive()){
            this.health = getHealth().add(forhealth);
        }
        else{
            health = this.getHealth().add(zerohealth);
        }
    }

    public String status(){
        return "Nama\t:"+this.getName()+"\n"+"Health\t:"+this.getHealth()+"\n"+"Power\t:"+this.getPower();

    }
    /*
    public String history(){
        String a="";
        for(String[] s : victim)
            a += s[0] +"\t: "+ s[1] +"\n" ;
     return a;
    }
    */
}
