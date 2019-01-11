package characterv2;

import java.math.BigInteger;

public class KucingRakyat extends Kucing {
    public KucingRakyat(String name, String health, String power){
        super(name,health,power);
    }

    public void payTax(){
        final BigInteger fortax = new BigInteger("200000000000000000000000000000000000");
        if(isAlive()){
            this.health = this.health.subtract(fortax);
        }
    }
}
