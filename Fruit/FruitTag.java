package Fruit;

public class FruitTag extends Fruit{
    private String tag;
    public FruitTag(String nameOfTheFruit, int amountOfTheFruit, String tagKon){
        super(nameOfTheFruit, amountOfTheFruit);
        this.tag = tagKon;
    }

    public FruitTag(String nameOfTheFruit, int amountOfTheFruit){
        super(nameOfTheFruit, amountOfTheFruit);
        FruitTagRandamize();
    }

    public void FruitTagRandamize(){
        this.tag = (String.valueOf(Math.random() * 1000)).substring(0, 2);

    }

    public String getTag(){
        return this.tag;
    } 

    
    public String toString(){
        String compainder = "";
        compainder += this.Fruitname + " amount: " + String.valueOf(amount) + " " + this.tag;
        return compainder;
    }
}