package character;

public class KucingBangsawan extends Kucing{
    private String title;

    public KucingBangsawan(String name, int health, int power, String title){
        super(name,health,power);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (isAlive()){
            this.title = title;
        }
    }

    public void execute(KucingRakyat kucing){
        if(isAlive()){
            if (kucing.isAlive()){
                this.addVictim(kucing.getName(),Integer.toString(kucing.getHealth()));
                kucing.setHealth(0);

            }
        }
    }

    public String status(){
        return super.status()+"\n"+"Title\t:"+this.getTitle();
    }

}
