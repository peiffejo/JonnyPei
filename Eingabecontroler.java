import java.util.Scanner;

public class Eingabecontroler{
    Scanner in = new Scanner(System.in);
    public String IsYesNO(String sentence){
        sentence = sentence.toLowerCase();
        while(!(sentence.equals("yes") || sentence.equals("no"))){
            System.out.println("Bitte nur Yes oder No");
            sentence = in.nextLine();
            sentence = sentence.toLowerCase();
        }
        return sentence;
    }
}