package Game;


public class Charakter {
    public String name;
    public int health = 100;
    public int toxic = 10;
    public int gold = -10;

    public Charakter(){
        this.name = randomName();
    }

    public static String randomName(){
        String[] names = {"Charles", "Goliath", "Drogon", "Lusiana", "Sauron"};

        //Todo: random Generated number
        
        return names[1];
    }

    public String giveName(){
        return this.name;
    }
    public int giveHealth(){
        return this.health;
    }
    public int giveToxic(){
        return this.toxic;
    }
    public int giveGold(){
        return this.gold;
    }
}
