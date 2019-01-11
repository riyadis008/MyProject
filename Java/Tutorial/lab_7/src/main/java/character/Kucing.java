package character;
import java.util.*;

public class Kucing {
    protected String name;
    protected int health;
    protected int power;
    protected boolean alive = true; //status hidup
    protected ArrayList<String[]> victim = new ArrayList<String[]>(); //buat simpan history

    public Kucing(String name, int health, int power){
    this.name = name;
    this.power = power;
	//jika di construct dengan health 0 atau dibawahnya langsung modar
    if(health <=0 ){ 
        this.health = 0;
        setAlive(false);
     }
    else {
        this.health = health; 
    }
    }

    public void addVictim(String nama, String dmg){
       String[] korban = {nama,dmg};
       victim.add(korban);

    }

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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(isAlive()) {
            if (health <= 0) {
                this.health = 0;
                setAlive(false);
            } else {
                this.health = health;
            }
        }
        else {
            this.health=0;
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(isAlive()) {
            this.power = power;
        }
    }

    public void attack(Kucing kucing) {
        if(isAlive()){
            if(kucing.isAlive()){
                this.addVictim(kucing.getName(),Integer.toString(this.getPower()));
                kucing.setHealth(kucing.getHealth()-this.getPower());
            }
        }
    }

    public void sleep(){
        if(isAlive()){
            health+=20;
        }
        else{
            health+=0;
        }
    }

    public String status(){
        return "Nama\t:"+this.getName()+"\n"+"Health\t:"+this.getHealth()+"\n"+"Power\t:"+this.getPower();

    }

    public String history(){
        String a="";
        for(String[] s : victim)
            a += s[0] +"\t: "+ s[1] +"\n" ;
     return a;
    }
}
