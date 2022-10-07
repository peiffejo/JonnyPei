/**Saves the specific Fruit and the amount.
 * 
 * @param String Fruitname
 * @param Integer amount
 * 
 * 
 */
public class Fruit {
    
    private String Fruitname;
    private Integer amount;

    public Fruit(String nameOfTheFruit, int amountOfTheFruit){
        this.Fruitname = nameOfTheFruit;
        this.amount = amountOfTheFruit;
    }

    public String toString(){
        String compainder = "";
        compainder += Fruitname + " amount: " + String.valueOf(amount);
        return compainder;
    }
}