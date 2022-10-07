package Game;
import java.util.Scanner;
import tool.Eingabecontroler;

    
public class start {
    public static void main(String[] args) {
    Eingabecontroler controler = new Eingabecontroler();
    Scanner in = new Scanner(System.in);
    String answer = controler.IsYesNO(in.nextLine(), "YN");

}
}
