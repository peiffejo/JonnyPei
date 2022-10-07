package tool;
import java.util.Scanner;

public class Eingabecontroler{
    Scanner in = new Scanner(System.in);
    public String IsYesNO(String sentence, String whatIsIt){
        sentence = sentence.toLowerCase();
    
        if(whatIsIt.equals("YN")){
        while(!(sentence.equals("yes") || sentence.equals("no"))){
            System.out.println("Bitte nur Yes oder No");
            sentence = in.nextLine();
            sentence = sentence.toLowerCase();
        }
        }

        if(whatIsIt.equals("StarterQ")){
            while(!(sentence.equals("xx")||sentence.equals("start"))){
                System.out.println("Bitte geben Sie 'Start' oder 'XX' ein.\n");
                sentence = in.nextLine();
                sentence = sentence.toLowerCase();
                } 
        }
     
        return sentence;
    }
}